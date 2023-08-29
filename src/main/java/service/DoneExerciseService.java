package service;

import dao.IDoneExerciseDao;
import model.DoneExercise;
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

	public DoneExerciseService() {
	}

	@Autowired
	public DoneExerciseService(IDoneExerciseDao dao) {
		this.dao = dao;
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
		DoneExerciseTo doneExerciseTo = modelMapper.map(doneExerciseDao.get(), DoneExerciseTo.class);
		return doneExerciseTo;
	}

	public DoneExerciseTo createDoneExercise(DoneExerciseTo newExercise) {
		DoneExercise doneExerciseDao = modelMapper.map(newExercise, DoneExercise.class);
		DoneExercise createdDoneExercise = dao.save(doneExerciseDao);
		return modelMapper.map(createdDoneExercise, DoneExerciseTo.class);
	}

	public DoneExerciseTo editDoneExercise(DoneExerciseTo doneExerciseTo) {
		DoneExercise doneExerciseDao = modelMapper.map(doneExerciseTo, DoneExercise.class);
		DoneExercise editedDoneExercise = dao.save(doneExerciseDao);
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
