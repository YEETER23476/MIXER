

package frc.robot.Subsystems;

import java.util.function.DoubleSupplier;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import frc.robot.Constants.DriveConstants;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  // CANSparkMax rightMotorLead = new CANSparkMax(DriveConstants.RIGHT_LEAD_MOTOR_IDC, MotorType.kBrushless);
  // CANSparkMax rightMotorFollower = new CANSparkMax(DriveConstants.RIGHT_FOLLOWER_MOTOR_IDE,  MotorType.kBrushless);
  // CANSparkMax leftMotorLead = new CANSparkMax(DriveConstants.LEFT_LEAD_MOTOR_IDC,  MotorType.kBrushless);
  // CANSparkMax leftMotorFollower = new CANSparkMax(DriveConstants.LEFT_FOLLOWER_MOTOR_IDI,  MotorType.kBrushless);
  

  private final WPI_TalonSRX rightMotorLead = new WPI_TalonSRX(DriveConstants.RIGHT_LEAD_MOTOR_IDC);
  private final WPI_VictorSPX rightMotorFollower = new WPI_VictorSPX(DriveConstants.RIGHT_FOLLOWER_MOTOR_IDE);
  private final WPI_TalonSRX leftMotorLead = new WPI_TalonSRX(DriveConstants.LEFT_LEAD_MOTOR_IDC);
  private final WPI_VictorSPX leftMotorFollower = new WPI_VictorSPX(DriveConstants.LEFT_FOLLOWER_MOTOR_IDI);

  DifferentialDrive mainDrive = new DifferentialDrive(leftMotorLead, rightMotorLead);

  

  public Command Adrive (DoubleSupplier Throttle, DoubleSupplier turn){
    return Commands.run(new Runnable() {
      @Override
      public void run(){
         mainDrive.arcadeDrive(DriveConstants.MOVEMENT_ACCELERATION_LIMITER.calculate(Throttle.getAsDouble()),DriveConstants.MOVEMENT_TURN_LIMITER.calculate(turn.getAsDouble()));
      }
    }, this);
  }



public DriveTrain(){
    
  
    rightMotorLead.setNeutralMode(NeutralMode.Coast);
    rightMotorFollower.setNeutralMode(NeutralMode.Coast);
    leftMotorLead.setNeutralMode(NeutralMode.Coast);
    leftMotorFollower.setNeutralMode(NeutralMode.Coast);

    // rightMotorLead.setIdleMode(IdleMode.kCoast);
    // rightMotorFollower.setIdleMode(IdleMode.kCoast);
    // leftMotorLead.setIdleMode(IdleMode.kCoast);
    // leftMotorFollower.setIdleMode(IdleMode.kCoast);




    leftMotorLead.setInverted(true);
    leftMotorFollower.setInverted(true);
    rightMotorLead.setInverted(false);
    rightMotorFollower.setInverted(false);

    rightMotorFollower.follow(rightMotorLead);
    leftMotorFollower.follow(leftMotorLead);


  }

  @Override
  public void periodic() {
  

  }

}