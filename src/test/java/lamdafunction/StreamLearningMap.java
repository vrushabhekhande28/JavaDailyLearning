package lamdafunction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLearningMap 
{
    static  List <String> list = new ArrayList();
     
     public static void main(String[] args)
     {
	    	list.add("vrushabh");
	    	list.add("Ekhande");
	    	
	    	/*
	    	 * map is function
	    	 * it is used to convert one type of collection to an anotehr type
	    	 */
	    	
	    	
	    	List list2=list.stream().map(num-> num.toUpperCase()).collect(Collectors.toList());
	    	
	    	List list3=list.stream().map(num-> num.length()).collect(Collectors.toList());
	    	
	    	System.out.println(list3);
	    	
	    	List <Integer>li = new ArrayList();
	    	li.add(0);
	    	li.add(1);
	    	li.add(2);
	    	
	    	
	    	List j=li.stream().map(n-> n*3).collect(Collectors.toList());
	    	System.out.println(j);
	 }
     
}
