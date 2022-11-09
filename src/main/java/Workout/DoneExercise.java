package Workout;

import java.time.LocalDate;
import java.util.Arrays;

public class DoneExercise {

    private LocalDate data;
    private String name;
    private Integer series;
    private Integer[] repeats;
    private String description = "";

    public DoneExercise(LocalDate data, String name, Integer series, Integer[] repeats, String description) {
        this.data = data;
        this.name = name;
        this.series = series;
        this.repeats = repeats;
        this.description = description;
    }

    public DoneExercise(LocalDate data, String name, Integer series, Integer[] repeats) {
        this.data = data;
        this.name = name;
        this.series = series;
        this.repeats = repeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer[] getRepeats() {
        return repeats;
    }

    public void setRepeats(Integer[] repeats) {
        this.repeats = repeats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toLog() {

        return data + "\t" + name + " Series: " + series + "\t" + Arrays.toString(repeats) + " " + description;
    }

    @Override
    public String toString() {
        return "DoneExercise{" +
                "data=" + data +
                ", name='" + name + '\'' +
                ", series=" + series +
                ", repeats=" + Arrays.toString(repeats) +
                ", description='" + description + '\'' +
                '}';
    }
}
