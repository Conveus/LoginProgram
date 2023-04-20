import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    /*@org.junit.jupiter.api.Test
    void AccountCheckShouldReturnFalse(){
        var loginControl = new LoginController();
        assertFalse(loginControl.checkAccount("wrong","wrong"));
    }

    @org.junit.jupiter.api.Test
    void AccountCheckShouldReturnTrue(){
        var loginControl = new LoginController();
        assertTrue(loginControl.checkAccount("user","1234"));
    }

    @org.junit.jupiter.api.Test
    void AccountCheckShouldReturnTrueRegardlessOfUsernameCapitalization(){
        var loginControl = new LoginController();
        assertTrue(loginControl.checkAccount("uSeR","1234"));
    }

    @org.junit.jupiter.api.Test
    void AccountCheckShouldReturnTrueEvenWithSpacesAtTheEndOfAUsername(){
        var loginControl = new LoginController();
        assertTrue(loginControl.checkAccount("user  ","1234"));
    }*/

    @org.junit.jupiter.api.Test
    void RegisterShouldCreateFileInAccountFolderUsingUsername() throws IOException {
        var loginControl = new LoginController();
        assertTrue(loginControl.registerAccount("Test","Test"));
    }

    @org.junit.jupiter.api.Test
    void RegisterShouldNotCreateFileIfAlreadyExists() throws IOException {
        var loginControl = new LoginController();
        assertFalse(loginControl.registerAccount("Test","Test"));
    }

    @org.junit.jupiter.api.Test
    void RecordShouldWriteAccountDetailsToFile() throws IOException {
        var loginControl = new LoginController();
        assertTrue(loginControl.recordAccountDetails("Test","Test", loginControl.location+"test.txt"));
    }

    @org.junit.jupiter.api.Test
    void CheckAccountShouldReturnTrueOnCorrectDetails() throws IOException {
        var loginControl = new LoginController();
        assertTrue(loginControl.checkAccount("Test", "Test"));
    }

    @org.junit.jupiter.api.Test
    void CheckAccountShouldReturnFalseOnWrongDetails() throws IOException {
        var loginControl = new LoginController();
        assertFalse(loginControl.checkAccount("Test", "test"));
    }

    /*@org.junit.jupiter.api.Test
    void DeleteAccountShouldNotDeleteTheFileIfConfirmationNotGiven() throws IOException {
        var loginControl = new LoginController();
        assertTrue(loginControl.deleteAccount());
    }

    @org.junit.jupiter.api.Test
    void DeleteAccountShouldDeleteTheFileIfConfirmationGiven() throws IOException {
        var loginControl = new LoginController();
        assertTrue(loginControl.deleteAccount());
    }*/
}
