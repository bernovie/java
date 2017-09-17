package org.usfirst.frc.team5526.robot;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 *
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SampleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 *
 * WARNING: While it may look like a good choice to use for your code if you're
 * inexperienced, don't. Unless you know what you are doing, complex code will
 * be much more difficult under this system. Use IterativeRobot or Command-Based
 * instead if you're new.
 */
public class Robot extends SampleRobot {
	AnalogInput sensorLeft;
	
	public Robot() {
		sensorLeft = new AnalogInput(0);
	}
	
	public void autonomous(){
		
	}
	/**
	 * Runs the motors with tank steering.
	 */
	@Override
	public void operatorControl() {
		
		while (isOperatorControl() && isEnabled()) {
			SmartDashboard.putNumber("Sensor", sensorLeft.getValue());
			System.out.println("Sensor: "+sensorLeft.getValue());
		}
		
	}
}
