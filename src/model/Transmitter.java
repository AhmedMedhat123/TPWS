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
public class Transmitter {
    private String transmitterID;
    private float broadcastSpeedLimit;
    private float position;
    private SignalState signalStatus;

    public Transmitter(float position, float speedLimit, SignalState signalStatus) {
        this.position = position;
        this.broadcastSpeedLimit = speedLimit;
        this.signalStatus = signalStatus;
    }
    
    public void broadcast(Segments segment) {
        this.broadcastSpeedLimit = segment.getSpeed();
        // Broadcasting happens every 50ms in real implementation
    }
    
    public float getBroadcastSpeedLimit() {
        return broadcastSpeedLimit;
    }
    
    public SignalState getSignalStatus() {
        return signalStatus;
    }
    
    public float getPosition() {
        return position;
    }
}

