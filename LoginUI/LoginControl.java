public class LoginControl {
	private DataManager dataManager;
	
	public LoginControl(DataManager dm) {
		this.dataManager = dm;
	}
	
	public Student processStudentLogin(int studentId, String password){
		return dataManager.studentLogin(studentId, password);
	}
	
	public Professor processProfessorLogin(int professorId, String password){
		return dataManager.professorLogin(professorId, password);
	}
	
	public TeachingAssistant processTeachingAssistantLogin(int teachingAssistantId, String password){
		return dataManager.teachingAssistantLogin(teachingAssistantId, password);
	}
	
	public Admin processAdminLogin(int adminId, String password){
		return dataManager.adminLogin(adminId, password);
	}
}
