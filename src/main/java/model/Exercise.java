package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "exercise")
public class Exercise extends BaseExercise{

    @Column
    private Integer series;

    @Column
    private Integer repeats;

    public Exercise(Long id, String name, Integer series, Integer repeats) {
        super(id, name);
        this.series = series;
        this.repeats = repeats;
    }

    public Exercise() {

    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getRepeats() {
        return repeats;
    }

    public void setRepeats(Integer repeats) {
        this.repeats = repeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exercise exercise)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(series, exercise.series) && Objects.equals(repeats, exercise.repeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), series, repeats);
    }
}
