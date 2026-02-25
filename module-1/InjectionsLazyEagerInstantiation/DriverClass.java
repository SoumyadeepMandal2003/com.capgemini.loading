
import java.util.Scanner;

public class DriverClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        byte userChoice = sc.nextByte();
        sc.nextLine();

        //Eager Inst.
        Car car = new Car();
        Engine engine = null;
        switch(userChoice){
            case 1:
                //Lazy Inst.
                engine = new PetrolEngine();
                break;
            case 2:
                //Lazy Inst.
                engine = new DieselEngine();
                break;
        }

        //field inj.
        // car.engine = engine;

        // car.engine.run();
        // System.out.println(car.engine.getClass());

        car.setEngine(engine);
        car.getEngine().run();
        System.out.println(car.getEngine().getClass());

        // Constructor Inj.
        Car car2 = new Car(engine);
        car2.getEngine().run();
        System.out.println(car2.getEngine().getClass());

    }
}