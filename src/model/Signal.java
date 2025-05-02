/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.enums.SignalState;

/**
 *
 * @author ahmed
 */
public class Signal {
    private String signalID;
    private SignalState status;
    
    public SignalState getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        this.status = SignalState.valueOf(newStatus);
    }

    public void notifyTrains() {
        System.out.println("Notifying trains of signal change: " + status);
    }
}

