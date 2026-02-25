package primary_qualifier;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService{

    @Override
    public void sendMsg(String message){
        System.out.println("SMS: "+message);
    }

}
