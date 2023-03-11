package serializationtest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployee {

	public static void main(String[] args) throws IOException {
	Employee emp=new Employee(101,"John doe",4000,12345567);
	FileOutputStream fos =new FileOutputStream("emp.dat");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(emp);
	}
}