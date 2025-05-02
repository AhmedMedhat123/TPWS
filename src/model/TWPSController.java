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
    
    public float getTrainSpeed() {
        return trainSpeed;
    }
    
    public void setTrainSpeed(float speed) {
        this.trainSpeed = speed;
    }
    
    public void statusDisplay() {
        this.status = "Train: " + trainSpeed + " km/h | Limit: " + segmentSpeed + " km/h";
    }
    
    public void receiveSegmentInfo(float speed, String signal) {
        this.segmentSpeed = speed;
        if ("RED".equals(signal)) {
            checkRedSignal();
        }
    }

    public void receiveSpeedData(float speed) {
        this.trainSpeed = speed;
        monitorSpeed();
    }

   public void monitorSpeed() {
    if (trainSpeed > segmentSpeed + 5) {
        sendWarningToDriver();
    }
    if (trainSpeed > segmentSpeed + 10) {
        applyEmergencyBrake();
    }
    statusDisplay();
}

    public void compareSpeedLimit() {
        float difference = trainSpeed - segmentSpeed;
        if (difference > 0) {
            System.out.println("Over speed by: " + difference + " km/h");
        }
    }    
    
    public void sendWarningToDriver() {
    if (trainSpeed > segmentSpeed + 5 && trainSpeed <= segmentSpeed + 10) {
            System.out.println("WARNING: Speed " + trainSpeed + " exceeds limit " + segmentSpeed + " by more than 5 km/h");
        }
    }

        
    public void applyEmergencyBrake() {
        activeEmergency = true;
        System.out.println("EMERGENCY BRAKE APPLIED!");
    }
    
    public void applyBrake() {
        System.out.println("Normal brake applied");
    }
    
    
        public void checkRedSignal() {
        if (activeEmergency) {
            applyEmergencyBrake();
        }
    }
}

