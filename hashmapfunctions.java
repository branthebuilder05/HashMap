import java.util.*;
public class hashmapfunctions
{
	public static void main(String[] args) {


               //key    value		              capacity,loadfactor
		HashMap<String, Integer> map = new HashMap<>(20,.6f);
        HashMap<Integer,String> student=new HashMap<>(5,.6f);
        // Adding elements to the Map
        // using standard put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
 
        
        int ds=1;
        student.put(ds,"a");
        student.put(2,"b");
        student.put(3,"c");
        student.put(4,"d"); // value update in next line
        student.put(4,"orange"); //value changed for key 4.
        //  student.remove(2); // key value deleted for key 2
         student.put(5,"a");
        student.put(6,"b");
        student.put(7,"c");
        student.put(8,"d");
         HashMap<Integer, String> hashmapcopy= new HashMap<Integer, String>(student);
         // System.out.println(hashmapcopy);
       // System.out.println(student.containsKey(6));
       //  System.out.println(student.get(4)); 
       
      // System.out.println( student.size());
      // System.out.println(student);
        System.out.println(student.isEmpty());
      //iteration on hashmap using iterator
    //   for (Map.Entry<String, Integer> e : student.entrySet())
    //         System.out.println("Key: " + e.getKey() + " Value: " + e.getValue()); 
       

          
           String name="";
           
          if(student.containsKey(3))
                 name=student.get(3);


	}

}
