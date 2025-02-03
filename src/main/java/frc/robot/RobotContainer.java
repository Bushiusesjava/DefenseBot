package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
<<<<<<< HEAD
=======
<<<<<<< HEAD
import edu.wpi.first.wpilibj2.command.InstantCommand;
=======
>>>>>>> ec4c8cf69b4fe6d528c459f820e2d302da8606e8
>>>>>>> 471f05130b2fb5ebc2063593f8aa0cc7c4d7ba60
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
        new InstantCommand( () -> m_robotDrive.setPos(), m_robotDrive )
        );
    }
    
    public void teleopPeriodic() {

    }
    
    public void teleopPeriodic() {

    }
    
    public void teleopPeriodic() {

    }
    
}

