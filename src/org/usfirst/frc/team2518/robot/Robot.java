package org.usfirst.frc.team2518.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2518.robot.commands.CenterAuto;
import org.usfirst.frc.team2518.robot.commands.SideAuto;
import org.usfirst.frc.team2518.robot.subsystems.GearGrabber;
import org.usfirst.frc.team2518.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2518.robot.subsystems.GearLifter;
import org.usfirst.frc.team2518.robot.subsystems.RobotLifter;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static DriveTrain drivetrain;
	public static RobotLifter robotLifter;
	public static GearLifter gearLifter;
	public static GearGrabber gearGrabber;

	Command autonomousCommand;

	private SendableChooser autoChooser;

	public static OI oi;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		// Initialize all subsystems
		drivetrain = new DriveTrain();
		robotLifter = new RobotLifter();
		gearLifter = new GearLifter();
		gearGrabber = new GearGrabber();
		oi = new OI();


		autoChooser = new SendableChooser();
		autoChooser.addDefault("Center Auto", new CenterAuto());
		autoChooser.addDefault("Side Auto", new SideAuto());
		SmartDashboard.putData("Autonomous Selector", autoChooser);


		// Show what command your subsystem is running on the SmartDashboard
		SmartDashboard.putData(drivetrain);
		SmartDashboard.putData(robotLifter);
		SmartDashboard.putData(gearLifter);
		SmartDashboard.putData(gearGrabber);
	}

	@Override
	public void autonomousInit() {
	    autonomousCommand = (Command) autoChooser.getSelected();
        autonomousCommand.start(); // schedule the autonomous command (example)
	}

	@Override
	public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        log();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		autonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		log();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}

	/**
	 * The log method puts interesting information to the SmartDashboard.
	 */
	private void log() {
		//gearLifter.log();
		//lifter.log();
		//drivetrain.log();
		//gearGrabber.log();
	}
}
