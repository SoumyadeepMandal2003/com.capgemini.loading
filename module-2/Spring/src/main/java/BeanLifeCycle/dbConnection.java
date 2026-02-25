package BeanLifeCycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public class dbConnection {
    public dbConnection(){
        System.out.println("dbConstructor is being called");
    }

    @PostConstruct
    public void init(){
        System.out.println("Called just after Constructor");
    }

    public void executeQuery(){
        System.out.println("Operation Successful : Query is being executed!!");
        System.out.println("SELECT * FROM students");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Just Destroyed before context closed");
    }

}
