package am.itspace.newfeaturesinjava8.service.lambda;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ForEach {

    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    public void printNumbersBeforeJava8() {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public void printNumbersWithLambdas() {
        numbers.forEach(number -> System.out.print(number));
    }

    public void printNumbersWithMethodReferences() {
        numbers.forEach(System.out::println);
    }

}
