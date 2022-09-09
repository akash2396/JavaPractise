package Practise;

public class Program5 {

	public static void main(String[] args) 
	{
		String str1= "akash";
		String str2="akash2";
		boolean isCompare=false;
		
		for(int i =0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				isCompare=false;
			}
			isCompare=true;
		}
		
		System.out.println(isCompare);

	}

}
