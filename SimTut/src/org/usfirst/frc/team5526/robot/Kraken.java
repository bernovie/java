package org.usfirst.frc.team5526.robot;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;

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
public class Kraken extends SampleRobot {
	RobotDrive myRobot; // class that handles basic drive
												// operations
	Joystick leftStick; // set to ID 1 in DriverStation

	public Kraken() {
		myRobot = new RobotDrive(1, 3);
		myRobot.setExpiration(0.1);
		leftStick = new Joystick(0);
	}

	/**
	 * Runs the motors with tank steering.
	 */
	@Override
	public void operatorControl() {
		myRobot.setSafetyEnabled(true);
		double l=0, r=0;
		while (isOperatorControl() && isEnabled()) {
			if(Robot.isSimulation()){
						l = -leftStick.getRawAxis(1);
						r = -leftStick.getRawAxis(4);
			}
			else {
						l = -leftStick.getRawAxis(1);
						r = -leftStick.getRawAxis(4);
			}
			myRobot.tankDrive(l, r);
			System.out.println(l+" "+r);
			Timer.delay(0.005); // wait for a motor update time
		}
	}
}