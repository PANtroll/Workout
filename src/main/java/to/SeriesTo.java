package to;

import java.util.Objects;

public class SeriesTo {


    private Long id;
    private Integer repeats;

    public SeriesTo(Long id, Integer repeats) {
		this.id = id;
		this.repeats = repeats;
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
        if (!(o instanceof SeriesTo series)) return false;
		return Objects.equals(getId(), series.getId()) && Objects.equals(getRepeats(), series.getRepeats());
    }

    @Override
    public int hashCode() {
		return Objects.hash(getId(), getRepeats());
    }
}
