package model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "done_exercise")
public class DoneExercise extends BaseExercise implements Serializable {

    @Column
    private Date date;

    @Column
    private Integer numberOfSeries;

    @OneToMany
    @JoinColumn(name = "done_exercise_Id")
    private List<Series> series;

    public DoneExercise(Long id, String name, Date date, Integer numberOfSeries, List<Series> series) {
        super(id, name);
        this.date = date;
        this.numberOfSeries = numberOfSeries;
        this.series = series;
    }

    public DoneExercise() {

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumberOfSeries() {
        return numberOfSeries;
    }

    public void setNumberOfSeries(Integer numberOfSeries) {
        this.numberOfSeries = numberOfSeries;
    }

    public List<Series> getSeries() {
        return series;
    }

    public void setSeries(List<Series> series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof DoneExercise that))
            return false;
        if (!super.equals(o))
            return false;
        return Objects.equals(date, that.date) && Objects.equals(numberOfSeries, that.numberOfSeries) && Objects.equals(series,
                that.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), date, numberOfSeries, series);
    }
}
