package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class plane {
@Setter
@Getter
    private List<String> Passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.Passengers = new ArrayList<>();
    }
    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
    public void land() {
        this.lastTimeLanded = new Date();
        this.Passengers.clear();
    }
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return Passengers;
    }

    public void onboard(String passenger) {
        this.Passengers.add(passenger);
    }

}
