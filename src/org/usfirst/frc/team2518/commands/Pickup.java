package org.usfirst.frc.team2518.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * First Command Group attempt.
 */
public class Pickup extends CommandGroup {
	public Pickup() {
		addSequential(new CloseGearGrabber());
		//addParallel(new SetWristSetpoint(-45));
		//addSequential(new SetElevatorSetpoint(0.25));
	}
}
