package org.usfirst.frc.team2518.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Created by Schmi on 3/20/2017.
 */
public class SideAuto extends CommandGroup {

    public SideAuto(){
        addSequential(new CloseGearGrabber());
    }
}