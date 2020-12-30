package co.com.choucair.pruebabancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicePage {
    public static final Target INPUT_COMPUTER = Target.the("input computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));

    public static final Target SELECT_DROPDOWN_COMPUTER = Target.the("select computer dropdown")
            .located(By.id("ui-select-choices-row-3-1"));


    public static final Target INPUT_VERSION = Target.the("input version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target SELECT_DROPDOWN_VERSION = Target.the("select version dropdown")
            .located(By.id("ui-select-choices-row-4-16"));


    public static final Target INPUT_LANGUAGE = Target.the("input language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));

    public static final Target SELECT_DROPDOWN_LANGUAGE = Target.the("select language dropdown")
            .located(By.id("ui-select-choices-row-5-37"));


    public static final Target INPUT_DEVICE = Target.the("input device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));

    public static final Target SELECT_DROPDOWN_DEVICE = Target.the("select device dropdown")
            .located(By.id("ui-select-choices-row-6-2"));


    public static final Target INPUT_MODEL = Target.the("input model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));

    public static final Target SELECT_DROPDOWN_MODEL = Target.the("select model dropdown")
            .located(By.id("ui-select-choices-row-7-4"));



    public static final Target INPUT_SYSTEM = Target.the("input system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));

    public static final Target SELECT_DROPDOWN_SYSTEM = Target.the("select system dropdown")
            .located(By.id("ui-select-choices-row-8-7"));


    public static final Target BUTTON_NEXT_PAGE = Target.the("button next page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
