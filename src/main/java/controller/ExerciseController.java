package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ExerciseService;
import to.ExerciseTo;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

	private ExerciseService service;

	@Autowired
	public ExerciseController(ExerciseService service) {
		this.service = service;
	}

	@GetMapping("/list")
	public List<ExerciseTo> getExercisesList() {
		return service.getExercisesList();
	}

	@GetMapping("/{exerciseId}")
	public ExerciseTo getExercise(@PathVariable Long exerciseId) {
		return service.getExercise(exerciseId);
	}

	@PostMapping("/add")
	public ExerciseTo createExercise(@RequestBody ExerciseTo exerciseTo) {
		return service.createExercise(exerciseTo);
	}

	@PutMapping("/edit")
	public ExerciseTo editExercise(@RequestBody ExerciseTo exerciseTo) {
		return service.editExercise(exerciseTo);
	}

	@DeleteMapping("/delete/{exerciseId}")
	public boolean deleteExercise(@PathVariable Long exerciseId) {
		return service.deleteExercise(exerciseId);
	}
}

