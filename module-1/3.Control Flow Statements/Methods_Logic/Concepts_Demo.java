package Methods_Logic;


/*


Methods : Block of statements used to perform a specific task.

Access Modifier / Specifier
Return type of method
Name of method
brackets with/without parameters


Methods can be created only inside global area (class area) but called inside local area (method area).
We can create n no. of method within global area/one class.
Method gets executed when its called/invoked inside local area (method area).
One method can be called n no. of times.



We have 2 types of method:
1.No arguement method:  

2.Parameterized method: 


Actual Method: 

*/








class Concepts_Demo {
    //class area or gbobal area
    public static void main(String[] args) {
        //method area or local area
        System.out.println("Main Method Start");
        powerButton();
        volumeButton();
        powerButton();
        System.out.println("Main Method End");
    }

    public static void powerButton() {
        System.out.println("Power Button Pressed - Phone is ON/OFF");
    }
    public static void volumeButton() {
        System.out.println("Volume Button Pressed - Volume is Increased/Decreased");
    }
}