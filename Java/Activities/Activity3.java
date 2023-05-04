package org.example;

public class Activity3  {
    public static void main(String args[]) {
        double seconds = 1000000000;

        double EarthSeconds = 550;
        double MercurySeconds = 0.2467;
        double VenusSeconds = 0.19726;
        double MarsSeconds = 1.8158;
        double JupiterSeconds = 11.2615;
        double SaturnSeconds = 29.7498;
        double UranusSeconds = 4.016846;
        double NeptuneSeconds = 4.79132;

        System.out.println("Age on Mercury: " + seconds / EarthSeconds / MercurySeconds);
        System.out.println("Age on Venus: " + seconds / EarthSeconds / VenusSeconds);
        System.out.println("Age on Earth: " + seconds / EarthSeconds);
        System.out.println("Age on Mars: " + seconds / EarthSeconds / MarsSeconds);
        System.out.println("Age on Jupiter: " + seconds / EarthSeconds / JupiterSeconds);
        System.out.println("Age on Saturn: " + seconds / EarthSeconds / SaturnSeconds);
        System.out.println("Age on Uranus: " + seconds / EarthSeconds / UranusSeconds);
        System.out.println("Age on Neptune: " + seconds / EarthSeconds / NeptuneSeconds);
    }
}

