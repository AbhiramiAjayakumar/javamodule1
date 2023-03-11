package strings;

public class E {

	public static void main(String[] args) {
		String sc=new String("ammu is sooper.How are youy");
		String word[]=sc.split("[.]");
		System.out.println(word.length);
		for(String s:word)
		{
			System.out.println(s);
		}
		sc=new String("cartoon");
		System.out.println(sc.startsWith("car"));
		System.out.println(sc.endsWith("on"));
		
		int apos=sc.indexOf('c');
		System.out.println(apos);
		int tpos=sc.indexOf('n');
		System.out.println(tpos);
		String sc1=sc.substring(apos,tpos+1);
		System.out.println(sc1);
		
		String pal=new String("madam");
		/*
		 * int ipos=pal.indexOf('m'); int lpos=pal.indexOf('d'); String
		 * ind=pal.substring(ipos,lpos+1); System.out.println(ind);
		 */		int mpos=pal.lastIndexOf('m');
		int spos=pal.indexOf('m');
		//String palindrome=pal.substring();
		//System.out.println(palindrome);
		
		
		
		
		
		String email=new String("aneeta.roy@ust.com");
		int pos=email.lastIndexOf('.');
		System.out.println(pos);
		int l=email.indexOf('m');
		String p=email.substring(pos,l+1);
		System.out.println(p);
	
		
	}
	
}