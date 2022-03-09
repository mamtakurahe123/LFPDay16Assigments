package day16assigment;
import java.util.Scanner;

public class PermutationsString {
	
	  public static void main(String[] args)  
	    {  
		  Scanner input = new Scanner(System.in); 
		    System.out.println("Enter any String");
	        String str =input.nextLine();
	        int len = str.length();  
	        System.out.println("All the permutations of the string are: ");  
	        PermuteString.generatePermutation(str, 0, len);  
	    } 

}


class PermuteString {  
    //Function for swapping the characters at position I with character at position j  
    public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
      
   
      
    //Function for generating different permutations of the string  
    public static void generatePermutation(String str, int start, int end)  
    {  
        //Prints the permutations  
        if (start == end-1)  
            System.out.println(str);  
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                //Swapping the string by fixing a character  
                str = swapString(str,start,i);  
                //Recursively calling function generatePermutation() for rest of the characters   
                generatePermutation(str,start+1,end);  
                //Backtracking and swapping the characters again.  
                str = swapString(str,start,i);  
            }  
        }  
    }  
}  