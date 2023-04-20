import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // Instantiate objects
        Scanner reader = new Scanner(System.in);
        LoginController loginController = new LoginController();

        // Create variables
        String option = "";
        String enteredUser;
        String enteredPass;
        boolean validOption = false;
        boolean correctAccount = false;

        System.out.println("Welcome!");
        // Make user reenter invalid options
        while (!validOption)
        {
            System.out.print("To login enter '1', to register enter '2': ");
            try{
                option = reader.nextLine().trim();
                if(option.equals("1") || option.equals("2")){
                    validOption = true;
                }
                else{
                    System.out.println("Invalid entry, please try again");
                }
            } catch(Exception e1){
                System.out.println("Invalid entry, please try again");
            }


        }

        if(option.equals("1")){
            System.out.println("You have selected login");
            while (!correctAccount){
                System.out.print("Please enter your username: ");
                enteredUser = reader.nextLine();
                System.out.print("Please enter your password: ");
                enteredPass = reader.nextLine();
                if(loginController.checkAccount(enteredUser,enteredPass)){
                    correctAccount = true;
                }
                else{
                    System.out.println("Incorrect login, try again");
                }
            }
        } else if (option.equals("2")) {
            System.out.println("You have selected register");
            System.out.print("Please enter a username: ");
            enteredUser = reader.nextLine();
            System.out.print("Please enter a password: ");
            enteredPass = reader.nextLine();

            loginController.registerAccount(enteredUser,enteredPass);
        }

        System.out.println("Welcome " + loginController.getUsername());
        // TODO: Add ability to delete account when file accounts implemented
        validOption = false;
        System.out.println("What would you like to do?");
        while (!validOption)
        {
            System.out.print("To delete account enter '2': ");
            try{
                option = reader.nextLine().trim();
                if(option.equals("2")){
                    validOption = true;
                }
                else{
                    System.out.println("Invalid entry, please try again");
                }
            } catch(Exception e1){
                System.out.println("Invalid entry, please try again");
            }
        }

        if(option.equals("2")){
            loginController.deleteAccount();
        }
    }
}
