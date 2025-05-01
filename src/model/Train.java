/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ahmed
 */
public abstract class Train {
    protected String trainID;
    protected float speed;
//    protected TrackSegment location;
    protected boolean brakeStatus;
    protected boolean warningIssued;

    public float getCurrentSpeed() {
        return speed;
    }

    public void applyBrakes() {}
    
    public void warningSignal() {}
}

