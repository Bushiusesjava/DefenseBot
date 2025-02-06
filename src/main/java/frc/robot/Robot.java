// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotContainer;
import frc.robot.Subsystems.Drivetrain;
import frc.robot.utils.Configs;


/**
 * This is a demo program showing the use of the DifferentialDrive class, specifically it contains
 * the code necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {
  private RobotContainer m_robotContainer;
  
  /** Called once at the beginning of the robot program. */
  
  public Robot() {

    m_robotContainer = new RobotContainer();
    
  }

  @Override 
  public void robotInit() {

  }
  
 
  @Override
  public void robotPeriodic() {

    CommandScheduler.getInstance().run(); 
  }

  @Override
  public void teleopPeriodic() {
  }

  
  

}
