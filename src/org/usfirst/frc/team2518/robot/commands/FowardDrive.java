package org.usfirst.frc.team2518.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2518.robot.Robot;
import org.usfirst.frc.team2518.robot.commands.Autonomous;

/**
 * Created by Schmi on 3/17/2017.
 */
public class FowardDrive extends Command {
    public double driveValue;

    public FowardDrive() {
        requires(Robot.drivetrain);
    }

    protected void initialize() {
        Robot.drivetrain.drive(0, 0);
    }

    protected void execute() {
        Robot.drivetrain.drive(driveValue, driveValue);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {

    }

    protected void interrupted() {
        super.interrupted();
    }
}
