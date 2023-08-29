package service;

import dao.IExerciseDao;
import model.Exercise;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import to.ExerciseTo;

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

	public List<ExerciseTo> getExercisesList() {
		List<Exercise> result = dao.findAll();
		return result.stream().map(exercise -> modelMapper.map(exercise, ExerciseTo.class)).toList();
	}

	public ExerciseTo getExercise(Long exerciseId) {
		Optional<Exercise> exerciseDao = dao.findById(exerciseId);
		if (exerciseDao.isEmpty()) {
			return null;
		}
		ExerciseTo exerciseTo = modelMapper.map(exerciseDao.get(), ExerciseTo.class);
		return exerciseTo;
	}

	public ExerciseTo createExercise(ExerciseTo exerciseTo) {
		Exercise exerciseDao = modelMapper.map(exerciseTo, Exercise.class);
		Exercise createdExercise = dao.save(exerciseDao);
		return modelMapper.map(createdExercise, ExerciseTo.class);
	}

	public ExerciseTo editExercise(ExerciseTo exerciseTo) {
		Exercise exerciseDao = modelMapper.map(exerciseTo, Exercise.class);
		Exercise editedExercise = dao.save(exerciseDao);
		return modelMapper.map(editedExercise, ExerciseTo.class);
	}

	public boolean deleteExercise(Long exerciseId) {
		dao.deleteById(exerciseId);
		return !dao.existsById(exerciseId);
	}
}
