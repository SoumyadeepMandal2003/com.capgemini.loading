package OOPs;

//WJP to execute instance initializer block and execute non static method before the execution of main method😎.

public class PS1 {
    //class or Global area

    {
        //non-static block or instance initializer block
        System.out.println("Non-static block executed");
    }

    //Driver Class
    public static void main(String[] args) {
        //static context -> class static area
        System.out.println("main start");
        System.out.println("main end");
    }

    //non static method
    public void test(){
        System.out.println("test method executed");
    }

    //static block
    static {
        System.out.println("static block Executed");
        PS1 obj = new PS1(); //creating object to execute non static block
        obj.test(); //calling non static method
    }

}
