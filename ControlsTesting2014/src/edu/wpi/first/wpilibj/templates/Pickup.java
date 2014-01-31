/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Tyler
 */
public class Pickup {
    public static void startActuators() {
        Init.pickupRoller.set(0.5);
        Init.pickupSystem.set(0.5);
        Init.pickupTopArmUp.set(true);
        Init.pickupTopArmDown.set(true);
    }
    
    public static void stopActuators() {
        Init.pickupRoller.set(0);
        Init.pickupSystem.set(0);
        Init.pickupTopArmDown.set(false);
        Init.pickupTopArmUp.set(false);
    }
    
    public static void test() {
    SmartDashboard.putNumber("Arm Encoder", Init.pickUpSystemEncoder.get());
    SmartDashboard.putBoolean("Upper Limit Switch", Init.pickupUp.get());
    SmartDashboard.putBoolean("Lower Limit Switch", Init.pickupDown.get());
    SmartDashboard.putBoolean("Ball In Pickup Limit Switch", Init.ballReadyToLift.get());    
    }
   
   
}
