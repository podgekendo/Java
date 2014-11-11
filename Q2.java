// Padraig Kennedy, 13204999 , Assignment 2
public class Q2 {
	public static void main(String[] args) 
	{
	String str1 = args[0];
	String str2 = args[1];
	int str1Count=0;
	int str2Count=0;
	for(int i=0;i<str1.length();i++)
	{
	if(str1.charAt(i)=='a' || str1.charAt(i)=='A')
	{

	str1Count++;

	}
	}
	for(int i=0;i<str2.length();i++)
	{
	if(str2.charAt(i)=='a' || str2.charAt(i)=='A')
	{
	str2Count++;
	}
	}
	int totalCount = str1Count+str2Count;
	String str11replace = str1.replace('a','@');
	String str12replace = str11replace.replace('A','@');

	String str21replace = str2.replace('a','@');
	String str22replace = str21replace.replace('A','@');

	System.out.println("The total number of occurrences of the character 'a' or 'A' : "+totalCount);
	System.out.println("String 1 Replace : " + str12replace);
	System.out.println("String 2 Replace : " + str22replace);
	System.out.println("String 1 Uppercase : " + str12replace.toUpperCase());
	System.out.println("String 2 Uppercase : " + str22replace.toUpperCase());
	String strResult = str12replace.toUpperCase()+ str22replace.toUpperCase();
	System.out.println("String Result : " + strResult);


	}
}
