package service;

import dao.DoneExerciseDAO;
import model.DoneExercise;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import to.DoneExerciseTo;

import java.util.List;

@Service
public class DoneExerciseService {

	@Autowired
	private DoneExerciseDAO dao;
	private ModelMapper modelMapper = new ModelMapper();

	public DoneExerciseService() {
		this.dao = dao;
	}

	public DoneExerciseService(DoneExerciseDAO dao) {
		this.dao = dao;
	}

	public List<DoneExerciseTo> getDoneExercisesList() {
		List<DoneExercise> daoList = this.dao.getDoneExercisesList();
		List<DoneExerciseTo> result = daoList.stream().map(dao -> modelMapper.map(dao, DoneExerciseTo.class)).toList();
		return result;
	}

	public DoneExerciseDAO getDao() {
		return dao;
	}

	public void setDao(DoneExerciseDAO dao) {
		this.dao = dao;
	}

}
