
// ----------------Widening & Narrowing Type Casting----------------
// WAP to convert double value 45.78 into int and print result.

// WAP to assign an int value 130 to a byte using narrowing/explicit type casting and print result.

// WAP to convert long -> int -> short -> byte and print all results. use value 987654321.
// -----------------------------------------------------------------





public class TypeCastingQuestion1 {
    public static void typeCast1(int n) {
        double d  = 45.78d;
        int num = (int) d;
        System.out.println("Double to Int: " + num);


        int val = 130;
        byte b = (byte) val;
        System.out.println("Int to Byte: " + b);


        long l = 987654321L;
        int i = (int) l;
        short s = (short) i;
        byte by = (byte) s;
        System.out.println("Long to Int: " + i);
        System.out.println("Int to Short: " + s);
        System.out.println("Short to Byte: " + by);

    }
    public static void main(String[] args) {
        typeCast1(6);
    }
}
