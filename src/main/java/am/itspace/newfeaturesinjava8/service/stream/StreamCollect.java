package am.itspace.newfeaturesinjava8.service.stream;

import am.itspace.newfeaturesinjava8.model.User;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static am.itspace.newfeaturesinjava8.util.UsersUtil.users;

@Service
public class StreamCollect {
    private List<Integer> numbers = Arrays.asList(18, 2, 39, 44, 520, 697, 77, 8, 98, 106);

    public List<Integer> getCoupleNumbers() {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<String> usersNamesToUpperCase() {

        return users().stream()
                .map(User::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public void groupingUsersWithAge() {
        Map<Integer, List<User>> map = users().stream()
                .collect(Collectors.groupingBy(User::getAge));

        map.keySet().stream()
                .map(map::get)
                .forEach(System.out::println);

    }

}
