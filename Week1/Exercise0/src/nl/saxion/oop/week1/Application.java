package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application(), 1000, 1000);
	}

	public void run() {
		boolean log = true;
		UserAccount account = readUserAccount();

		SaxionApp.pause();
		SaxionApp.clear();

		SaxionApp.printLine("******* HI-SECURITY LOG IN TERMINAL **********");
		SaxionApp.print("Username: ");
		String username = SaxionApp.readString();
		SaxionApp.print("Password: ");
		String password = SaxionApp.readString();
		SaxionApp.printLine();
		if (username.equals(account.getUsername()) && account.checkPassword(password)) {
			SaxionApp.print("You are logged in!");
			SaxionApp.setBackgroundColor(Color.green);
		} else {
			SaxionApp.print("You are not logged in!");
			SaxionApp.setBackgroundColor(Color.red);
		}


	}

	private UserAccount readUserAccount() {
		SaxionApp.print("Please enter a new user name: ");
		String username = SaxionApp.readString();
		SaxionApp.print("Please enter a password for user \"" + username + "\": ");
		String password = SaxionApp.readString();

		UserAccount newAccount = new UserAccount(username, password);
		return newAccount;
	}

}
