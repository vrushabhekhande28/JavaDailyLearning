package lamdafunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
	 * lamda function used to store less space
	 * it work if the interface is functional
	 * it works if the interface is only one method
	 * lamda function expression have 0 -- multiple argumenets
	 * 
	 */


//========================================================================================================
/*
 * learn the lamda expression which does not have arguments
 */
/*
	interface  Action
	{
		public void delete();

	}

   public class lamdaFunctionUs 
    {
	    public static void main(String[] args) 
	    {
	    	// without lamda expression
	    	Action act = new Action()
	    	{
	    		public void delete()
	    		{
	    			System.out.println("Here, Delete Functionality is working");
	    		}
	    		
	    		public void add()
	    		{
	    			
	    		}
	    	};
	    	act.delete();
	    	
	    	
	      //lamda expression with act
	    	Action act2 = ()->
	    	{
	    		System.out.println("draw method is implemented with lamda expression");
	    	};
	
		}
	}
  */
 //========================================================================================================
 
    /*
    * lamda function which having sinngle arguments
    */

/*
interface  Action
{
	public void delete(String name);
}


class lamdaFunctionUs
{
	public static void main(String[] args) 
	{
		
		// even name is ok
		Action acti=(name) ->
		{
		   System.out.println("I am here delete functionality working is pushed1  "+ name);
		};

		// even String name id 
		Action acti1=(String name) ->
		{
		   System.out.println("I am here delete functionality working is pushed1  "+ name);
		};
		
		// even omit the lamda function only rgument is alos ok 
		
		Action act3= name -> 
		{
		      System.out.println("vrushabhekahnde");
		};
		
		acti.delete("vrushah");
	}
}

 */

//========================================================================================================


/*
interface  Action
{
	public int delete(int  name, int sirname);
}


class lamdaFunctionUs
{
	public static void main(String[] args) 
	{
		Action act = (int name, int sirname)->
		 {
			 return (name+sirname);
		 };
	}	
}
*/

//========================================================================================================

/*
 * learn how lamda funtion used with or each loop
 */

/*
class lamdaFunctionUs
{
  List list = new ArrayList();
  
 public static void main(String[] args) 
 {
	 List list = new ArrayList();
	 list.add(1);
	 list.add(2);
	 list.add(3);
	 list.add(4);
	 
	 list.forEach(n->System.out.print(n));
	 
 }
 
  
}

*/
/*
 * how to apply filter and lamda fucntion filter the product who has max values
 */

class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

class lamdaFunctionUs
{
	public static void main(String[] args) 
	{
		List <Product> product = new ArrayList<Product>();
		
		product.add(new Product(1,"pen",10));
		product.add(new Product(1,"paper",101));
		product.add(new Product(1,"Phone",101111));
		product.add(new Product(1,"Bag",1110));
		product.add(new Product(1,"pendriver",1110));
	//	product.add(new Product(1,"Bag",1110));

		
		List<Product> collect = product.stream().filter(p-> p.price>100).collect(Collectors.toList());

		collect.forEach(p-> System.out.println(p.price +" "+ p.name));
		
		//filter the product
		System.out.println("--------------------------------------------------------");
		Set<Product> l=collect.stream().filter(p-> p.price > 100).collect(Collectors.toSet());
		l.forEach(s-> System.out.println(s.price + " "+ s.name));
		
		//print the values with price and name and price
		System.out.println("--------------------------------------------------------");

	
	Map p3=product.stream().filter(p-> p.price > 10).collect(Collectors.toMap(p->p.name, p->p.price));
	     
	System.out.println(p3);
	}
}


