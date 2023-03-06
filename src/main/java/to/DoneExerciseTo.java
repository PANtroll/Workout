package to;

import java.util.Date;
import java.util.Objects;

public class DoneExerciseTo extends BaseExerciseTo {

    private Date date;

    private Integer numberOfSeries;

    private Long seriesId;

    private Long baseExerciseId;

    public DoneExerciseTo(Long id, String name, Date date, Integer numberOfSeries, Long seriesId, Long baseExerciseId) {
        super(id, name);
        this.date = date;
        this.numberOfSeries = numberOfSeries;
        this.seriesId = seriesId;
        this.baseExerciseId = baseExerciseId;
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

    public Long getBaseExerciseId() {
        return baseExerciseId;
    }

    public void setBaseExerciseId(Long baseExerciseId) {
        this.baseExerciseId = baseExerciseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DoneExerciseTo that)) return false;
        return Objects.equals(getDate(), that.getDate()) && Objects.equals(getNumberOfSeries(), that.getNumberOfSeries()) && Objects.equals(getSeriesId(), that.getSeriesId()) && Objects.equals(getBaseExerciseId(), that.getBaseExerciseId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getNumberOfSeries(), getSeriesId(), getBaseExerciseId());
    }
}
