package OOPs.Exceptions;


//Write a java program to handle ClassCastException

public class P1{
    public static void main(String[] args){
        System.out.println("Main Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value = sc.nextInt();
        Object obj = new Integer(value);
        try {
            String str = (String) obj; 
            System.out.println("String value: " + str);
        } catch (ClassCastException e) {
            e.printStackTrace();
            System.out.println("Handled ClassCastException");
        } finally {
            sc.close();
            System.out.println("Finally Block Executed");
        }
        System.out.println("Program ended");
    }
}