package jdk_implementation.display_elements;

import jdk_implementation.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maximumTemperature = 0.0f;
    private float minimumTemperature = 200;
    private float sumOfTemperatures = 0.0f;
    private int numberOfReadings;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            float temp = weatherData.getTemperature();
            sumOfTemperatures += temp;
            numberOfReadings++;

            if (temp > maximumTemperature) {
                maximumTemperature = temp;
            }

            if (temp < minimumTemperature) {
                minimumTemperature = temp;
            }

            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature using java library = " + (sumOfTemperatures / numberOfReadings)
                + "/" + maximumTemperature + "/" + minimumTemperature);
    }
}
