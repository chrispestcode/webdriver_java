package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void acceptAlert(){
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Alert message is incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputAlert(){
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerPrompt();
        String text = "TAU Rocks!";
        alertsPage.setInput(text);
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getResult(), "You entered: " +  text, "Results text incorrect");
    }
}
