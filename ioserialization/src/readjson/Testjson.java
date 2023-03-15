package readjson;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Testjson {

	public static void main(String[] args) {
	
		JSONObject employeeDetails1=new JSONObject();
		employeeDetails1.put("firstname","Maria");
		employeeDetails1.put("lastname","George");
		employeeDetails1.put("Website","javaport.in");
		
		 JSONObject employeeObject = new JSONObject(); 
	     employeeObject.put("employee", employeeDetails1);
		
		
		JSONObject employeeDetails2=new JSONObject();
		employeeDetails2.put("firstname","Sree");
		employeeDetails2.put("lastname","Lakshmi");
		employeeDetails2.put("Website","javaport");
		
		
		JSONObject employeeObject2=new JSONObject(); 
        employeeObject2.put("employee", employeeDetails2);
         
        
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        
        try (FileWriter file=
        		new FileWriter("employees.json")){
        file.write(employeeList.toJSONString());
        file.flush();
        
        
        } catch(IOException e)
        {
        	e.printStackTrace();
        }
		
	}

}
