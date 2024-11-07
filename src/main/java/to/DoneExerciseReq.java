package to;

import java.util.Date;
import java.util.Objects;

public class DoneExerciseReq extends BaseExerciseTo {

    private Date date;

    private Integer numberOfSeries;

    private Integer series;

    public DoneExerciseReq() {
    }

    public DoneExerciseReq(Long id, String name, Date date, Integer numberOfSeries, Integer seriesId) {
        super(id, name);
        this.date = date;
        this.numberOfSeries = numberOfSeries;
        this.series = seriesId;
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

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof DoneExerciseReq that))
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
