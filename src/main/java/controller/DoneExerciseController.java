package controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.DoneExerciseService;
import to.DoneExerciseTo;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/doneExercise")
public class DoneExerciseController {

	@Autowired
	private DoneExerciseService service;

	public DoneExerciseController() {
	}

	public DoneExerciseController(DoneExerciseService service) {
		this.service = service;
	}

	@GetMapping("/list")
	public List<DoneExerciseTo> getDoneExercisesList() {

		List<DoneExerciseTo> result = service.getDoneExercisesList();

		return result;
	}

	@PostMapping("/add")
//	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public DoneExerciseTo addDoneExercise(@RequestBody DoneExerciseTo newExercise, HttpServletResponse response) throws IOException {

		DoneExerciseTo doneExercise = service.createDoneExercise(newExercise);
		if (doneExercise == null) {
			response.sendError(HttpServletResponse.SC_CONFLICT);
			return null;
		}
		response.sendError(HttpServletResponse.SC_CREATED);
		return doneExercise;
	}

	public DoneExerciseService getService() {
		return service;
	}

	public void setService(DoneExerciseService service) {
		this.service = service;
	}
}
