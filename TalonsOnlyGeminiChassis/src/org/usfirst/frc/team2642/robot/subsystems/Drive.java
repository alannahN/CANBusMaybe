package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.DriveWithJoysticks;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	//instatiates talons as drivable, CTRE specific
	public TalonSRX leftFrontMaster, leftRearSlave;
	public TalonSRX rightFrontMaster, rightRearSlave;

	public Drive() {
		//names controllers as master slave and links to the robot map
		leftFrontMaster = new TalonSRX(RobotMap.DriveMap.ID_LEFT_FRONT);
		rightFrontMaster = new TalonSRX(RobotMap.DriveMap.ID_RIGHT_FRONT);
		leftRearSlave = new TalonSRX(RobotMap.DriveMap.ID_LEFT_REAR);
		rightRearSlave = new TalonSRX(RobotMap.DriveMap.ID_RIGHT_REAR);
		

		// Set talons in follower mode
		leftRearSlave.set(ControlMode.Follower, leftFrontMaster.getDeviceID());
		rightRearSlave.set(ControlMode.Follower, rightFrontMaster.getDeviceID());
	}
		

		public void setLeftSpeed(double speed) {
			//CTRE specific, sets in control mode, meaning we controll, not the talons
			//method to drive both the master and slave controllers
			//the right one is written in the next method, this is the same thing 
			leftFrontMaster.set(ControlMode.PercentOutput, speed);
		}

		public void setRightSpeed(double speed) {
			rightFrontMaster.set(ControlMode.PercentOutput, speed);
		}

		public void stop() {
			//stop sets the speed to 0
			//this turns the wheels at 0 m/s
			//so it doesnt move
			setLeftSpeed(0);
			setRightSpeed(0);
		}

		public void initDefaultCommand() {
			//default command is the command this subsystem is going to be used in
			setDefaultCommand(new DriveWithJoysticks());
		}
}

