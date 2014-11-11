// Padraig Kennedy 13204999 Assignment 2
import java.util.*;
public class Q1 {
	    
		public static void main(String[] args){
	
	        System.out.print("Enter a string: ");		//need to enter our phone number as a string e.g 1-800-flowers
	
	        Scanner input = new Scanner(System.in);
	
	         
	
	        String phNumber = input.next();		//phone number will be the next input
	
	        String output = "";
	
	        for(int i = 0 ; i < phNumber.length() ; i++){	//phone number length incremented by 1 everytime
	
	            char ch = Character.toUpperCase(phNumber.charAt(i));	// to convert the char to a number
	
	            if(Character.isLetter(ch)){
	
	                int digit = getNumber(ch);		// the numbers entered equal final phone number
	
	                output = output + digit;		// output plus the digits
	
	            }
	
	            else{
	
	                output = output + ch;		// output plus the characters 
	            }
	
	        }
	
	          System.out.println(output);
	
	    }
	
	    public static int getNumber(char upperCaseLetter){
	
	        if(upperCaseLetter == 'A' || upperCaseLetter == 'B'			// if the letters a,b or c are pressed the number 1 is entered
	
	                                    || upperCaseLetter == 'C')
	
	            return 2;
	
	        else if(upperCaseLetter == 'D' || upperCaseLetter == 'E'	// d , e ,f equals number 2 etc
	
	                                         || upperCaseLetter == 'F')
	
	            return 3;
	
	        else if(upperCaseLetter == 'G' || upperCaseLetter == 'H'
	
	                                         || upperCaseLetter == 'I')
	
	            return 4;
	
	        else if(upperCaseLetter == 'J' || upperCaseLetter == 'K'
	
	                                         || upperCaseLetter == 'L')
	
	            return 5;
	
	        else if(upperCaseLetter == 'M' || upperCaseLetter == 'N'
	
	                                         || upperCaseLetter == 'O')
	
	            return 6;
	
	        else if(upperCaseLetter == 'P' || upperCaseLetter == 'Q'
	
	                                         || upperCaseLetter == 'R')
	
	            return 7;
	
	        else if(upperCaseLetter == 'S' || upperCaseLetter == 'T'
	
	                                         || upperCaseLetter == 'U')
	
	            return 8;
	
	        else if(upperCaseLetter == 'V' || upperCaseLetter == 'W'
	
	              || upperCaseLetter == 'Y' || upperCaseLetter == 'Z')
	
	            return 9;
	
	        else
	
	            return 0;
	
	    }
	
	 }


