import java.util.*;

public class example {
     public static void main(String[] args){
        System.out.println("Set Program - HashSet, TreeSet, Links");
        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println("This is for Set: "+s);
        System.out.println("==============Hash Set=========");
        HashSet<Integer> hs=new HashSet<>();
        hs.add(101);
        hs.add(102);
        hs.add(103);
        hs.add(104);
        System.out.println(hs.contains(103));
        System.out.println(hs.remove(102));
        System.out.println(hs.isEmpty());
        LinkedHashSet<Integer> ll=new LinkedHashSet<>();
        for(Integer a:ll){
            ll.add(a);
        }


        
        
    }
    
}
    
