package am.itspace.newfeaturesinjava8.service.stream;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StreamModifiers {

    private List<String> letter = Arrays.asList("d", "d", "c", "c", "b", "b", "a", "a");

    public void removeDuplicateLetters() {

        letter.stream()
                .distinct()
                .forEach(System.out::println);

    }

    public void sortList() {

        letter.stream()
                .sorted()
                .forEach(System.out::println);

    }

    public void sequentialStream() {

        letter.parallelStream()
                .sequential()
                .forEach(System.out::println);

    }

    public void parallelStream() {

        letter.parallelStream()
                .forEach(System.out::println);

    }


}
