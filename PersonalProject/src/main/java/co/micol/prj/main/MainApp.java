package co.micol.prj.main;

import co.micol.prj.Menu.Menu;
import co.micol.prj.command.LoginCheck;

public class MainApp {
	public static void main(String[] args) {
		LoginCheck login = new LoginCheck();
		
		Menu menu = new Menu();
		login.run();
		menu.run();
	}
}

