package Practise;

public class Program3 {

	public static boolean compare() {
		
		String str1="akash";
		String str2="akash22";
		boolean isCompare=false;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				return false;
				
			}
			
			
		}
		return true;
		
		
	}
	
	public static void main(String[] args) {
		//compare();
		System.out.println(compare());
	}

}
