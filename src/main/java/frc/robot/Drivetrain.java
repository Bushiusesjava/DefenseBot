package frc.robot;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.ControlType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import frc.robot.utils.Constants.OIConstants;
import frc.robot.utils.Constants.DriveConstants;
import frc.robot.utils.Constants.MiscConstants;
import frc.robot.Drivetrain;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.math.MathUtil;

import com.revrobotics.spark.SparkClosedLoopController;

public class Drivetrain {
    private final SparkMax m_drivLeftSpark = new SparkMax(DriveConstants.kLeftDrivID, 
    MotorType.kBrushless);
    private final SparkMax m_drivRightSpark = new SparkMax(DriveConstants.kLeftDrivID, 
    MotorType.kBrushless); 
    private DifferentialDrive m_robotDrive;
    private final CommandXboxController m_drivController = new CommandXboxController(OIConstants.kDriverControllerPort);
    private final SparkMax m_vortex = new SparkMax(DriveConstants.kVortexID, MotorType.kBrushless);
    private final SparkClosedLoopController vortexpid = m_vortex.getClosedLoopController();

    public void drive() {
        
        m_robotDrive = new DifferentialDrive(m_drivLeftSpark, m_drivRightSpark);
        m_robotDrive.tankDrive(-MathUtil.applyDeadband(m_drivController.getLeftY(), OIConstants.kDriveDeadband)
        ,-MathUtil.applyDeadband(m_drivController.getRightY(), OIConstants.kDriveDeadband));


    }

    public boolean setPos() {
        vortexpid.setReference(MiscConstants.setpoint, ControlType.kMAXMotionPositionControl);
        return true;



    }


}