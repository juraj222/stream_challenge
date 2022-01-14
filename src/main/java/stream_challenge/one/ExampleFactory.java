package stream_challenge.one;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExampleFactory {
    public static Optional<List<Example>> prepareData() {
        ExampleInside exampleInsideA = new ExampleInside(1);
        exampleInsideA.getDates().add(LocalDate.of(2021, 4, 5));
        exampleInsideA.getDates().add(LocalDate.of(2021, 9, 7));
        ExampleInside exampleInsideB = new ExampleInside(2);
        exampleInsideB.getDates().add(LocalDate.of(2021, 3, 1));
        exampleInsideB.getDates().add(LocalDate.of(2021, 3, 2));
        exampleInsideB.getDates().add(LocalDate.of(2021, 3, 3));
        Example exampleA = new Example(1);
        exampleA.getListExampleInside().add(exampleInsideA);
        exampleA.getListExampleInside().add(exampleInsideB);

        ExampleInside exampleInsideC = new ExampleInside(1);
        exampleInsideC.getDates().add(LocalDate.of(2020, 1, 1));
        exampleInsideC.getDates().add(LocalDate.of(2022, 1, 1));
        ExampleInside exampleInsideD = new ExampleInside(2);
        exampleInsideD.getDates().add(LocalDate.of(2021, 4, 1));
        exampleInsideD.getDates().add(LocalDate.of(2021, 4, 2));
        exampleInsideD.getDates().add(LocalDate.of(2021, 4, 3));
        Example exampleB = new Example(2);
        exampleB.getListExampleInside().add(exampleInsideC);
        exampleB.getListExampleInside().add(exampleInsideD);

        Example exampleC = new Example(3);
        ExampleInside exampleInsideE = new ExampleInside(1);
        exampleInsideE.getDates().add(LocalDate.of(2020, 1, 1));
        exampleInsideE.getDates().add(LocalDate.of(2019, 1, 2));
        ExampleInside exampleInsideF = new ExampleInside(2);
        exampleC.getListExampleInside().add(exampleInsideE);
        exampleC.getListExampleInside().add(exampleInsideF);

        List<Example> examples = new ArrayList<>();
        examples.add(exampleA);
        examples.add(exampleB);
        examples.add(exampleC);

        return Optional.of(examples);
    }

}
