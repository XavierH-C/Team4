public class LoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataManager dm = new DataManager();
		LoginControl control = new LoginControl(dm);
		LoginUI ui = new LoginUI(control);
		
		
		ui.displayAccTypeForm();
		ui.enterAccType();
		ui.displayUserIdForm();
		ui.enterUserId();
		ui.displayPasswordForm();
		ui.enterPassword();
	};
}
