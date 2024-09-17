
package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import java.util.function.DoubleSupplier;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;  

public class Shooter extends SubsystemBase {

  private final CANSparkMax upperShooter = new CANSparkMax(ShooterConstants.UPPER_SHOOTER_MOTOR_ID, MotorType.kBrushless);
  private final CANSparkMax lowerShooter = new CANSparkMax(ShooterConstants.LOWER_SHOOTER_MOTOR_ID, MotorType.kBrushless);
  
  public Shooter() {

    upperShooter.setInverted(true);
    lowerShooter.setInverted(false);

    // upperShooter.setNeutralMode(NeutralMode.Brake);
    // lowerShooter.setNeutralMode(NeutralMode.Brake);
    upperShooter.setIdleMode(IdleMode.kBrake);
    lowerShooter.setIdleMode(IdleMode.kBrake);


    upperShooter.follow(lowerShooter);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void yeet(double speed){
    lowerShooter.set(speed);
  }
    public void yeetOff(){
    lowerShooter.set(0);    
    }
  
  
}
