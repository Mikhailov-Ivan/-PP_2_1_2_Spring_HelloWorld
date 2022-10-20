import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);
        System.out.printf("catBean1 (%s) = catBean2 (%s) ? - "
                + (catBean1 == catBean2), catBean1, catBean2);
        System.out.println();
        System.out.printf("HelloWorldBean1 (%s) = HelloWorldBean2 (%s) ? - "
                + (bean == bean1), bean, bean1);
    }
}