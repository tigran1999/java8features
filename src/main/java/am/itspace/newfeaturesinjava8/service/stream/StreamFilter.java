package am.itspace.newfeaturesinjava8.service.stream;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StreamFilter {

    private List<Integer> numbers = Arrays.asList(18, 2, 39, 44, 520, 697, 77, 8, 98, 106);


    public void filterNumbers() {
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }

    public long filteredListMemberCount() {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .count();
    }

    public void multipleFilter() {
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .filter(num -> num < 100)
                .forEach(System.out::println);
    }

}
