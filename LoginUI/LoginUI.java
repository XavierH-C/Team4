import java.util.Scanner;
public class LoginUI {
	private LoginControl loginControl;
	private int accType;
	private int id;
	
	public LoginUI(LoginControl control) {
		this.loginControl = control;
		this.accType = 0;
		this.id = 0;
	}
	
	public void displayAccTypeForm() {
		System.out.println("Enter your account type: 1 - Student, 2 - Professor, 3 - TeachingAssistant, 4 - Admin");
	}
	
	public void displayUserIdForm() {
		System.out.println("Enter your id");
	}

	public void displayPasswordForm() {
		System.out.println("Enter your password");
	}
	
	public void enterAccType() {
		Scanner scanner = new Scanner(System.in);
		this.accType = scanner.nextInt();
		scanner.close();
		
	}
	
	public void enterUserId() {
		Scanner scanner = new Scanner(System.in);
		this.id = scanner.nextInt();
		scanner.close();
	}
	
	public void enterPassword() {
		Scanner scanner = new Scanner(System.in);
		String password = scanner.next();
		scanner.close();
		if (this.accType == 1) {
			Student student = loginControl.processStudentLogin(this.id, password);
			displayStudent(student);
		}
		
		else if (this.accType == 2) {
			Professor professor = loginControl.processProfessorLogin(this.id, password);
			displayProfessor(professor);
		}
		
		else if (this.accType == 3) {
			TeachingAssistant teachingAssistant = loginControl.processTeachingAssistantLogin(this.id, password);
			displayTeachingAssistant(teachingAssistant);
		}
		
		else if (this.accType == 4) {
			Admin admin = loginControl.processAdminLogin(this.id, password);
			displayAdmin(admin);
		}
		
		else {
			System.out.println("Error: Account type invalid");
		}
		
	}
	
	public void displayStudent(Student student) {
		if (student.firstName == null) 
			System.out.println("No customer is found.");
		else {
			System.out.println("Customer Login Result: ");
			System.out.println("First Name: " + student.firstName);
			System.out.println("Last Name: " + student.lastName); 
			System.out.println("Address: " + student.address);
			System.out.println("Contact Info: " + student.contactInfo);
			System.out.println();
			}
		
	}
	
	public void displayProfessor(Professor professor) {
		if (professor.firstName == null) 
			System.out.println("No customer is found.");
		else {
			System.out.println("Customer Login Result: ");
			System.out.println("First Name: " + professor.firstName);
			System.out.println("Last Name: " + professor.lastName); 
			System.out.println("Address: " + professor.address);
			System.out.println("Contact Info: " + professor.contactInfo);
			System.out.println();
			}
		
	}
	
	public void displayTeachingAssistant(TeachingAssistant teachingAssistant) {
		if (teachingAssistant.firstName == null) 
			System.out.println("No customer is found.");
		else {
			System.out.println("Customer Login Result: ");
			System.out.println("First Name: " + teachingAssistant.firstName);
			System.out.println("Last Name: " + teachingAssistant.lastName); 
			System.out.println("Address: " + teachingAssistant.address);
			System.out.println("Contact Info: " + teachingAssistant.contactInfo);
			System.out.println();
			}
		
	}
	
	public void displayAdmin(Admin admin) {
		if (admin.firstName == null) 
			System.out.println("No customer is found.");
		else {
			System.out.println("Customer Login Result: ");
			System.out.println("First Name: " + admin.firstName);
			System.out.println("Last Name: " + admin.lastName); 
			System.out.println("Address: " + admin.address);
			System.out.println("Contact Info: " + admin.contactInfo);
			System.out.println();
			}
		
	}

}
