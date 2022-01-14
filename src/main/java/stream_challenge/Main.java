package stream_challenge;

import stream_challenge.one.Example;
import stream_challenge.one.ExampleFactory;
import stream_challenge.one.ExampleInside;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        challenge();
    }

    public static LocalDate challenge(){
        Optional<List<Example>> examples = ExampleFactory.prepareData();

        return LocalDate.of(2022, 1, 1);
    }
}
