package am.itspace.newfeaturesinjava8.service.stream;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StreamFind {

    private List<String> strings = Arrays.asList("Java", "Python", "C#", "JavaScript", "Ruby", "C++");

    public Optional<String> getAnyMemberFromList() {

        return strings.stream()
                .findAny();

    }

    public Optional<String> getAnyMemberFromList(String word) {

        return strings.stream()
                .filter(s -> s.contains(word))
                .findAny();

    }

    public Optional<String> getFirsFromList() {

        return strings.stream()
                .findFirst();

    }

    public Optional<String> getFirstFromListByLength(int length) {

        return strings.stream()
                .filter(string -> string.length() > length)
                .findFirst();

    }
}
