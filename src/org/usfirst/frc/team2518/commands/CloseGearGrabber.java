/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team2518.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2518.robot.Robot;

/**
 * Closes the GearGrabber.
 */
public class CloseGearGrabber extends Command {
	public CloseGearGrabber() {
		requires(Robot.gearGrabber);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.gearGrabber.initDefaultCommand();
	}

	@Override
	protected void execute() {

	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		Robot.gearGrabber.isClosed();
		return false;
	}
}
