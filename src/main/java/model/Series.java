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
    private DoneExercise doneExercise;

    public Series(Long id, Integer repeats) {
        this.id = id;
        this.repeats = repeats;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Series series)) return false;
        return Objects.equals(getId(), series.getId()) && Objects.equals(getRepeats(), series.getRepeats());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRepeats());
    }
}
