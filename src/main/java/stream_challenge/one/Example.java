package stream_challenge.one;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private int id;
    private List<ExampleInside> listExampleInside = new ArrayList<>();

    public Example() {
    }

    public Example(int id) {
        this.id = id;
    }

    public Example(int id, List<ExampleInside> listExampleInside) {
        this.id = id;
        this.listExampleInside = listExampleInside;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ExampleInside> getListExampleInside() {
        return listExampleInside;
    }

    public void setListExampleInside(List<ExampleInside> listExampleInside) {
        this.listExampleInside = listExampleInside;
    }
}
