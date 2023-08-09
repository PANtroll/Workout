package dao;

import model.DoneExercise;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoneExerciseDAO {

	public DoneExerciseDAO() {
	}

	public List<DoneExercise> getDoneExercisesList() {

		List<DoneExercise> result = new ArrayList<>();

		return result;
	}
}
