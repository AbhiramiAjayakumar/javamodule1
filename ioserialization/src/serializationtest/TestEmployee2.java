package serializationtest;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.NotSerializableException;

public class TestEmployee2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{

			FileInputStream fis=new FileInputStream("D:\\ustcore\\ioserialization\\emp.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=ois.readObject();
			Employee ref=(Employee)obj;
			System.out.println(ref);
	}

}
