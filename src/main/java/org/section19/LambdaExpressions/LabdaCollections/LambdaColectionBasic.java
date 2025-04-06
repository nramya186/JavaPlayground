package org.section19.LambdaExpressions.LabdaCollections;
import java.util.*;

public class LambdaColectionBasic {
    public static void main(String[] args) {
        //lIst imnsertion order maintain and duplicate allowed
        ArrayList<String> i = new ArrayList<>();
        i.add("sunny");
        i.add("bunny");
        i.add("chinny");
        i.add("runny");
        i.add("sunny");
        System.out.println(i);
        //op : [sunny, bunny, chinny, runny, sunny]

        //set: insertion oder not maintain duplicate not allowed
        HashSet<String> h = new HashSet<>();
        h.add("sunny");
        h.add("bunny");
        h.add("chinny");
        h.add("runny");
        h.add("sunny");
        System.out.println(h);
        //[runny, sunny, bunny, chinny]   oder not maintain

        //map order is no guarantee
        HashMap<String,String> mp= new HashMap<>();
        mp.put("a","Apple");
        mp.put("b","Bat");
        mp.put("c","cat");
        mp.put("c","cute");
        System.out.println(mp);
        //op: {a=Apple, b=Bat, c=cute}
        //cat over ridden bu cute
        //if u want to add both u can use value as list<String>
//way 1:
        HashMap<String, List<String>> mplst= new HashMap<>();
        mplst.put("a", Arrays.asList("apple"));
        mplst.put("b",Arrays.asList("bat"));
        mplst.put("c",Arrays.asList("cat","cute"));
        System.out.println(mplst);
        //way 2 using stringBuilder
        HashMap<String, StringBuilder> mpsb = new HashMap<>();
        mpsb.put("a",new StringBuilder("apple"));
        mpsb.put("b",new StringBuilder("bat"));
        mpsb.put("c",new StringBuilder("cat"));
        // Append instead of replacing
mpsb.get("c").append(",cute");
        System.out.println(mpsb);

        //multimap





    }
}
