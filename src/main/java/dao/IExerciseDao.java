package dao;

import model.PlanedExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExerciseDao extends JpaRepository<PlanedExercise, Long> {
}
