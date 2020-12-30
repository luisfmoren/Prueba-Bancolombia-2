package co.com.choucair.pruebabancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformationPage {
    public static final Target BUTTON_SIGNIN = Target.the("button sign in")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target INPUT_FIRST_NAME = Target.the("input first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("input last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("input email")
            .located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("input month")
            .located(By.id("birthMonth"));

    public static final Target INPUT_DAY = Target.the("input day")
            .located(By.id("birthDay"));

    public static final Target INPUT_YEAR = Target.the("input year")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXT_PAGE = Target.the("button next page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
