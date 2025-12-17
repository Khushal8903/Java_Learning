
// import java.util.*;
// public class Demo{
	
	// public static void main(String x[]){
		
		// LinkedHashMap clg = new LinkedHashMap();
		// LinkedHashMap FE = new LinkedHashMap();
		
		// clg.put("FE" , FE);
		
		// LinkedHashMap comp = new LinkedHashMap();
		// LinkedHashMap mech = new LinkedHashMap();
		// LinkedHashMap etc = new LinkedHashMap();
		
		// FE.put("Computer" , comp);
		// FE.put("Mechanic" , mech);
		// FE.put("ENTC" , etc);
		
		
		// //Computer
		// LinkedHashMap std = new LinkedHashMap();
		// std.put(1 , "Khushal");
		// std.put(2 , "Tushar");
		// std.put(3 , "Narayan");
		// comp.put("Comp" , std);
		
		// LinkedHashMap std1 = new LinkedHashMap();
		// std1.put(1 , "khushal");
		// std1.put(2 , "tushar");
		// std1.put(3 , "narayan");
		// mech.put("Mech" , std);
		
		// LinkedHashMap std2 = new LinkedHashMap();
		// std2.put(1 , "Khush");
		// std2.put(2 , "Tush");
		// std2.put(3 , "Nara");
		// etc.put("Etc" , std);
		
		
		// Set<Map.Entry>set = clg.entrySet();
		// for(Map.Entry e : set){
			 // String fe =e.getKey().toString();
			 // System.out.println(fe + "\n---------------------------------");
			   // Object obj  =e.getValue();
			   // LinkedHashMap map1 = (LinkedHashMap)obj;
			   // Set<Map.Entry>set1 = map1.entrySet();
			   // for(Map.Entry e1 : set1){
				   // String dept =e1.getKey().toString();
				    // System.out.println(dept + "\n---------------------------------");
				   // Object obj1  =e1.getValue();
				   // LinkedHashMap map2 = (LinkedHashMap)obj;

				   // Set<Map.Entry>set2 = .entrySet();
				   // for(Map.Entry e2 : set1){
						
						// System.out.println("Id\tName");
						// System.out.println("---------------------------------");
						// System.out.println(e2.getKey()+"\t"+e2.getValue());
					
				   // }
			   // }

// }}}
		
		
		
		
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<Integer, String>>> clg = new LinkedHashMap<>();

        LinkedHashMap<String, LinkedHashMap<Integer, String>> FE = new LinkedHashMap<>();
        clg.put("FE", FE);

        // Computer
        LinkedHashMap<Integer, String> compStd = new LinkedHashMap<>();
        compStd.put(1, "Khushal");
        compStd.put(2, "Tushar");
        compStd.put(3, "Narayan");
        FE.put("Computer", compStd);

        // Mechanic
        LinkedHashMap<Integer, String> mechStd = new LinkedHashMap<>();
        mechStd.put(1, "khushal");
        mechStd.put(2, "tushar");
        mechStd.put(3, "narayan");
        FE.put("Mechanic", mechStd);

        // ENTC
        LinkedHashMap<Integer, String> etcStd = new LinkedHashMap<>();
        etcStd.put(1, "Khush");
        etcStd.put(2, "Tush");
        etcStd.put(3, "Nara");
        FE.put("ENTC", etcStd);

        for (Map.Entry<String, LinkedHashMap<String, LinkedHashMap<Integer, String>>> e : clg.entrySet()) {
            System.out.println(e.getKey());
            System.out.println("---------------------------------");

            for (Map.Entry<String, LinkedHashMap<Integer, String>> dept : e.getValue().entrySet()) {
                System.out.println(dept.getKey());
                System.out.println("Id\tName");
                System.out.println("---------------------------------");

                for (Map.Entry<Integer, String> student : dept.getValue().entrySet()) {
                    System.out.println(student.getKey() + "\t" + student.getValue());
                }
                System.out.println();
            }
        }
    }
}


	