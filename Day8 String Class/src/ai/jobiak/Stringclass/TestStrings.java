package ai.jobiak.Stringclass;

public class TestStrings {

	public static void main(String[] args) {
	
		//jar to jar journey
		String str = new String();
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str==null?true:false);
		System.out.println(str.hashCode());
		System.out.println(str.toString());
		//---------------------
		
		String string = new String("\\Jobial.com Grooming AI");
		
		System.out.println(string);
		System.out.println(string.length());
		System.out.println(string.hashCode());
		System.out.println(string.toString());
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		System.out.println(string); //it will never be changed it will produces default string because strings are immutable
		
		byte bytes[] = {64,34,7,4,2,9,4,75};
		String bytestr = new String(bytes);
		System.out.println(bytestr);
		
		
		char chars[] = {'h', 'r', 'H'};
		String charStr = new String(chars);
		System.out.println(charStr);

	}

}
