package primary_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendMsg(String message){
        System.out.println("Email: "+message);
    }
}
