package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.util.Date;
import java.util.Objects;

@Entity
public class DoneExercise extends BaseExercise {

    @Column
    private Date date;

    @Column
    private Integer numberOfSeries;

    @ManyToOne
    private Series series;

    @ManyToOne
    private BaseExercise baseExercise;

    public DoneExercise(Long id, String name, Date date, Integer numberOfSeries, Series series, BaseExercise baseExercise) {
        super(id, name);
        this.date = date;
        this.numberOfSeries = numberOfSeries;
        this.series = series;
        this.baseExercise = baseExercise;
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

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public BaseExercise getBaseExercise() {
        return baseExercise;
    }

    public void setBaseExercise(BaseExercise baseExercise) {
        this.baseExercise = baseExercise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DoneExercise that = (DoneExercise) o;
        return Objects.equals(date, that.date) && Objects.equals(numberOfSeries, that.numberOfSeries) && Objects.equals(series, that.series) && Objects.equals(baseExercise, that.baseExercise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), date, numberOfSeries, series, baseExercise);
    }
}
