package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCardDemo {

	public static void displayNumbers(List<? super Integer> list)
	{
	for(Object n:list)
	{
		System.out.println(n);
	}
	}
public static void main(String args[])
{
List<Integer> ll= Arrays.asList(1,2,3);
System.out.println("display values");
displayNumbers(ll);

List<Number> l2= Arrays.asList(1.0f,2.0f,3.0f);
System.out.println("display values");
displayNumbers(l2);


}
}
