package am.itspace.newfeaturesinjava8.service.lambda;

import am.itspace.newfeaturesinjava8.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

import static am.itspace.newfeaturesinjava8.util.UsersUtil.users;

@Service
public class Java8Sort {

    public void sortUsersByAge() {
        sortByAgeWithJava8(users());
    }

    public void sortUsersByName() {
        sortByNameWithJava8(users());
    }

    private static void sortByAgeWithJava8(List<User> users) {
        users.sort((o1, o2) -> {
            if (o1.getAge() == o2.getAge()) {
                return o1.getAge() - o2.getAge();
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    private static void sortByNameWithJava8(List<User> users) {
        users.sort(((o1, o2) -> {
            if (o1.getName().equals(o2.getName())) {
                return o1.getAge() - o2.getAge();
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        }));
    }

}
