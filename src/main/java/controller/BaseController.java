package controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import service.DoneExerciseService;
import to.DoneExerciseReq;
import to.DoneExerciseTo;
import to.SeriesTo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
public class BaseController {

    private final DoneExerciseService service;

    @Autowired
    public BaseController(DoneExerciseService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @PostMapping("/addNewExercise")
    public DoneExerciseTo addDoneExercise(@RequestBody DoneExerciseReq newExercise, HttpServletResponse response) throws IOException {
        List seriesList = new ArrayList() {
        };
        for (int i = 0; i < newExercise.getNumberOfSeries(); i++) {
            seriesList.add(new SeriesTo(null, newExercise.getNumberOfSeries(), newExercise.getId()));
        }
        DoneExerciseTo doneExerciseTo = new DoneExerciseTo(null, newExercise.getName(), newExercise.getDate(), newExercise.getNumberOfSeries(), seriesList);

        DoneExerciseTo doneExercise = service.createDoneExercise(doneExerciseTo);
        if (doneExercise == null) {
            response.sendError(HttpServletResponse.SC_CONFLICT);
            return null;
        }
        response.sendError(HttpServletResponse.SC_CREATED);
        return doneExercise;
    }

    @GetMapping("/doneExercise")
    public String getDoneExercises() {
        return "exercise";
    }

}
