package dao;

import model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExerciseDao extends JpaRepository<Exercise, Long> {
}
