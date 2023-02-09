package lettercombinations;

import java.util.List;

//Java implementation of the approach
import java.io.*;
import java.util.*;

class GFG {

	 public List<String> letterCombinations(String digits) {
	       String[] words
				= { "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
			ArrayList<String> list
				= letterCombinationsUtil(digits.split(""), digits.length(), words);
	            return list;
	    }

	     ArrayList<String>
		letterCombinationsUtil(String[] number, int n,
							String[] table)
		{
			// To store the generated letter combinations
			ArrayList<String> list = new ArrayList<>();

			Queue<String> q = new LinkedList<>();
			q.add("");

			while (!q.isEmpty()) {
				String s = q.remove();

				// If complete word is generated
				// push it in the list
				if (s.length() == n)
					list.add(s);
				else {
					String val = table[Integer.parseInt(number[s.length()])];//table[2] 
					for (int i = 0; i < val.length(); i++)
					{
						q.add(s + val.charAt(i));
					}
				}
			}
			return list;
		}


	// Driver code
	public static void main(String args[])
	{
		String number = "234";
	
		// Function call
		//System.out.println(letterCombinations(number));
	}
}

//This code is contributed by rachana soma

