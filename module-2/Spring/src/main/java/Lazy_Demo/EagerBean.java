package Lazy_Demo;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {
    public EagerBean() {System.out.println("EagerBean has been created");
    }
    public void start(){
        System.out.println("start");
    }
    public void stop(){
        System.out.println("stop");
    }
}
