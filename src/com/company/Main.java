package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new  HashMap<Integer,String>();
// Map map = new HashMap();
        map.put(495,"Moscow");
        map.put(718,"Newyork");
        map.put(020,"London");
        map.put(11116,"Berlin");
        map.put(11,"New Delhi");
/* TreeMap<Integer,String> tm=new TreeMap<Integer,String>(map);
 Iterator itr = tm.keySet().iterator();
 while(itr.hasNext()){
     int key= (int)itr.next();
     System.out.println("Code "+key +" City "+ map.get(key));
 }*/
        SortedSet<String> values = new TreeSet<String>(map.values());
        List<String> mapValues = new ArrayList<String>(map.values());
        Collections.sort(mapValues);

    }
}
