package am.itspace.newfeaturesinjava8.util;

import am.itspace.newfeaturesinjava8.model.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UsersUtil {

    public static List<User> users(){
        return Arrays.asList(
                new User(39,"valod"),
                new User(15,"poxos"),
                new User(24,"aram"),
                new User(15,"petros"),
                new User(15,"martiros"),
                new User(24,"poxos"),
                new User(39,"aram")
        );
    }

}
