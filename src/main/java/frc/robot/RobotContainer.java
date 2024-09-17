// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.util.function.DoubleSupplier;

import edu.wpi.first.math.proto.Controller;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.ControllersConstants;
// import frc.robot.Subsystems.Arm;
import frc.robot.Subsystems.DriveTrain;
// import frc.robot.Subsystems.Intake;
import frc.robot.Subsystems.Shooter;
import frc.robot.Commands.YeetDoughnut;
// import frc.robot.Commands.IntakeDoughnut;
// import frc.robot.Commands.MovwArm;


public class RobotContainer {
  private final DriveTrain driveTrain = new DriveTrain();
  // private final Arm arm = new Arm();
  // private final Intake intake = new Intake();
  private final Shooter shooter = new Shooter();

  private final XboxController controller1 = new XboxController(ControllersConstants.CONTROLLER1);
  private final CommandXboxController controller2 = new CommandXboxController(ControllersConstants.CONTROLLER2);

  public RobotContainer() {

    driveTrain.setDefaultCommand(driveTrain.Adrive(new DoubleSupplier() {
      @Override
      public double getAsDouble(){
        return (controller1.getLeftY());
      }
    }, new DoubleSupplier() {
      @Override
      public double getAsDouble(){
        return (controller1.getRightX());
      }
    }));
    // arm.setDefaultCommand(new MovwArm(arm, controller2, controller2.getLeftY()));    
    configureBindings();

  
  }

  private void configureBindings() {
    controller2.a().whileTrue(new YeetDoughnut(shooter, 1));
    // controller2.b().whileTrue(new IntakeDoughnut(intake, 1));
    
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }

  // public Intake gIntake() {
  //   return intake;
  // } 
  // public Shooter gShooter() {
  //   return shooter;
  // } 
}