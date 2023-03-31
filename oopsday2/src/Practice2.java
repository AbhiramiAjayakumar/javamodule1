
public class Practice2 {

	public static void main(String[] args) {
		String str="i love you";
		for(int i=0;i<str.length();i++) {
			if(i%2==0)
			{
				System.out.print(str.substring(i,i+1).toUpperCase());
			}
			else {
				System.out.print(str.substring(i,i+1).toLowerCase());
	}

}
}
}