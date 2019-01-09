package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoysticks extends Command {


	public DriveWithJoysticks() {
		//required subsystem, makes everything in the drive subsystem available
		requires(Robot.drive);
	}

	protected void initialize() {
	}

	protected void execute() {
		//uses prewritten classes with the subsystem to make the robot move
		Robot.drive.setLeftSpeed(-Robot.oi.stick.getY());
		Robot.drive.setRightSpeed(-Robot.oi.stick.getY());
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		//when we stop moving the joystick forward, it removed the command from the schedular
		//when its removed from the schedular, it runs the end method
		Robot.drive.stop();
	}

	protected void interrupted() {
		end();
	}
	
}