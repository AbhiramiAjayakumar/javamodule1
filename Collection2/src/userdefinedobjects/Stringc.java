package userdefinedobjects;

public class Stringc {

	public static void main(String[] args) {
		int i=1232;
		String str=i+" ";
		StringBuilder sb=new StringBuilder(str);
		StringBuilder sc=new StringBuilder(sb);
		System.out.println(sb);
		sc=sb.reverse();
		boolean result=str.equals(sc.toString());
		System.out.println(result);
		
		
		
		
		/*
		 * String anu=new String("ammu"); System.out.println(anu.concat("ajay")); //String object concatination
		 */

		/*
		 * String s="ammu"; String m="anu"; System.out.println(s+m);//normal concatination
		 */
	}

}
