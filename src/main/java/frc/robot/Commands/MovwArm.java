// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// package frc.robot.Commands;

// import edu.wpi.first.wpilibj.XboxController;
// import edu.wpi.first.wpilibj2.command.Command;
// import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
// import frc.robot.Subsystems.Arm;

// public class MovwArm extends Command {
//   /** Creates a new MovwArm. */
//   private final Arm arm;
//   private final CommandXboxController controller;
//   private final double axis;
//   public MovwArm(Arm arm, CommandXboxController controller2, double d) {
//     // Use addRequirements() here to declare subsystem dependencies.
//     this.arm = arm;
//     this.controller = controller2;
//     this.axis = d;
//     addRequirements(arm);
//   }







// // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {}

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {
//     double rotation = controller.getLeftY();
//     arm.moveArm(rotation);
//   }

//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {
//     arm.stopArm();
//   }

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     return false;
//   }
// }
