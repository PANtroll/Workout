package to;

import java.util.Date;
import java.util.Objects;

public class DoneExerciseTo extends BaseExerciseTo {

    private Date date;

    private Integer numberOfSeries;

    private Long seriesId;

    public DoneExerciseTo() {
    }

    public DoneExerciseTo(Long id, String name, Date date, Integer numberOfSeries, Long seriesId) {
        super(id, name);
        this.date = date;
        this.numberOfSeries = numberOfSeries;
        this.seriesId = seriesId;
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

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof DoneExerciseTo that))
            return false;
        if (!super.equals(o))
            return false;
        return Objects.equals(date, that.date) && Objects.equals(numberOfSeries, that.numberOfSeries) && Objects.equals(seriesId,
                that.seriesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), date, numberOfSeries, seriesId);
    }
}
