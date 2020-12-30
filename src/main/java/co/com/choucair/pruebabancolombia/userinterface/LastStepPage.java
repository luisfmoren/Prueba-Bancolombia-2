package co.com.choucair.pruebabancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStepPage {
    public static final Target INPUT_PASSWORD = Target.the("input password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("input confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_STAY_INFORMED = Target.the("check stay informed")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target CHECK_TERMS = Target.the("check terms of use")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_PRIVACY = Target.the("check privacy and security")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target TEXT_PAGE = Target.the("confirm text in page for the question")
            .located(By.xpath("//*[@id=\"side_banner\"]/div[2]/div[1]"));
}
