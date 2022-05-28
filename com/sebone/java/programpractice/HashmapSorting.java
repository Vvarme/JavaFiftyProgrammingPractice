
	package com.sebone.java.programpractice;

	import java.util.*;

	/**
	 * @author Vinod Verme
	 *
	*/
	public class HashmapSorting {
		

	    public static void main(String[] args)
	    {
	 
	        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	 
	        // enter data into hashmap
	        hashMap.put("Vinod", 1998);
	        hashMap.put("Ram", 1997);
	        hashMap.put("Shyam",2000 );
	        hashMap.put("Vivek",1999);
	        hashMap.put("Mohit", 2002);
	        hashMap.put("Devendra",1997);
	        Map<String, Integer> hm1 = sortByValue(hashMap);
	 
	        // print the sorted hashmap
	        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
	            System.out.println(en.getKey() +
	                          ", Value = " + en.getValue());
	        }
	    }
	
		 public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hashMap)
		    {
		        // Create a list from elements of HashMap
		        List<Map.Entry<String, Integer> > list =
		               new LinkedList<Map.Entry<String, Integer> >(hashMap.entrySet());
		 
		        // Sort the list
		        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
		            public int compare(Map.Entry<String, Integer> o1,
		                               Map.Entry<String, Integer> o2)
		            {
		                return (o1.getValue()).compareTo(o2.getValue());
		            }
		        });
		         
		        // put data from sorted list to hashmap
		        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		        for (Map.Entry<String, Integer> aa : list) {
		            temp.put(aa.getKey(), aa.getValue());
		        }
		        return temp;
		    }
		 
	}
