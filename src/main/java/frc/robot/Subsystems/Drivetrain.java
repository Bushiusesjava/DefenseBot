package frc.robot.Subsystems;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.ControlType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import frc.robot.utils.Constants.OIConstants;
import frc.robot.Subsystems.Drivetrain;
import frc.robot.utils.Constants.DriveConstants;
import frc.robot.utils.Constants.MiscConstants;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkClosedLoopController;
import frc.robot.utils.Configs;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkMax;

public class Drivetrain extends SubsystemBase {
    private final SparkMax m_drivLeftSpark = new SparkMax(DriveConstants.kLeftDrivID, 
    MotorType.kBrushless);
    //m_drivLeftSpark.configure(Configs.lConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    private final SparkMax m_drivRightSpark = new SparkMax(DriveConstants.kRightDrivID, 
    MotorType.kBrushless); 
    //m_drivRightSpark.configure(Configs.rConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    private DifferentialDrive m_robotDrive;
    private final CommandXboxController m_drivController = new CommandXboxController(OIConstants.kDriverControllerPort);
    
    

    public void drive() {
        
        m_robotDrive = new DifferentialDrive(m_drivLeftSpark, m_drivRightSpark);
        m_robotDrive.tankDrive(-MathUtil.applyDeadband(m_drivController.getLeftY(), OIConstants.kDriveDeadband)
        ,-MathUtil.applyDeadband(m_drivController.getRightY(), OIConstants.kDriveDeadband));


    }

    


}