package frc.robot.utils;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import frc.robot.utils.Constants.DriveConstants;

public class Configs {
    public static final SparkMaxConfig lConfig = new SparkMaxConfig();
    public static final SparkMaxConfig rConfig = new SparkMaxConfig();
    public static final SparkMaxConfig vConfig = new SparkMaxConfig();
<<<<<<< HEAD
    public static final double kEncConstant = Constants.DriveConstants.kEncConstant;
=======
<<<<<<< HEAD
    public static final double kEncConstant = Constants.DriveConstants.kEncConstant;
=======
>>>>>>> ec4c8cf69b4fe6d528c459f820e2d302da8606e8
>>>>>>> 471f05130b2fb5ebc2063593f8aa0cc7c4d7ba60
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
