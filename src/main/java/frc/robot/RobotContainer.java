package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.Drivetrain;
import frc.robot.utils.Constants.OIConstants;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
    public static final Drivetrain m_robotDrive = new Drivetrain();
    CommandXboxController m_drivController = new CommandXboxController(OIConstants.kDriverControllerPort);
    public RobotContainer() {
      configureBindings();
    
        
    }

    public void configureBindings() {
      m_drivController.rightBumper().onTrue(
        new InstantCommand( () -> m_robotDrive.setPos(), m_robotDrive ));
    }
    
    public void teleopPeriodic() {

    }
    
    
    
}

