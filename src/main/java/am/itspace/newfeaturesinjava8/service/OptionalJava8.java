package am.itspace.newfeaturesinjava8.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
public class OptionalJava8 {

    public void optionalOf() {

        Optional<String> name = Optional.of("Poxos");
        System.out.println(name); // output Optional[Poxos]

    }

    public void optionalNullable() {

        Optional<String> name = Optional.ofNullable(null);
        System.out.println(name); //output Optional.empty

    }

    public void optionalIfPresent() {

        Optional<String> name = Optional.of("Poxos");
        name.ifPresent(System.out::println);

    }

    public void optionalOrElse() {

        Optional<String> name = Optional.of("Poxos");
        System.out.println(name.orElse("Valod")); // output Poxos

        Optional<String> emptyName = Optional.empty();
        System.out.println(emptyName.orElse("Valod")); // output Valod

    }

    public void optionalOrElseThrow() {

        Optional<String> optionalName = Optional.empty();
        String name = optionalName.orElseThrow(RuntimeException::new);
        System.out.println(name); // throws runtime exception

    }

    public void optionalMap() {

        Optional<String> name = Optional.of("poxos");
        System.out.println(name.map(String::toUpperCase));

    }


}
