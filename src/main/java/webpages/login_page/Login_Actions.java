package webpages.login_page;

import org.openqa.selenium.WebDriver;

/**
 * @author Mohamed_Amr
 * This class has all the methods (Actions) that are done upon elements in the Login webpage.
 */
public class Login_Actions extends Login_WebElements {


    /**************************************CONSTRUCTORS********************************************/

    public Login_Actions(WebDriver driver)
    {
        super(driver);
    }

    /**************************************METHODS***************************************************/


    public void insert_Username(String email_Address)
    {
        writeText(username_Txt, email_Address);
    }

    public void insert_Password(String password)
    {
        writeText(password_Txt, password);
    }

    public void click_Login_Btn()
    {
        clickWebElement(login_Btn);
    }


    public void login(String user_Name, String password)
    {
        insert_Username(user_Name);
        insert_Password(password);
        click_Login_Btn();
    }
    public void assertErrorMsg(String msg){
        assert_Actual_Text_Contains_Expected_Text(msg,error_Msg,"Not found");
    }



}
