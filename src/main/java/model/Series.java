package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Entity
public class Series {

    @Id
    private Long id;

    @Column
    private Integer repeats;

    @ManyToOne
    private Exercise exercise;

    public Series(Long id, Integer repeats, Exercise exercise) {
        this.id = id;
        this.repeats = repeats;
        this.exercise = exercise;
    }

    public Series() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRepeats() {
        return repeats;
    }

    public void setRepeats(Integer repeats) {
        this.repeats = repeats;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Series series)) return false;
        return Objects.equals(getId(), series.getId()) && Objects.equals(getRepeats(), series.getRepeats()) && Objects.equals(getExercise(), series.getExercise());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRepeats(), getExercise());
    }
}
