package application;

import java.util.HashMap;

public class Database {
	
	HashMap<String, Object> byID = new HashMap<String, Object>();
	
	
	// Add Method by ID
	
	public void add(String id, Object object) {
		byID.put(id, object);
		
	}
	
	// Remove Method by ID
	public void remove(String id) {
		if(byID.containsKey(id)) {
			byID.remove(id);
		} else {
			System.out.println("No employee with that ID exists in the system.");
		}
	}
	
	// Update Method by ID
	public void update(String id, Object object) {
		if(byID.containsKey(id)) {
			byID.replace(id, object);
		} else {
			System.out.println("No employee with that ID exists in the system.");
		}
	}
	
	
}
