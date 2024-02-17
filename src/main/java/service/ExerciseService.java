package service;

import dao.IExerciseDao;
import model.PlanedExercise;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import to.PlanedExerciseTo;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {

	private IExerciseDao dao;

	private ModelMapper modelMapper = new ModelMapper();

	@Autowired
	public ExerciseService(IExerciseDao dao) {
		this.dao = dao;
	}

	public List<PlanedExerciseTo> getExercisesList() {
		List<PlanedExercise> result = dao.findAll();
		return result.stream().map(exercise -> modelMapper.map(exercise, PlanedExerciseTo.class)).toList();
	}

	public PlanedExerciseTo getExercise(Long exerciseId) {
		Optional<PlanedExercise> exerciseDao = dao.findById(exerciseId);
		if (exerciseDao.isEmpty()) {
			return null;
		}
		PlanedExerciseTo planedExerciseTo = modelMapper.map(exerciseDao.get(), PlanedExerciseTo.class);
		return planedExerciseTo;
	}

	public PlanedExerciseTo createExercise(PlanedExerciseTo planedExerciseTo) {
		PlanedExercise planedExerciseDao = modelMapper.map(planedExerciseTo, PlanedExercise.class);
		PlanedExercise createdExercise = dao.save(planedExerciseDao);
		return modelMapper.map(createdExercise, PlanedExerciseTo.class);
	}

	public PlanedExerciseTo editExercise(PlanedExerciseTo planedExerciseTo) {
		PlanedExercise planedExerciseDao = modelMapper.map(planedExerciseTo, PlanedExercise.class);
		PlanedExercise editedExercise = dao.save(planedExerciseDao);
		return modelMapper.map(editedExercise, PlanedExerciseTo.class);
	}

	public boolean deleteExercise(Long exerciseId) {
		dao.deleteById(exerciseId);
		return !dao.existsById(exerciseId);
	}
}
