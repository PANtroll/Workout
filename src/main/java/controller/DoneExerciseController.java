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

    private final DoneExerciseService service;

    @Autowired
    public DoneExerciseController(DoneExerciseService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public List<DoneExerciseTo> getDoneExercisesList() {

        List<DoneExerciseTo> result = service.getDoneExercisesList();

        return result;
    }

    @GetMapping("/get/{id}")
    public DoneExerciseTo getDoneExercise(@PathVariable(required = false, name = "id") String id, HttpServletResponse response) {
        Long doneExerciseId = Long.parseLong(id);
        DoneExerciseTo doneExercise = service.getDoneExercise(doneExerciseId);
        if (doneExercise == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
        return doneExercise;
    }

    @PostMapping("/add")
    public DoneExerciseTo addDoneExercise(@RequestBody DoneExerciseTo newExercise, HttpServletResponse response) throws IOException {

        DoneExerciseTo doneExercise = service.createDoneExercise(newExercise);
        if (doneExercise == null) {
            response.sendError(HttpServletResponse.SC_CONFLICT);
            return null;
        }
        response.sendError(HttpServletResponse.SC_CREATED);
        return doneExercise;
    }

    @PutMapping("/edit")
    public DoneExerciseTo editDoneExercise(@RequestBody DoneExerciseTo doneExerciseTo) {
        return service.editDoneExercise(doneExerciseTo);
    }

    @DeleteMapping("/delete/{doneExerciseId}")
    public boolean deleteDoneExercise(@PathVariable(required = false, name = "doneExerciseId") Long doneExerciseId) {
        return service.deleteDoneExercise(doneExerciseId);
    }

}
