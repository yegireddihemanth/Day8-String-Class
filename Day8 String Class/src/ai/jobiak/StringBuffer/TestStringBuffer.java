package ai.jobiak.StringBuffer;

public class TestStringBuffer {

	public TestStringBuffer(String hemanth) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		StringBuffer buffer2=new StringBuffer("");
		StringBuffer buffer3=new StringBuffer(" welcome");
		
		String s= new String("java code");		
		
		StringBuffer buffer = new StringBuffer("hemanth");
		System.out.println(buffer); 
		System.out.println(buffer.length());
		//returns the length of the sequance
		System.out.println(buffer.capacity());
		// returns the number of characters can be stored
		System.out.println(buffer.charAt(5));
		//returns specific character using the index
		System.out.println(buffer.codePointAt(5));
		//gives the unicode for a spesific character
		System.out.println(buffer.compareTo(buffer2));
		
		System.out.println(buffer.equals(buffer2));
		System.out.println(buffer.hashCode());
		System.out.println(buffer2.hashCode());
		System.out.println(buffer2.isEmpty());
		System.out.println(buffer.substring(1));
		System.out.println(buffer.substring(2, 5));
		
		System.out.println(buffer.append(buffer3));
		//System.out.println(buffer.append("hello"));
		System.out.println(buffer.append( 2.67));
		System.out.println(buffer.append(buffer3, 0, 3));
		
		System.out.println(buffer.chars());
		
		System.out.println(buffer.delete(2, 5));
		System.out.println(buffer);
		System.out.println(s.replace(s, buffer3));
		System.out.println(s); //not changed because strings are immutable
		System.out.println(buffer.getClass());
		System.out.println(s.getClass());
		
	}
	

}
