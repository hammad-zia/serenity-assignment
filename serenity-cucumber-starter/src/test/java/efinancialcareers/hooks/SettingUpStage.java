package efinancialcareers.hooks;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SettingUpStage {
    @Before(order = 1)
    public void SettingUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Tarek");


    }
}
