package StringJoinerClass;

import java.util.StringJoiner;

public class StringJoi 
{
   
   public static void main(String[] args)
   {
	   StringJoiner join = new StringJoiner(",", "[" , "]");
	   join.add("vrushabh");
	   join.add("vrushabh");
	   join.add("vrushabh");
	   join.add("vrushabh");
	   join.add("vrushabh");
	   join.add("vrushabh");

	   System.out.println(join);
   }
}
