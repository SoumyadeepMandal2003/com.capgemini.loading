package OOPs.relationships;


/******************************************************************************
USES-A Relationship (Dependency Relationship) in Java

One class uses another class to perform a specific task.
eg. Office Worker USES-A Printer.

Achieved by:
1. Creating object of one class inside a method of the another class.
2. Using reference variable of one class inside another class(LOCAL VARIABLE).


*******************************************************************************/

class Printer {
    void print(String document) {
        System.out.println("Printing document: " + document);
    }
}

class OfficeWorker {
    void printDocument(String document) {
        Printer printer = new Printer(); // Creating Printer object inside method
        printer.print(document); // Using Printer object to perform task
    }
}



public class DependencyRelation {
    public static void main(String[] args) {
        OfficeWorker worker = new OfficeWorker();
        worker.printDocument("Annual Report");
    }
}
