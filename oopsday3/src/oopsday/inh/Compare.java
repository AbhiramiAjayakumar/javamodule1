package oopsday.inh;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Rectangle r1=new Rectangle();
   Rectangle r2=new Rectangle();
   
   Triangle t1=new Triangle();
   Triangle t2=new Triangle();
	
 //compare primitives
   int a=10;
   int b=35;
   
   boolean result= a==b;
   System.out.println(result);
   
   //comparing object 1.comparing references 2.comparing members.
   
   
   result=r1==r2;
   System.out.println(result);
   
   result=t1==t2;
   System.out.println(result);
   
  // result=r1==t1; //incompatible types.
   
   Rectangle r3=r1;
   result=r3==r1;
   System.out.println(result);

   System.out.println(r1.hashCode());
   System.out.println(r2.hashCode());
   System.out.println(r3.hashCode());
   
   result=r1.equals(r2);
   System.out.println(result);
   
   result=r1.equals(r3);
   System.out.println(result);
   
   
	
	}
	
	

}
