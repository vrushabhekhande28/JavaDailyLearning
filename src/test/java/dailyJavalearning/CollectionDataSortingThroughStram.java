package dailyJavalearning;

import java.util.ArrayList;
import java.util.List;

public class CollectionDataSortingThroughStram
{
  int id;
  String name;
  String address;
  int price;
  
  CollectionDataSortingThroughStram(int id, String name, String address, int  price)
  {
	  this.id=id;
	  this.name=name;
	  this.address=address;
	  this.price=price;  
  }
  
  
  public static void main(String[] args)
  {
	
	List <CollectionDataSortingThroughStram> list=new ArrayList<CollectionDataSortingThroughStram>();
	list.add(new CollectionDataSortingThroughStram(1,"vrushabh", "pune" , 1000));
	list.add( new CollectionDataSortingThroughStram(1,"Pratik", "pune" , 2000));
	list.add(new CollectionDataSortingThroughStram(1,"Sanu", "pune" , 3000));
	list.add( new CollectionDataSortingThroughStram(1,"Div", "pune" , 4000));
	list.add(new CollectionDataSortingThroughStram(1,"ope", "pune" , 5000));
	
	// find the values who has more than 1000
	list.stream().filter(p-> p.price>1000).forEach(po->System.out.println(po.price));

  }
  
}
