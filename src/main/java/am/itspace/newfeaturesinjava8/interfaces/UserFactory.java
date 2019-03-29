package am.itspace.newfeaturesinjava8.interfaces;


import am.itspace.newfeaturesinjava8.model.User;

@FunctionalInterface
public interface UserFactory {

    User create(int age, String name);

    default int getAge(User user) {
        return user.getAge();
    }

    static String getName(User user){
        return user.getName();
    }
}
