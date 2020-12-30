package co.com.choucair.pruebabancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {

    public static final Target INPUT_CITY = Target.the("input city")
            .located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("input zip")
            .located(By.id("zip"));

    public static final Target INPUT_COUNTRY = Target.the("input country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));

    public static final Target SELECT_DROPDOWN_COUNTRY = Target.the("select dropdown country")
            .located(By.id("ui-select-choices-row-2-46"));

    public static final Target BUTTON_NEXT_PAGE = Target.the("button next page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
