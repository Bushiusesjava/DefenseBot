package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.ConditionalCommand;
import frc.robot.Subsystems.Drivetrain;
import frc.robot.utils.Constants.OIConstants;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.Setvortex;

public class RobotContainer {
    public static final Drivetrain m_robotDrive = new Drivetrain();
    public static final Setvortex m_setVortex = new Setvortex();
    CommandXboxController m_drivController = new CommandXboxController(OIConstants.kDriverControllerPort);

    public RobotContainer() {
      configureBindings();
      m_robotDrive.setDefaultCommand(new RunCommand(() -> m_robotDrive.drive(), m_robotDrive));
    }

    public void configureBindings() {
        m_drivController.a().onTrue(new InstantCommand(() -> m_setVortex.setPos(), m_setVortex));
          
    }
    
    public void teleopPeriodic() {
        
    }
    
    
    
}

