package am.itspace.newfeaturesinjava8.service.lambda;

import am.itspace.newfeaturesinjava8.interfaces.Printer;
import am.itspace.newfeaturesinjava8.interfaces.UserFactory;
import am.itspace.newfeaturesinjava8.model.User;
import org.springframework.stereotype.Service;

@Service
public class MethodRefrence {

    public void staticMethodReferences() {
        Printer staticPrinter = MethodRefrence::staticPrint;
        staticPrinter.print("Hello, this is static method.");
    }

    public void instanceMethodReferences() {
        MethodRefrence methodRefrence = new MethodRefrence();
        Printer nonStaticPrinter = methodRefrence::nonStaticPrint;
        nonStaticPrinter.print("Hello, this is non-static method.");
    }

    public void constructorReferences() {
        UserFactory userFactory = User::new;
        User user = userFactory.create(29, "Poxos");
        System.out.println(user);
    }

    private static void staticPrint(String s) {
        System.out.println(s);
    }

    private void nonStaticPrint(String s) {
        System.out.println(s);
    }
}
