package Workout;

import java.util.Date;

public class DoneExercise {

    private Date data;
    private Integer series;
    private Integer repeats;
    private String description = "";

    public DoneExercise(Date data, Integer series, Integer repeats, String description) {
        this.data = data;
        this.series = series;
        this.repeats = repeats;
        this.description = description;
    }

    public DoneExercise(Date data, Integer series, Integer repeats) {
        this.data = data;
        this.series = series;
        this.repeats = repeats;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DoneExercise{" +
                "data=" + data +
                ", series=" + series +
                ", repeats=" + repeats +
                ", description='" + description + '\'' +
                '}';
    }
}
