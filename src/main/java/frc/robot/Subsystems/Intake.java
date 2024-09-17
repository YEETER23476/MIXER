

// package frc.robot.Subsystems;

// import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.NeutralMode;
// import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
// import com.ctre.phoenix.motorcontrol.can.TalonSRX;
// import com.revrobotics.CANSparkMax;
// import com.revrobotics.CANSparkBase.IdleMode;
// import com.revrobotics.CANSparkLowLevel.MotorType;

// import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import frc.robot.Constants.IntakeConstants;

// public class Intake extends SubsystemBase {
  
//   private final CANSparkMax intakeMotor = new CANSparkMax(IntakeConstants.ITANKE_MOTOR_ID, MotorType.kBrushed);

//   public Intake() {
//     intakeMotor.setInverted(false);
//     intakeMotor.setIdleMode(IdleMode.kBrake);
//   }

//   @Override
//   public void periodic() {
//     // This method will be called once per scheduler run
//   }
//     public void setMotors(double speed){
//     intakeMotor.set(speed);
//   }
//     public void motorsOff(){
//         intakeMotor.set(0);
//     }

// }
