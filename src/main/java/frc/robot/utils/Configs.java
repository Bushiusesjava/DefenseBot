package frc.robot.utils;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import frc.robot.utils.Constants.DriveConstants;

public class Configs {
    public static final SparkMaxConfig lConfig = new SparkMaxConfig();
    public static final SparkMaxConfig rConfig = new SparkMaxConfig();
    public static final SparkMaxConfig vConfig = new SparkMaxConfig();
    
    public static final double kEncConstant = Constants.DriveConstants.kEncConstant;
    static {
        lConfig
            .inverted(true);
        lConfig.encoder
            .positionConversionFactor(kEncConstant/12);
        rConfig.encoder
            .positionConversionFactor(kEncConstant/12);

        vConfig.closedLoop
            .pid(0.0001,0,0)
            .feedbackSensor(FeedbackSensor.kAbsoluteEncoder);
        vConfig.closedLoop.maxMotion
            .allowedClosedLoopError(3)
            .maxAcceleration(600)
            .maxVelocity(100);

            

    }
    

    
    
}
