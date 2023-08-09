package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DoneExerciseService;
import to.DoneExerciseTo;

import java.util.List;

@RestController
public class DoneExerciseController {

	@Autowired
	private DoneExerciseService service;

	public DoneExerciseController() {
	}

	public DoneExerciseController(DoneExerciseService service) {
		this.service = service;
	}

	@GetMapping("/doneExerciseList")
	public List<DoneExerciseTo> getDoneExercisesList() {

		List<DoneExerciseTo> result = service.getDoneExercisesList();

		return result;
	}

	public DoneExerciseService getService() {
		return service;
	}

	public void setService(DoneExerciseService service) {
		this.service = service;
	}
}
