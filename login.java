import java.util.Scanner;

public class ConsoleLogin {

	    public static void main(String[] args) {
		            String correctUsername = "user";
			            String correctPassword = "password123";

				            Scanner scanner = new Scanner(System.in);

					            System.out.print("Enter username: ");
						            String enteredUsername = scanner.nextLine();

							            System.out.print("Enter password: ");
								            String enteredPassword = scanner.nextLine();

									            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
											                System.out.println("Login Successful! Welcome, " + enteredUsername + "!");
													        } else {
															            System.out.println("Invalid username or password.");
																            }

										            scanner.close();
											        }
}
