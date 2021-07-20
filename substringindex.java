
import java.util.*;
import java.util.Scanner;

public class substringindex
{

	
	static void findSubstring(String str, int power)
	{

		// Create an empty map
		HashMap<Integer,
				Integer> map = new HashMap<>();

		
		int curr_power = 0;
		int len = str.length();

		for (int i = 0; i < len; i++)
		{

			curr_power = curr_power + (str.charAt(i) - 'a' + 1);
			if (curr_power == power)
			{
				System.out.println("Substring from index 0" +
								" to " + i + " has power " + power);
				System.out.println(str.substring(0, i+1));
				return;
			}

			if (map.containsKey(curr_power - power))
			{
				System.out.println("Substring from index " +
								(map.get(curr_power - power) + 1) +
								" to " + i + " has power " + power);
				System.out.println(str.substring((map.get(curr_power - power)+1 ), i+1));
				return;
			}

			map.put(curr_power, i);
		}

		System.out.println("No substring with given power exists.");
	}

	
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);  
	    Scanner sc = new Scanner(System.in);  
            System.out.println("Enter String");
            String str = sc.nextLine();  
            System.out.println("Enter Power");
            int power = sc.nextInt(); 
	    findSubstring(str, power);
	}
}


