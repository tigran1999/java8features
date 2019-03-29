package am.itspace.newfeaturesinjava8.service.lambda;

import am.itspace.newfeaturesinjava8.model.User;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

import static am.itspace.newfeaturesinjava8.util.UsersUtil.users;

@Service
public class Java7Sort {

    public void sortUsersByAge() {
        sortByAgeWithJava7(users());
    }

    public void sortUsersByName() {
        sortByNameWithJava7(users());
    }

    private static void sortByAgeWithJava7(List<User> users) {
        users.sort(new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    private static void sortByNameWithJava7(List<User> users) {
        users.sort(new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

}
