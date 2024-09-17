

// package frc.robot.Subsystems;

// import com.revrobotics.CANSparkMax;
// import com.revrobotics.CANSparkBase.IdleMode;
// import com.revrobotics.CANSparkLowLevel.MotorType;

// // import edu.wpi.first.wpilibj.Encoder;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.robot.Constants.RotationArmConstants;

// public class Arm extends SubsystemBase {

//   private final  CANSparkMax leadArmMotor = new CANSparkMax(RotationArmConstants.ARM_LEAD_MOTOR_ID, MotorType.kBrushless);
//   private final CANSparkMax followerArmMotor = new CANSparkMax(RotationArmConstants.ARM_FOLLOWER_MOTOR_ID, MotorType.kBrushless);

  
//   public Arm() {
    
//     leadArmMotor.setIdleMode(IdleMode.kBrake);
//     followerArmMotor.setIdleMode(IdleMode.kBrake);


//     followerArmMotor.follow(leadArmMotor);
    
  
//   }

//   @Override
//   public void periodic() {
//     // This method will be called once per scheduler run
//   }
//   public void moveArm(double rotation){
//     leadArmMotor.set(rotation);

//   }
//   public void stopArm(){
//     leadArmMotor.set(0);

//   }


// }


