package frc.robot;

import edu.wpi.first.math.filter.SlewRateLimiter;

public class Constants {
    public class DriveConstants {
        
        public static final int LEFT_LEAD_MOTOR_IDC = 2;
        public static final int LEFT_FOLLOWER_MOTOR_IDI = 3;
        public static final int RIGHT_LEAD_MOTOR_IDC = 4;
        public static final int RIGHT_FOLLOWER_MOTOR_IDE= 5;
    
        public static final SlewRateLimiter MOVEMENT_ACCELERATION_LIMITER= new SlewRateLimiter(2*Math.E);
        public static final SlewRateLimiter MOVEMENT_TURN_LIMITER= new SlewRateLimiter(2*Math.E);
        
    }
    public class RotationArmConstants {
    
        public static final int ARM_LEAD_MOTOR_ID = 6;
        public static final int ARM_FOLLOWER_MOTOR_ID = 7;

    } 
    public class ShooterConstants {
        public static final int UPPER_SHOOTER_MOTOR_ID = 8;
        public static final int LOWER_SHOOTER_MOTOR_ID = 9;
        
    } 
    public class IntakeConstants {
        public static final int ITANKE_MOTOR_ID = 10;

        
    } 
    
    public class AutoConstants {
    
        
    } 
    
    public class ControllersConstants {
        public static final int CONTROLLER1 = 0;
        public static final int CONTROLLER2 = 1;
        
    }
}
