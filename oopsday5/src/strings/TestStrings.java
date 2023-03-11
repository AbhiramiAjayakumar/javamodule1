package strings;

public class TestStrings {

	public static void main(String[] args) {
		
		
		/* bytes[]= {65,66,67,68,69};
		String str=new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str="Welcome to ust global";
		System.out.println(str);
		
		bytes=str.getBytes();
		for(byte b:bytes)
		{
			System.out.println(b);
		}
		*/
		String str=new String();
		char arr[]= {'u','s','t',' '};
		str=new String(arr);
		
		System.out.println(str);
		
		str.getChars(0, arr.length-1, arr, 0);
		for(char c:arr) {
			System.out.println(c);
		}
		
		String string=new String("She sells sea shells in sea shore");
		int count=0;
		for(int i=1;i<string.length()-1;i++) {
			if(string.charAt(i)=='\0')
				count++;
	}
		System.out.println(count);
		
		
		String words[]=string.split(" ");
		System.out.println(words.length);
		for(String wors :words)
		{
			System.out.println(wors);
		}
		
	String str1=new String("WELCOME");
	String str3=new String("welcome");
	String str5=new String("welcome");
	boolean result=str1.equals(str3);
	System.out.println(result);
	result=str1.equalsIgnoreCase(str3);
	System.out.println(result);
	
	int val=str3.compareTo(str1);
	System.out.println(val);
	 val=str1.compareTo(str3);
	System.out.println(val);
	 val=str3.compareTo(str5);
	System.out.println(val);
	System.out.println(str1.toLowerCase());
	System.out.println(str1);
	
	String n=new String("16-11-477/6/A/3 Hyderabad 500036");
	int cha=0;
	int digi=0;
	int w=0;
	int d=0;
	int l=0;
	int u=0;
	char c;
		for(int i=0;i<n.length();i++)
		{
			if (Character.isAlphabetic(n.charAt(i)))
				cha++;
			else if(Character.isDigit(n.charAt(i)))
				digi++;
			else if(Character.isWhitespace(n.charAt(i)))
				w++;
			else
				d++;
			if(Character.isLowerCase(n.charAt(i)))
				l++;
			else if(Character.isUpperCase(n.charAt(i)))
				u++;
				  
		}
			System.out.println("No of albpabets  " +cha);
			System.out.println("No. of digits  "+digi);
			System.out.println("No of whitespace "+w);
			System.out.println("Noe of other characters "+d);
			System.out.println("No of lowercase  " +l);
			System.out.println("No of uppercase " +u);
	
		
	}
}
