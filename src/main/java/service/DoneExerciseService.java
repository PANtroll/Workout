package service;

import dao.IDoneExerciseDao;
import model.DoneExercise;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import to.DoneExerciseTo;

import java.util.List;

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

	public DoneExerciseTo createDoneExercise(DoneExerciseTo newExercise) {
		DoneExercise doneExerciseDAO = modelMapper.map(newExercise, DoneExercise.class);
		DoneExercise createdDoneExercise = dao.save(doneExerciseDAO);
		return modelMapper.map(createdDoneExercise, DoneExerciseTo.class);
	}

	public IDoneExerciseDao getDao() {
		return dao;
	}

	public void setDao(IDoneExerciseDao dao) {
		this.dao = dao;
	}

}
