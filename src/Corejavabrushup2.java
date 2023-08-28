import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Corejavabrushup2 {
	public static void main(String[] args) {
		
		int[] arr2 = {1,2,4,8,5,10,9,12,15};
		
		// multiple of 2
		// check if array has multiple of 2
		
		for (int i=0; i< arr2.length; i++)
		{
			
				if (arr2[i] %2 == 0)
				{
			        System.out.println(arr2[i]);
			        break;
				}
				
				
				else
				{
					System.out.println(arr2[i] + " is not multiple of 2");
				}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ravi");
		a.add("Sonu");
		a.add("Riyaz");
		a.add("Zikra");
		a.add("Paul");
		//a.remove(2);
		//a.get(2);
		System.out.println(a.get(3));
		
		for (int i=0; i<a.size(); i++ )
		{
			System.out.println("************");
			
			for (String val :a)
				
			{
				System.out.println(val);
			}
			
			//item present in arraylist
			System.out.println(a.contains("Paul"));
			String[] name = {"Ravi","Sonu","Riyaz","Zikra"};
			List<String> nameArrayList = Arrays.asList(name);
			nameArrayList.contains("Riyaz");
		
		}
		
	}

}
