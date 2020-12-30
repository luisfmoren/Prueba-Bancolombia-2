package co.com.choucair.pruebabancolombia.tasks;

import co.com.choucair.pruebabancolombia.userinterface.LocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Location implements Task {

    private String city;
    private String postalCode;

    public Location(String city, String postalCode) {
        this.city = city;
        this.postalCode = postalCode;
    }

    public static Performable the(String city, String postalCode){
        return Tasks.instrumented(Location.class,city,postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(city).into(LocationPage.INPUT_CITY),
                Enter.theValue(postalCode).into(LocationPage.INPUT_ZIP),
                Click.on(LocationPage.INPUT_COUNTRY),
                Click.on(LocationPage.SELECT_DROPDOWN_COUNTRY),
                Click.on(LocationPage.BUTTON_NEXT_PAGE));
    }
}
