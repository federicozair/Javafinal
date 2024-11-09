package com.example.tienda.External;

public class WorldClockResponse {
    private String currentDateTime;

    // Getter
    public String getCurrentDateTime() {
        return currentDateTime;
    }

    // Setter
    public void setCurrentDateTime(String currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    // Método para usar el campo
    public void printDateTime() {
        System.out.println("Current Date and Time: " + currentDateTime);
    }
}
