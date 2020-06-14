package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeatherAlertsSystemTestSuite {

    WeatherAlertsSystem weatherAlertsSystem = new WeatherAlertsSystem();
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @BeforeEach
    public void addLocationsAndClients() {
        weatherAlertsSystem.addLocation("Warszawa");
        weatherAlertsSystem.addLocation("Gdańsk");
        weatherAlertsSystem.addClient("Warszawa", client);
        weatherAlertsSystem.addClient("Warszawa", secondClient);
        weatherAlertsSystem.addClient("Gdańsk", thirdClient);
    }

    @Test
    public void shouldAddClientToLocation() {
        boolean testResult = weatherAlertsSystem.addClient("Warszawa", thirdClient);
        assertTrue(testResult);
    }

    @Test
    public void shouldRemoveClientFromLocation() {
        boolean testResult = weatherAlertsSystem.removeClient("Gdańsk", thirdClient);
        assertTrue(testResult);
    }

    @Test
    public void shouldRemoveClientFromAllLocations() {
        weatherAlertsSystem.addClient("Warszawa", thirdClient);
        weatherAlertsSystem.removeClient("Warszawa", thirdClient);
        Map<String, Set<Client>> locations = weatherAlertsSystem.getLocations();
        assertEquals(2, locations.get("Warszawa").size());
        assertEquals(1, locations.get("Gdańsk").size());
    }

    @Test
    public void shouldNotifyClientsForLocation() {
        weatherAlertsSystem.notifyClient("Gdańsk", notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.never()).receive(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldNotifyAllClients() {
        weatherAlertsSystem.noifyClients(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveLocation() {
        weatherAlertsSystem.removeLocation("Gdańsk");
        Map<String, Set<Client>> locations = weatherAlertsSystem.getLocations();
        assertEquals(2, locations.get("Warszawa").size());
    }
}
