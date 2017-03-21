package org.usfirst.frc.team2518.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team2518.robot.commands.ArcadeDriveWithJoystick;

public class DriveTrain extends Subsystem {
	//Creates the spark motor controllers
	private SpeedController LeftMotor = new Spark(0);
	private SpeedController RightMotor = new Spark(1);

	private RobotDrive drive = new RobotDrive(LeftMotor, RightMotor);

	private AnalogInput rangefinder = new AnalogInput(6);

	public DriveTrain() {
		super();

		// Let's show everything on the LiveWindow
		LiveWindow.addActuator("Drive Train", "Left Motor", (Spark) LeftMotor);
		LiveWindow.addActuator("Drive Train", "Right Motor", (Spark) RightMotor);

		//LiveWindow.addSensor("Drive Train", "Rangefinder", rangefinder);
	}

	/**
	 * When no other command is running let the operator drive around using the
	 * xBox joystick.
	 */
	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new ArcadeDriveWithJoystick());
	}

	public void log() {
	}

	/**
	 * Our custom Arcade driving for the DriveTrain.
	 */
	public void drive(Joystick joy) {
		drive.arcadeDrive(-joy.getRawAxis(5), -joy.getRawAxis(0), true);
	}

	public void noMove() {
		drive.arcadeDrive(0, 0, true);
	}


	public double getDistanceToObstacle() {
		return rangefinder.getAverageVoltage();
	}
}
