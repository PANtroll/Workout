package model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "series")
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
