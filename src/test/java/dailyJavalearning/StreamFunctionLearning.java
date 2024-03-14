package dailyJavalearning;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunctionLearning 
{
	
    public static void main(String[] args)
    {
	   List<Integer> list = Arrays.asList(1,2,3,4,5);
	   
	   // collection store into another by filtering
	   List<Integer> list2 =list.stream().filter(n->n%2==0).
			                collect(Collectors.toList()); 
	   System.out.println(list2);
	   
	   
	   //print the output by filtering
	  list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	  
	  //print the output by filtering
	  list.stream().filter(n->n%2==0).forEach(System.out::println);
	  
	//  =======================================================================
	  
	  //filter the person name has > 6 and less than 84
	  List <String> list3 =Arrays.asList("vrushabh","vrushbh","vru");
	  
	  list3.stream().filter(n-> n.length()>6 && n.length()<8).forEach(System.out::println);
	  
	  
	  // print the values by removing null values from the collection
	 
	  List list4= Arrays.asList("vrushabh",null,"vrush","vrush",null);
	  
	   list4.stream().filter(str->str!=null).forEach(System.out::println);
	   
	   
    
	  
	  
	  
	}
    
    
}
	