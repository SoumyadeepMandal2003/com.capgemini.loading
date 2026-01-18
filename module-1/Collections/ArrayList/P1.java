import java.util.ArrayList;
import java.util.List;

public class P1 {
	public static void main(String[] args) {
		List<String> pb = new ArrayList<>();
		pb.add("Sarso da saag");
		pb.add("Chole bhature");
		pb.add("Butter Chicken");
		pb.add("Lassi");
		System.out.println("PB: "+ pb );
		List<String> up= new ArrayList<>();
		up.add("Litti chokha");
		up.add("Dal chawal");
		up.add("Sattu");
		System.out.println("UP: "+ up);
		List<String> south = new ArrayList<>();
		south.add("Dosa");
		south.add("Idli");
		south.add("Sambhar");
		south.add("Chutney chutney");
		south.add("Biryani");
		System.out.println("SOUTH: "+ south);
		
		List<String> lpu = new ArrayList<>();
		lpu.addAll(south);
		lpu.addAll(pb);
		System.out.println("LPU: "+ lpu);
		lpu.addAll(4, up);
		System.out.println("LPU: "+ lpu);
		
		lpu.remove("Idli");
		System.out.println("LPU: "+ lpu);
		
		System.out.println(south.contains("Idli"));
		System.out.println(lpu.contains("Idli"));
		
		System.out.println(pb.remove(0));
		System.out.println("PB: "+ pb);
		
		System.out.println(lpu.containsAll(pb));
		
		System.out.println(lpu.containsAll(south));
		
		System.out.println(lpu.removeAll(south));
		System.out.println("LPU: "+ lpu);
		lpu.clear();
		System.out.println("LPU: "+ lpu);
		System.out.println(lpu.removeAll(south));
	
	}
}