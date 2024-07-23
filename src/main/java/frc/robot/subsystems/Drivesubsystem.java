// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.math.proto.Wpimath;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivesubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private WPI_TalonSRX right1 = new WPI_TalonSRX(1);
  private WPI_TalonSRX right2 = new WPI_TalonSRX(2);
  private WPI_TalonSRX left1 = new WPI_TalonSRX(3);
  private WPI_TalonSRX left2 = new WPI_TalonSRX(4);

  public DifferentialDrive drive = new DifferentialDrive(left1, right1);

  private XboxController js1 = new XboxController(0);
  public Drivesubsystem() {
    right1.setInverted(true);
    right2.follow(right1);
    left1.setInverted(true);
    left2.follow(left1);

  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
