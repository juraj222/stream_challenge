package stream_challenge.one;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExampleInside {
    private int id;
    private List<LocalDate> dates = new ArrayList<>();

    public ExampleInside() {
    }

    public ExampleInside(int id) {
        this.id = id;
    }

    public ExampleInside(int id, List<LocalDate> dates) {
        this.id = id;
        this.dates = dates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<LocalDate> getDates() {
        return dates;
    }

    public void setDates(List<LocalDate> dates) {
        this.dates = dates;
    }
}
