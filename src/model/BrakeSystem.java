/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.enums.BrakeType;

/**
 *
 * @author ahmed
 */
public class BrakeSystem {
    private boolean active;
    private BrakeType strategy;

    public void setBrakeStrategy(BrakeType strategy) {
        this.strategy = strategy;
    }

    
    public void activate() {
        active = true;
    }

    public void deactivate() {
        active = false;
    }

    public boolean isBrakeEngaged() {
        return active;
    }
}

