// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// package frc.robot.Commands;

// import frc.robot.Subsystems.Intake;
// import edu.wpi.first.wpilibj2.command.Command;

// public class IntakeDoughnut extends Command {
//   /** Creates a new IntakeDoughnut. */

//   private final Intake intake;
//   private final double speed;

//   public IntakeDoughnut(Intake intake, double speed) {
//     // Use addRequirements() here to declare subsystem dependencies.
//     this.intake = intake;
//     this.speed = speed;
//     addRequirements(intake);
//   }

//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {
//     intake.setMotors(speed);
//   }

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {}

//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {

//     intake.motorsOff();
//   }

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     return false;
//   }
// }
