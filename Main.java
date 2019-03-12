package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Employee> map =new HashMap<Integer,Employee>();
		
		Employee e1 =new Employee(1, "Riasad", "CSE",2000);
		Employee e2 =new Employee(2, "Riad", "EEE",3000);
		Employee e3 =new Employee(3, "sad", "EEE",4000);
		
		map.put(101,e1);
		map.put(102,e2);
		map.put(103,e3);
		int count =0;
		
		for(Map.Entry<Integer,Employee> entry :map.entrySet()) {
			
			int  key =entry.getKey();
			
			Employee e =entry.getValue();
		
		//e1.Department.charAt()
			for (Integer key1 :map.keySet()) {
			
			if (key1.equals(e.Name)) {
				
				count ++;
			}}
			System.out.println("Key "+key+"ID :"+e.Id+"Name :"+e.Name+" count : "+count+"\nDepartment :"+e.Department+"Salary :"+e.Salary);
		}
		
		
	}

}
