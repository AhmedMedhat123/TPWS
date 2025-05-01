/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ahmed
 */
public class TWPSController {
    private String twpsControllerID;
    private String status;
    private float segmentSpeed;
    private boolean activeEmergency;
    private float trainSpeed;

    public void statusDisplay() {}
    public void receiveSegmentInfo(float speed, String signal) {}
    public void receiveSpeedData(float speed) {}
    public void monitorSpeed() {}
    public void compareSpeedLimit() {}
    public void sendWarningToDriver() {}
    public void applyEmergencyBrake() {}
    public void applyBrake() {}
    public void checkRedSignal() {}
}

