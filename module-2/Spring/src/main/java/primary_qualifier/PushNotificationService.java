package primary_qualifier;

import org.springframework.stereotype.Component;

public class PushNotificationService implements NotificationService{
    @Override
    public void sendMsg(String message){
        System.out.println("Push Notification: "+message);
    }
}
