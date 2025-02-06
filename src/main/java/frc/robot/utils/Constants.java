package frc.robot.utils;

public class Constants {
    public static final class DriveConstants {
        // Max Speed in M/S
        public static final int kMaxSpeed = 0;
        // Spark MAX CAN IDs
        public static final int kVortexID = 4;
        public static final int kLeftDrivID = 5;
        public static final int kRightDrivID = 6;
        
        
        // Encoder Conversion factor
        public static final double kEncConstant = Math.PI * 6 / 8.46;

    }
    public static final class OIConstants {
        //Driver Controller Ports
        public static final int kDriverControllerPort = 0;
        // Driver Controller Deadband
        public static final double kDriveDeadband = 0.05;

    }

    public static final class MiscConstants {
        // Vortex PID setpoint 
        public static final double setpoint = 1;
    }
}
