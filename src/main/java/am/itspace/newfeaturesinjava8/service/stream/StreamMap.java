package am.itspace.newfeaturesinjava8.service.stream;

import am.itspace.newfeaturesinjava8.model.User;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import static am.itspace.newfeaturesinjava8.util.UsersUtil.users;

@Service
public class StreamMap {

    public void printAllUsersNames() {
        users().stream()
                .map(User::getName)
                .forEach(System.out::println);
    }

    public void capitalizeUsersNames() {

        users().stream()
                .map(User::getName)
                .map(StringUtils::capitalize)
                .forEach(System.out::println);
    }

}
