package BeanLifeCycle;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Container Started -----------\n");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(lifeCycleConfig.class);

        System.out.println("\n==== Using Bean ====");
        dbConnection dbConnect = context.getBean(dbConnection.class);
        dbConnect.executeQuery();

        System.out.println("\n========== Container Closing ============");
        context.close();
    }

}
