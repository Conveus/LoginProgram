import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @org.junit.jupiter.api.Test
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
    }
}
