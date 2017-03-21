package org.usfirst.frc.team2518.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2518.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick joy = new Joystick(0);

	public OI() {
		// Put Some buttons on the SmartDashboard

		SmartDashboard.putData("Close GearGrabber", new CloseGearGrabber());


		// Create some buttons
		JoystickButton four = new JoystickButton(joy, 4);
		JoystickButton five = new JoystickButton(joy, 5);

		// Connect the buttons to commands
        //four.whileHeld(new LiftGearGrabber);
		five.whenPressed(new CloseGearGrabber());
	}

	public Joystick getJoystick() {
		return joy;
	}
}
