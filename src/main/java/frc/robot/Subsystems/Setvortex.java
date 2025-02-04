package frc.robot.Subsystems;

import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import frc.robot.utils.Configs;
import frc.robot.utils.Constants.DriveConstants;
import frc.robot.utils.Constants.MiscConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class Setvortex extends SubsystemBase{
    private final SparkMax m_vortex = new SparkMax(DriveConstants.kVortexID, MotorType.kBrushless);
    private final SparkClosedLoopController vortexpid = m_vortex.getClosedLoopController();
    public Setvortex() {
        m_vortex.configure(Configs.vConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }
    public void setPos() {
        vortexpid.setReference(MiscConstants.setpoint, ControlType.kMAXMotionPositionControl);

    }
}
