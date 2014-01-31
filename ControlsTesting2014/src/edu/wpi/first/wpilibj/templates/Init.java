/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.ADXL345_I2C;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

/**
 *
 * @author Tyler
 */
public class Init {
    //// ANALOG ----------------------------------------------------------------
    public static Gyro gyro;
    public static Potentiometer potential;
    public static AnalogChannel currentSensor;
    public static AnalogChannel config1;
    public static AnalogChannel config2;
    public static AnalogChannel config3;
    
    //// DIGITAL ---------------------------------------------------------------
    public static Encoder rightDriveEncoder;
    public static Encoder leftDriveEncoder;
    public static DigitalInput ballReadyToLift; // What is this?
    public static Encoder shooterWinchEncoder;
    public static DigitalInput pickupDown;
    public static DigitalInput pickupUp;
    public static DigitalInput shooterLoaded;
    public static DigitalInput shooterAtEnd;
    public static DigitalInput shooterLatched;
    public static DigitalInput pressureSwitch;
    
    //// DIGITAL 1 SERIAL ------------------------------------------------------
    public static ADXL345_I2C accel;
    
    //// DIGITAL OUTPUT 1 ------------------------------------------------------
    public static Victor rightDrive;
    public static Victor leftDrive;
    public static Talon pickupSystem;
    public static Talon pickupRoller;
    public static Talon shooterWinchMotor;
    
    //// DIGITAL RELAY 1 -------------------------------------------------------
    public static Relay compressor;
    public static Relay cameraLEDs;
    
    //// SOLENOID --------------------------------------------------------------
    public static Solenoid shifter;
    public static Solenoid pickupTopArmUp;
    public static Solenoid pickupTopArmDown;
    public static Solenoid launcherRelease;
    public static Solenoid greenLEDStrip;
    public static Solenoid redLEDStrip;
    public static Solenoid yellowGroundStrip;
    
    public static void init() {
	//// Analog
	gyro = new Gryo();
	potential = new Potentionmeter();
	currentSensor = new AnalogChannel();
	config1 = new AnalogChannel();
	config2 = new AnalogChannel();
	config3 = new AnalogChannel();
	
	//// Digital In 1
	rightDriveEncoder = new Encoder();
	leftDriveEncoder = new Encoder();
	ballReadyToLift = new DigitalInput(); // What is this?
	shooterWinchEncoder = new Encoder();
	pickupDown = new DigitalInput();
	pickupUp = new DigitalInput();
	shooterLoaded = new DigitalInput();
	shooterAtEnd = new DigitalInput();
	shooterLatched = new DigitalInput();
	pressureSwitch = new DigitalInput();
	
	//// Digital 1 Serial
	accel = new ADXL345_I2C();
	
	//// DIGITAL OUTPUT 1
	rightDrive = new Victor();
	leftDrive = new Victor();
	pickupSystem = new Talon();
	pickupRoller = new Talon();
	shooterWinchMotor = new Talon();
	
	//// DIGITAL RELAY 1
	compressor = new Relay();
	cameraLEDs = new Relay();
	
	//// SOLENOID
	shifter = new Solenoid();
	pickupTopArmUp = new Solenoid();
	pickupTopArmDown = new Solenoid();
	launcherRelease = new Solenoid();
	greenLEDStrip = new Solenoid();
	redLEDStrip = new Solenoid();
	yellowGroundStrip = new Solenoid();
    }
}
