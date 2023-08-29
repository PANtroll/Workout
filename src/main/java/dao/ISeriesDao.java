package dao;

import model.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISeriesDao extends JpaRepository<Series, Long> {
}
