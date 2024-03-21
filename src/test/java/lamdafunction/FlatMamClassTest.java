package lamdafunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class FlatMamClassTest1
{
	int productId;
	String nameOFTheproduct;
	double Prize;
	  
	  public FlatMamClassTest1(int productID,String nameOFproduct, double prize)
	  {
		  this.productId=productID;
		  this.nameOFTheproduct=nameOFproduct;
		  this.Prize=prize;
	  }
}
public class FlatMamClassTest 
{
	
	
	  
	  
  public static void main(String[] args)
  {
	/*
	 * Generally map is used mapping purposes
	 */
	  
	  /*
	   * flatmap is an mapbut flatmap is used to complet collection;
	   * flamap return an stream of objects
	   * if in map we store element single values
	   */
	  
	  
	  /*
	  List <Integer>list1 = new ArrayList();
	  list1.add(1);
	   list1.add(2);
	  List <Integer>list2 = new ArrayList();
	  list2.add(3);
	   list2.add(4);
	  List <Integer>list3 = new ArrayList();
	  list3.add(5);
	  list3.add(6);
	  
	  
	  List<List<Integer>> add = Arrays.asList(list1,list2,list3);

	  List<Integer> collec = add.stream().flatMap(m-> m.stream()).collect(Collectors.toList());
	  
	  System.out.println(collec);
	  
	  
	  */
	  
	  
	    
	    FlatMamClassTest1 n1 = new FlatMamClassTest1(1,"Vrushabh Ekhande",1000);
	    FlatMamClassTest1 n2 = new FlatMamClassTest1(2,"Sonam patil",1000);
	    FlatMamClassTest1 n3 = new FlatMamClassTest1(3,"Devika  Senapathi",1000);
	    
	    List list11= new ArrayList();
	    list11.add(n1);
	    
	    List list12= new ArrayList();
	    list11.add(n2);
	    
	    List list13= new ArrayList();
	    list13.add(n3);
	    
	    
	    List<List<FlatMamClassTest1>> list= Arrays.asList(list11,list12,list13);
	    
	    // reason behind using flatmap is it return stram of an object as well as used for the bigger data handling 
	    
	   List<String> d = list.stream().
			                       flatMap(s-> s.stream().map(s1-> s1.nameOFTheproduct)).collect(Collectors.toList());


	   System.out.println(d);
  
  }   
}
