
import java.util.LinkedHashSet;
import java.util.Set;


public class P3 {
    public static void main(String[] args) {
        java.util.List<Integer> al = new java.util.ArrayList<>();
        al.add(10);
        al.add(12);
        al.add(13);
        al.add(12);
        al.add(14);
        al.add(14);
        al.add(null);
        al.add(15);
        al.add(11);
        al.add(10);
        al.add(16);
        al.add(null);
        al.add(10);
        System.out.println("al: "+al);
        
        //WAJP to remove duplicates from given list. and print only unique objects.
        // Output: [10, 12, 13, 14, null, 15, 11, 16]

        Set<Integer> lhs = new LinkedHashSet<>(al);
        System.out.println(lhs);
    }
}

















