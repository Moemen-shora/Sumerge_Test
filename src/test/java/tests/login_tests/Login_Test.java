package tests.login_tests;

import org.testng.annotations.*;
import testBases.Login_TestBase;
import webpages.login_page.Login_Actions;


public class Login_Test extends Login_TestBase {

    private Login_Actions lp;


    String username = "standard_user";
    String valid_Password = "secret_sauce";
    String invalid_Password = "secretsauce";
    String error_Msg = "Epic sadface: Username and password do not match any user in this service";
   @Test
    public void login_With_Valid_Cred()
    {
        lp = new Login_Actions(driver);

        lp.insert_Username(username);
        lp.insert_Password(valid_Password);
        lp.click_Login_Btn();


    }

    @Test
    public void login_With_InValid_Cred()
    {
        lp = new Login_Actions(driver);

        lp.insert_Username(username);
        lp.insert_Password(invalid_Password);
        lp.click_Login_Btn();
        lp.assertErrorMsg(error_Msg);
    }
}
