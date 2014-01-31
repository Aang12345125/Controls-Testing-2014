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
public class Drive {
    public static void test(){
        SmartDashboard.putNumber("Left Drive: ", Init.leftDrive.get());
        SmartDashboard.putNumber("Right Drive: ", Init.rightDrive.get());
    }
}
