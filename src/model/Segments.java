/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ahmed
 */

public class Segments {
    private String segmentID;
    public float speedLimit;

    
    public Segments() {
        this.speedLimit = 80.0f; // Default speed limit
    }
        
    public float getSpeed() {
        return speedLimit;
    }

    public float getStatus() {
        return speedLimit;
    }

    public void setSegmentID(String segmentID) {
        this.segmentID = segmentID;
    }

    public void setSpeedLimit(float speedLimit) {
        this.speedLimit = speedLimit;
    }
    
    

    public void reportStatus() {
        System.out.println("Segment " + segmentID + " status: " + speedLimit + " km/h");
    }
}

