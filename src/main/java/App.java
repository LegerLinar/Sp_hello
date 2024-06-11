import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloBean1 =
                (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(helloBean1.getMessage());

        HelloWorld helloBean2 =
            (HelloWorld) applicationContext.getBean("helloWorld");

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("helloBean1 is same with helloBean2? - "
            + (helloBean1 == helloBean2));
        System.out.println("cat1 is same with cat2? - "
            + (cat1 == cat2));
    }
}