package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ExerciseService;
import to.PlanedExerciseTo;

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
	public List<PlanedExerciseTo> getExercisesList() {
		return service.getExercisesList();
	}

	@GetMapping("/get/{exerciseId}")
	public PlanedExerciseTo getExercise(@PathVariable("exerciseId") Long exerciseId) {
		return service.getExercise(exerciseId);
	}

	@PostMapping("/add")
	public PlanedExerciseTo createExercise(@RequestBody PlanedExerciseTo planedExerciseTo) {
		return service.createExercise(planedExerciseTo);
	}

	@PutMapping("/edit")
	public PlanedExerciseTo editExercise(@RequestBody PlanedExerciseTo planedExerciseTo) {
		return service.editExercise(planedExerciseTo);
	}

	@DeleteMapping("/delete/{exerciseId}")
	public boolean deleteExercise(@PathVariable("exerciseId") Long exerciseId) {
		return service.deleteExercise(exerciseId);
	}
}

