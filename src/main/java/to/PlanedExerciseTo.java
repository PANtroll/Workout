package to;

import model.BaseExercise;

import java.util.Objects;

public class PlanedExerciseTo extends BaseExercise {

    private Integer series;

    private Integer repeats;

    public PlanedExerciseTo() {
    }

    public PlanedExerciseTo(Long id, String name, Integer series, Integer repeats) {
        super(id, name);
        this.series = series;
        this.repeats = repeats;
    }

    public PlanedExerciseTo(Integer series, Integer repeats) {
        this.series = series;
        this.repeats = repeats;
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
        if (!(o instanceof PlanedExerciseTo that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getSeries(), that.getSeries()) && Objects.equals(getRepeats(), that.getRepeats());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSeries(), getRepeats());
    }
}
