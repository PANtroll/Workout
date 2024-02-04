package to;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class DoneExerciseTo extends BaseExerciseTo {

    private Date date;

    private Integer numberOfSeries;

    private List<SeriesTo> series;

    public DoneExerciseTo() {
    }

    public DoneExerciseTo(Long id, String name, Date date, Integer numberOfSeries, List<SeriesTo> seriesId) {
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

    public List<SeriesTo> getSeries() {
        return series;
    }

    public void setSeries(List<SeriesTo> series) {
        this.series = series;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof DoneExerciseTo that))
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
