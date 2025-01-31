package frc.robot;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import frc.robot.utils.Constants.OIConstants;
import frc.robot.utils.Constants.DriveConstants;
import frc.robot.Drivetrain;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.math.MathUtil;
public class Drivetrain {
    private final SparkMax m_drivLeftSpark = new SparkMax(DriveConstants.kLeftDrivID, 
    MotorType.kBrushless);
    private final SparkMax m_drivRightSpark = new SparkMax(DriveConstants.kLeftDrivID, 
    MotorType.kBrushless); 
    private DifferentialDrive m_robotDrive;
    private final CommandXboxController m_drivController = new CommandXboxController(OIConstants.kDriverControllerPort);
    

    public void drive() {
        
        m_robotDrive = new DifferentialDrive(m_drivLeftSpark, m_drivRightSpark);
        m_robotDrive.tankDrive(-MathUtil.applyDeadband(m_drivController.getLeftY(), OIConstants.kDriveDeadband)
        ,-MathUtil.applyDeadband(m_drivController.getRightY(), OIConstants.kDriveDeadband));

    }


}