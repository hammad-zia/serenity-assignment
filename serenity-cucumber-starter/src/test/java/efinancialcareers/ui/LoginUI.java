package efinancialcareers.ui;


import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target CREATE_PROFILE = Target.the("verify create profile popup").locatedBy("//span[contains(text(),\"Create your profile\")]");
    public static final Target EMAIL_FIELD = Target.the("email input field").locatedBy("//input[@type=\"email\" and @placeholder=\"Email\"]");
    public static final Target CONTINUE_BUTTON = Target.the("email input field").locatedBy("//button[contains(text(),\"Continue\")]");
    public static final Target JOIN_BUTTON = Target.the("join button").locatedBy("//button[contains(text(),\"Join\")]");
    public static final Target SIGN_IN_BUTTON = Target.the("sign-in button").locatedBy("//button[contains(text(),'Sign in / Register')]");
    public static final Target PASSWORD_FIELD = Target.the("password field").locatedBy("//input[@placeholder=\"Password\"]");
    public static final Target PROFILE_ICON = Target.the("profile icon").locatedBy("//div[@class='auth-container']//child::efc-icon[@icon='profile' and @class='avatar no-image avatar-hover ng-star-inserted']");
    public static final Target EMAIL_ID_IN_PROFILE_MENU = Target.the("email address in profile drop down menu").locatedBy("//span[contains(text(),'qaz12345@test.com')]");
}
