package primary_qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryQualifierDemo {
    public static void main(String[] args){
        System.out.println("=== Spring Container Created ===\n");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrimaryQualifierConfig.class);

        NotificationManager manager = context.getBean(NotificationManager.class);

        manager.sendPrimaryNotification("Welcome to Spring");

        manager.sendAllNotifications("Important Update!");

        manager.sendSmsOnly("Your OTP is 123456");

        manager.sendPushOnly("New Message Received");

        context.close();

        System.out.println("\n=== Sontainer Closed ===");
    }

}
