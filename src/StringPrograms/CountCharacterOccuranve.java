package StringPrograms;

public class CountCharacterOccuranve 
{

	public static void main(String[] args) {
		
		String s="automation testing";
		System.out.println(s);
		System.out.println(s.length());
		int totalCount=s.length();
		String n=s.replace("a", "");
		System.out.println(n);
		int countWithout=n.length();
		
		int count=totalCount-countWithout;
		System.out.println("a is repeated= "+count);
		
	}

}
