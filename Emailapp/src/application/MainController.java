package application;

import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordlength = 10;
	private String companySuffix = "joelscompany.com";
	private String alternateEmail;
	
	public MainController (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created : " + this.firstName + " " + this.lastName);
		
		//call a method asking for Department - return department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//call a method that return a random password
		//this.password = randomPassword(defaultPasswordlength);
		System.out.println("Your Password is : " + this.password );
		
		//combine elements to generate email
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	@FXML private Button showInfo;
	@FXML private TextArea txtArea;
	@FXML private Label lblStatus;
	@FXML private RadioButton rb1;
	@FXML private RadioButton rb2;
	@FXML private RadioButton rb3;
	@FXML private RadioButton rb4;
	@FXML private TextField txtFirstname;
	@FXML private TextField txtLastname;
	@FXML private TextField txtpassword;
	
	public void Firstname (ActionEvent event) {
		Scanner scan = new Scanner(System.in);
		firstName = scan.next();
	    this.firstName = firstName;
	}
	
	public void Lastname (ActionEvent event) {
		Scanner scan = new Scanner(System.in);
		lastName = scan.next();
		this.lastName = lastName;
	}
	
	public void Password (ActionEvent event) {
		Scanner scan = new Scanner(System.in);
		password = scan.next();
		this.password = password;
	}
	
	public void showInfo (ActionEvent event) {
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		txtArea.setText("DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb");
		
	}
	
	public void radioSelect (ActionEvent event) {
		String message = "";
		if (rb1.isSelected()) {
			message += rb1.getText() + "\n";
		}
		if (rb2.isSelected()) {
			message += rb2.getText() + "\n";
		}
		if (rb3.isSelected()) {
			message += rb3.getText() + "\n";
		}
		if (rb4.isSelected()) {
			message += rb4.getText() + "\n";
		}
		lblStatus.setText(message);
	}

//	//generate a random password
//	public String randomPassword(ActionEvent event) {
//		    int length = 0;
//			String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
//			char[] password = new char[length];
//			for (int i = 0; i<length; i++) {
//				int rand = (int) (Math.random() * passwordSet.length());
//				password[i] = passwordSet.charAt(rand);
//				
//			}
//			return new String(password);
//			
//		}
	
	//select a department
	private String setDepartment() {
		System.out.println("Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
		Scanner scan = new Scanner(System.in);
		int depChoice = scan.nextInt();
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acc";}
		else {return " ";}
	}
	
	public void Login (ActionEvent event) throws Exception {
		if(txtFirstname.getText().equalsIgnoreCase(firstName) && txtLastname.getText().equalsIgnoreCase(lastName) && txtpassword.getText().equalsIgnoreCase(password)) {
			lblStatus.setText("Login success");
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} else {
			lblStatus.setText("Login failed");
		}
	}
	
	
	//set the mail box capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail (String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change password
	public void changePassword (String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
//	public String showInfo() {
//		return "DISPLAY NAME: " + firstName + " " + lastName +
//				"\nCOMPANY EMAIL: " + email +
//				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
//	}
}
