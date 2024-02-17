package service;

import dao.IDoneExerciseDao;
import dao.ISeriesDao;
import model.DoneExercise;
import model.Series;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import to.DoneExerciseTo;

import java.util.List;
import java.util.Optional;

@Service
public class DoneExerciseService {

    private final ModelMapper modelMapper = new ModelMapper();//todo bean
    private IDoneExerciseDao dao;
    private ISeriesDao seriesDao;

    public DoneExerciseService() {
    }

    @Autowired
    public DoneExerciseService(IDoneExerciseDao dao, ISeriesDao seriesDao) {
        this.dao = dao;
        this.seriesDao = seriesDao;
    }

    public List<DoneExerciseTo> getDoneExercisesList() {
        List<DoneExercise> daoList = this.dao.findAll();
        List<DoneExerciseTo> result = daoList.stream().map(dao -> modelMapper.map(dao, DoneExerciseTo.class)).toList();
        return result;
    }

    public DoneExerciseTo getDoneExercise(Long doneExerciseId) {
        Optional<DoneExercise> doneExerciseDao = dao.findById(doneExerciseId);
        if (doneExerciseDao.isEmpty()) {
            return null;
        }
        DoneExercise doneExercise = doneExerciseDao.get();
        DoneExerciseTo doneExerciseTo = modelMapper.map(doneExercise, DoneExerciseTo.class);

        return doneExerciseTo;
    }

    public DoneExerciseTo createDoneExercise(DoneExerciseTo newExercise) {
        DoneExercise doneExerciseDao = modelMapper.map(newExercise, DoneExercise.class);
        DoneExercise createdDoneExercise = dao.save(doneExerciseDao);
        newExercise.getSeries().forEach(obj -> {
            Series series = modelMapper.map(obj, Series.class);
            series.setDoneExercise(createdDoneExercise);
            seriesDao.save(series);
        });
        return modelMapper.map(createdDoneExercise, DoneExerciseTo.class);
    }

    public DoneExerciseTo editDoneExercise(DoneExerciseTo doneExerciseTo) {
        DoneExercise doneExerciseDao = modelMapper.map(doneExerciseTo, DoneExercise.class);
        DoneExercise editedDoneExercise = dao.save(doneExerciseDao);
        doneExerciseTo.getSeries().forEach(obj -> {
            Series series = modelMapper.map(obj, Series.class);
            series.setDoneExercise(editedDoneExercise);
            seriesDao.save(series);
        });
        return modelMapper.map(editedDoneExercise, DoneExerciseTo.class);
    }

    public boolean deleteDoneExercise(Long doneExerciseId) {
        dao.deleteById(doneExerciseId);
        return !dao.existsById(doneExerciseId);
    }

    public IDoneExerciseDao getDao() {
        return dao;
    }

    public void setDao(IDoneExerciseDao dao) {
        this.dao = dao;
    }

}
