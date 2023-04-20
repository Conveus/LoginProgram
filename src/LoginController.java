import java.util.Scanner;

public class LoginController {

    Scanner input = new Scanner(System.in);
    // Create temp account details
    private String username = "user";
    private String password = "1234";

    // Register account
    // TODO: Write accounts to file
    public void registerAccount(String user, String pass){
        username = user.trim();
        password = pass;
    }

    // Check account details
    // TODO: Check account(s) in file
    public boolean checkAccount(String user, String pass)
    {
        if((username.toLowerCase()).equals(user.toLowerCase().trim()) && password.equals(pass.trim())){
            return true;
        }
        else{
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
