package pariallyopenbook1;


import java.util.Scanner;


public class Testpalindromicphrase {
	 static boolean sentencePalindrome(String str){   
	        int l = 0;
	        int h = str.length()-1;
	        str = str.toLowerCase();
	        while(l <= h)
	        { 
	        char getAtl = str.charAt(l);
	        char getAth = str.charAt(h);
	        if (!(getAtl >= 'a' && getAtl <= 'z'))
	        l++;
	        else if(!(getAth >= 'a' && getAth <= 'z'))
	        h--;
	        else if( getAtl == getAth)
	        {
	        l++;
	        h--;
	        }
	        else
	        return false;
	        }
	        return true;   
	    	}
	    	public static void main(String[] args)
	    	{
	        String str;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter a phrase : ");
	        str=in.nextLine();
	        if( sentencePalindrome(str))
	        System.out.println("Sentence is palindrome");
	        else
	        System.out.println("Sentence is not palindrome");
	    	}
	
	

}
