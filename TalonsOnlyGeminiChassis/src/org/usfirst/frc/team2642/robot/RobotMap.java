/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2642.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	
	//I made a new class to help organize the map, this is not needed
	//the drive map has the ID's of the motor controllers
	public static class DriveMap {
		// Talon IDs
		public static final int ID_LEFT_FRONT = 3;
		public static final int ID_LEFT_REAR = 4; 

		public static final int ID_RIGHT_FRONT = 1; 
		public static final int ID_RIGHT_REAR = 2; 
	}
	//this is the USB port for the joystick that we call in the OI
	public static final int joystick = 0;
}
