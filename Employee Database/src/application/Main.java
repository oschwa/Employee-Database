package application;
	
import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		launch(args);
		
		// Employee Variables
		String firstName, lastName, dob, id, empTask, email, employeeType = "";
		double salary = 0.0;
		int hours = 0;
		char middleInitial, input;
		
		// Different Employee Objects and Scanner Object
		Scanner scan = new Scanner(System.in);
		SDev sdev;
		JDev jdev;
		PLead plead;
		CEO ceo;
		Intern intern;
		Database data = new Database();
		
		// Start the program
		System.out.println(".:.:.:.:.:. Welcome to the Employee Database .:.:.:.:.:.");
		
		do {
			printMenu();
			input = scan.nextLine().toLowerCase().charAt(0);
			switch(input) {
				
			case 'a':
				System.out.println(".:.:.:. Adding Employee .:.:.:.");
				System.out.println("Enter Employee Type (Intern, Junior Developer, Senior Developer, Project Lead, or CEO): ");
				employeeType = scan.nextLine();
				if(employeeType.equalsIgnoreCase("Intern")){
					System.out.print("Enter First Name: ");
					firstName = scan.next();
					System.out.print("Enter Last Name: ");
					lastName = scan.next();
					System.out.print("Enter Middle Initial: ");
					middleInitial = scan.next().charAt(0);
					System.out.print("Enter Date of Birth: ");
					dob = scan.next();
					System.out.print("Enter ID: ");
					id = scan.next();
					System.out.print("Enter Hourly Rate: ");
					salary = scan.nextDouble();
					System.out.print("Enter Weekly Hours: ");
					hours = scan.nextInt();
					System.out.print("Enter Task: ");
					empTask = scan.nextLine();
					System.out.print("Enter Email: ");
					email = scan.next();
					
					intern = new Intern(firstName, lastName, middleInitial, dob, id, salary, empTask, hours, email);
					data.add(id, intern);
					
					System.out.println("Employee Added!");
					
				} else if(employeeType.equalsIgnoreCase("Junior Developer")) {
					System.out.print("Enter First Name: ");
					firstName = scan.next();
					System.out.print("Enter Last Name: ");
					lastName = scan.next();
					System.out.print("Enter Middle Initial: ");
					middleInitial = scan.next().charAt(0);
					System.out.print("Enter Date of Birth: ");
					dob = scan.next();
					System.out.print("Enter ID: ");
					id = scan.next();
					System.out.print("Enter Hourly Rate: ");
					salary = scan.nextDouble();
					System.out.print("Enter Weekly Hours: ");
					hours = scan.nextInt();
					System.out.print("Enter Task: ");
					empTask = scan.nextLine();
					System.out.print("Enter Email: ");
					email = scan.next();
					
					jdev = new JDev(firstName, lastName, middleInitial, dob, id, salary, empTask, hours, email);
					data.add(id, jdev);
					
					System.out.println("Employee Added!");
					
				} else if(employeeType.equalsIgnoreCase("Senior Developer")) {
					System.out.print("Enter First Name: ");
					firstName = scan.next();
					System.out.print("Enter Last Name: ");
					lastName = scan.next();
					System.out.print("Enter Middle Initial: ");
					middleInitial = scan.next().charAt(0);
					System.out.print("Enter Date of Birth: ");
					dob = scan.next();
					System.out.print("Enter ID: ");
					id = scan.next();
					System.out.print("Enter Hourly Rate: ");
					salary = scan.nextDouble();
					System.out.print("Enter Weekly Hours: ");
					hours = scan.nextInt();
					System.out.print("Enter Task: ");
					empTask = scan.nextLine();
					System.out.print("Enter Email: ");
					email = scan.next();
					
					sdev = new SDev(firstName, lastName, middleInitial, dob, id, salary, empTask, hours, email);
					data.add(id, sdev);
					
					System.out.println("Employee Added!");
					
				} else if(employeeType.equalsIgnoreCase("Project Lead")) {
					System.out.print("Enter First Name: ");
					firstName = scan.next();
					System.out.print("Enter Last Name: ");
					lastName = scan.next();
					System.out.print("Enter Middle Initial: ");
					middleInitial = scan.next().charAt(0);
					System.out.print("Enter Date of Birth: ");
					dob = scan.next();
					System.out.print("Enter ID: ");
					id = scan.next();
					System.out.print("Enter Hourly Rate: ");
					salary = scan.nextDouble();
					System.out.print("Enter Weekly Hours: ");
					hours = scan.nextInt();
					System.out.print("Enter Task: ");
					empTask = scan.nextLine();
					System.out.print("Enter Email: ");
					email = scan.next();
					
					plead = new PLead(firstName, lastName, middleInitial, dob, id, salary, empTask, hours, email);
					data.add(id, plead);
					
					System.out.println("Employee Added!");
					
				} else if(employeeType.equalsIgnoreCase("CEO")) {
					System.out.print("Enter First Name: ");
					firstName = scan.next();
					System.out.print("Enter Last Name: ");
					lastName = scan.next();
					System.out.print("Enter Middle Initial: ");
					middleInitial = scan.next().charAt(0);
					System.out.print("Enter Date of Birth: ");
					dob = scan.next();
					System.out.print("Enter ID: ");
					id = scan.next();
					System.out.print("Enter Hourly Rate: ");
					salary = scan.nextDouble();
					System.out.print("Enter Weekly Hours: ");
					hours = scan.nextInt();
					System.out.print("Enter Task: ");
					empTask = scan.nextLine();
					System.out.print("Enter Email: ");
					email = scan.next();
					
					ceo = new CEO(firstName, lastName, middleInitial, dob, id, salary, empTask, hours, email);
					data.add(id, ceo);
					
					System.out.println("Employee Added!");
					
				} else {
					System.out.println("Error! That position does not exist at this company.");
				} break;
			case 'r':
				System.out.println(".:.:.:. Removing Employee .:.:.:.");
				String tempID = "";
				System.out.print("Enter employee ID: ");
				tempID = scan.next();
				
				data.remove(tempID);
				break;
			case 'u':
				System.out.println("Enter the ID for the employee's information you want to update: ");
				
			}
			System.out.println("::::::::::::::::::::::::::::::::::::::::");
		} while (true);
		
		
	}
	
	// Menu Method to give the user an option to do something
	public static void printMenu() {
		System.out.println("-------- MENU --------");
		System.out.println("a - Add Employee");
		System.out.println("r - Remove Employee");
		System.out.println("u - Update Employee Information");
		System.out.println("p - Print All Employee's Information");
		System.out.println("q - Print An Individual Employee's Information");
		System.out.println("k - Promote An Employee");
		System.out.println("d - Demote An Employee");
		System.out.println("o - Quit Program");
		System.out.println("Choose an option: ");
	}
}
