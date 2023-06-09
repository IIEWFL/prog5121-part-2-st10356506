
import static org.testng.Assert.*;
import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=2EIUHHoVfmU
//import test class
public class LoginP2NGTest {
    static LoginP2 login1 = new LoginP2();
    //declare new login variable
//https://netbeans.apache.org/kb/docs/java/junit-intro.html
    public LoginP2NGTest() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testCheckUserName() {
        //class to check username
        assertTrue(LoginP2.checkUserName("kyl_"));//correct format
        assertFalse(LoginP2.checkUserName("kyle!!!!!!!"));//incorrect format
    }

    @Test
    public void testCheckPasswordComplexity() {
        //class to check password complexity
        assertTrue(LoginP2.checkPasswordComplexity("Ch&&sec@ke99!"));//correct format
        assertFalse(LoginP2.checkPasswordComplexity("password"));    //incorrect format 
    }

    @Test
    public void testRegisterUser() {
        //class to check register user
        assertTrue(LoginP2.registerUser());
    }

    @Test
    public void testLoginUser() {
    }
    
}
