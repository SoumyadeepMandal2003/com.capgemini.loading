package OOPs;


/*
Fundamentals of OOPs:
    Types of Global Members:
        1. Static Members
        2. Non Static Members
    
    Static Members:
        1. Static Variable:
            A variable which is declared inside class area(or Global area) with static keyword is known as static variable.
            It is type of global variable.
            We can use w/o intialization because it can store default values.
            We can use global variables inside global area as well as local area.

            default values:
            byte = 0
            short = 0
            int = 0
            long = 0
            float = 0.0
            double = 0.0
            char = 
            boolean = false
            string = null


    Write a difference b/w local and a global variable
    Local: Declared within a method, constructor or a specific block area; Scope/Lifetime is within that very block; memory -> Stack.
    Global: Declared within class area; Scope/Lifetime throughout the object -> Heap.


    Whenever we have static and local variable with same name if we use directly inside static context the high priority is given to local variable, to use static variable we have to consider class name.
    Classname.member

    for execution program JVM have some memory areas.
    1.class static area:
        Every class have a dedicated memory to store all static members is known as class static area.
        The name of the class static area is as same as ClassName



    Difference b/w static method and stasic block


    write a JAVA Program to overload main method:
    

    We cannot use nonstatic members inside stactic context directly as well as with the help of ClassName.

    To use/store non static members we have to create an object.

    How to create an object??
    -> by using new keyword.
    -> new ClassName();

    What is Object:
        -> It is a block memory in heap area created during runtime which is used to store non static members.

    What's new??
    -> new is a keyword
    -> it is unary operator
    -> with the help new keyword we can create n numbers of object for one class.
    -> It will return addresses of an object.
    -> Whenever we are using new keyword new object will be created.


    ClassName is a non-primitive data type which is used to create objects and represent user-defined reference types in Java, allowing the program to access variables and methods defined inside the class through object references.

    How to use static members inside static context?
    -> Directly by using ClassName.
    -> with the help of object reference variable.

Note : Every object is directly pointing towards Class static area.

Static Variable : 
    A variable which is declared inside class area(or Global area) with static keyword is known as static variable.
    It is type of global variable.
    We can use w/o intialization because it can store default values.
    We can use global variables inside global area as well as local area.

Non-Static Variable :
    A variable which is declared inside class area(or Global area) without static keyword is known as non-static variable.
    It is type of global variable.
    We cannot use w/o intialization because it can't store default values.
    We can use global variables inside global area as well as local area with the help of object reference variable.

Whenever we have non static variable and local variable with same,
name if we use directly inside non static context the high priority is given for local variable to use non static variable we have to use this keyword.


this:
    -> it is a keyword
    -> it is a reference variable
    -> it is used to refer current object
    -> it is used to access non static members inside non static context
    -> it is used to differentiate b/w local and non static variable when both have same name.

How to use non static members inside non static context?
    -> directly by using this keyword
    -> with the help of object reference variable eg.(this keyword).

** NonStatic Block
    A block which is declared inside class area(or Global area) without static keyword is known as non-static block. It is also known as instant initializer block.
    It gets executed whenever we are creating an object.

    **Static and Non-Static blocks does not have access modifiers, return type, name, and they cannot take parameters-formal arguments.


**Constructor:
    It is special type of non static member;
    bcz:
        The name of constructor is as same as ClassName;
        It is similiar to method but it does not have return type;


**Note:
    If method is returning any data we need to specify what type of data the method is returning is known as returning type of method.

**Default Constructor:
    If programeer has not written any constructor still JVM will provide a no argument constructor by default which is known as default constructor.

Every constructor will have :
    1. Constructor Chainig Statement:
        -> it is used to call one constructor from another constructor.
        -> it should be the first statement inside constructor body.
        -> it is used to avoid code reusability.
        1> Super Calling Statement:
            -> it is used to call parent class constructor from child class constructor
        2> This Calling Statement:
            -> it is used to call current class constructor from current class constructor
    2. PLI : Pre Loading Instructions
        -> it is used to initialize non static members inside constructor body.
    3. IIB : Instant Initializer Block
        -> it is used to initialize non static members inside non static block.
    4. UWS : User Written Statements
        -> it is used to write business logic inside constructor body.


Parameterized Constructor:
    A constructor which is having parameters-formal arguments is known as parameterized constructor.
    We use Parameterized constructor to initialize non static variables using object creation.

Copy Constructor:
    A constructor which is used to create copy of an existing object is known as copy constructor.

Constructor Chaining:
    It is used to call one constructor from another constructor.
    It should be the first statement inside constructor body.
    It is used to avoid code reusability.

    1> Super Calling Statement:
        -> it is used to call parent class constructor from child class constructor
    2> This Calling Statement:
        -> it is used to call current class constructor from current class constructor

This() :
    It is a constructor calling statement.
    It is used to call constructor of same class.
    If we have n number of constructor then we can use n-1 this() calling statements.
    If any constructor will have this() calling statement then that constructor does not have PLI and IIB.

NOTE: 
    Constructor recursion is not possible bcz it will not create an object.
    If we try to achieve constructor recursion so it will give compile time error.


    What is use of constructor overloading??
        -> Constructor overloading is used to initialize non static variables in multiple ways during object creation.
        It is also used to achieve constructor chaining with this().

    What is difference between constructor overloading and method overloading??
        -> Method overloading is used to achieve polymorphism whereas constructor overloading is used to initialize non static variables in multiple ways during object creation.

    When we use parameterized constructor??
        -> We use Parameterized constructor to initialize non static variables using object creation.

    What is use of copy constructor??
        -> A constructor which is used to create copy of an existing object is known as copy constructor.


    OOPs :
        Object Oriented Programming
            -> It is a design model or paradigm which help the programmer to corelate real world scenerios into programming world scenerios in form of object.

        4 Pillars of OOPs : 
            -> Encapsulation
            -> Inheritance
            -> Polymorphism
            -> Abstraction

        Encaotulation  :



*/


public class TheoryIntro {
    //class or Global area

    static int a = 10; //static variable

    //static method


    //Driver Class
    public static void main(String[] args) {
        //static context
        System.out.println("main start");
        TheoryIntro obj = new TheoryIntro();
        obj.test();
        System.out.println("main end");
    }

    // public static void test(){
    //     //static context
    //     System.out.println("test start");
    //     System.out.println(a);
    //     int a = 25; //local variable
    //     System.out.println(a);
    //     System.out.println(TheoryIntro.a);
    //     System.out.println("test end");
    // }


    public void test(){
        //non-static context -> object -> class static area
        System.out.println("test start");
        System.out.println("Directly"+a);
        System.out.println("With the help of ClassName: "+ TheoryIntro.a);
        System.out.println("With the help of this: "+ TheoryIntro.a);
        System.out.println("test end");
    }
    
}



