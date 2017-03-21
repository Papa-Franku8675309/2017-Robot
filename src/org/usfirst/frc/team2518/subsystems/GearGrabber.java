/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team2518.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The gearGrabber subsystem is a simple system with a motor for opening and closing.
 * If using stronger motors, you should probably use a sensor so that the motors
 * don't stall.
 */
public class GearGrabber extends Subsystem {
	private DoubleSolenoid GearGrabber = new DoubleSolenoid(2, 3);
	private boolean isClosed = false;

	public GearGrabber() {
		super();

		// Let's show everything on the LiveWindow
		LiveWindow.addActuator("GearGrabber", "Gear Grabber", (GearGrabber));
	}

	@Override
	public void initDefaultCommand() {
		GearGrabber.set(DoubleSolenoid.Value.kReverse);
		isClosed = false;
	}

	/**
	 * Set the gearGrabber Solenoid to open.
	 */
	public void open() {
		GearGrabber.set(DoubleSolenoid.Value.kReverse);
		isClosed = false;
	}

	/**
	 * Set the gearGrabber Solenoid to close.
	 */
	public void close() {
		GearGrabber.set(DoubleSolenoid.Value.kForward);
		isClosed = true;

	}

	public boolean isClosed() {
		if (isClosed == true);
		return true;
	}
}
