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
    public boolean activeEmergency;
    private float trainSpeed;
    private Train train;
    
    public void setTrain(Train train) {
    this.train = train;
}
    
    public float getTrainSpeed() {
        return trainSpeed;
    }
    
    public void setTrainSpeed(float speed) {
        this.trainSpeed = speed;
    }
    
    public void statusDisplay() {
        this.status = "Train: " + trainSpeed + " km/h | Limit: " + segmentSpeed + " km/h";
//        System.out.println(status);
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
        } else {
            // Clear warning if speed is back to normal
            if (train != null) {
            train.clearWarningSignal(); 
            }
        }
        if (trainSpeed > segmentSpeed + 10) {
            long startTime = System.currentTimeMillis();
            applyBrake();
            long duration = System.currentTimeMillis() - startTime;
            if (duration > 100) {
                System.out.println("WARNING: Brake not applied within 100 ms!");
            }
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
            if (train != null) {
                train.warningSignal();
            }
        }
    }

        
    public void applyEmergencyBrake() {
        activeEmergency = true;
        System.out.println("EMERGENCY BRAKE APPLIED!");
        setTrainSpeed(0);
    }
    
    public void applyBrake() {
        System.out.println("Normal brake applied");
        setTrainSpeed(segmentSpeed);
    }
    
    
        public void checkRedSignal() {
        if (activeEmergency) {
            applyEmergencyBrake();
        }
    }
}

