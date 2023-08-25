package dao;

import model.DoneExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoneExerciseDao extends JpaRepository<DoneExercise, Integer> {
}
