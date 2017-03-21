package org.usfirst.frc.team2518.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Created by Schmi on 3/20/2017.
 */
public class
CenterAuto extends CommandGroup {

    public CenterAuto() {
        addSequential(new CloseGearGrabber());
    }
}