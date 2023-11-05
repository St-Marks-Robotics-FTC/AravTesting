package org.firstinspires.ftc.teamcode.CommandBase.Commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.CommandBase.Subsystems.ArmSubsystem;

/**
 * A simple command that grabs a stone with the
 * {@link }.  Written explicitly for
 * pedagogical purposes. Actual code should inline a
 * command this simple with {@link
 * com.arcrobotics.ftclib.command.InstantCommand}.
 */
public class ArmScore extends CommandBase {

    // The subsystem the command runs on
    private final ArmSubsystem armSubsystem;

    public ArmScore(ArmSubsystem subsystem) {
        armSubsystem = subsystem;
        addRequirements(armSubsystem);
    }

    @Override
    public void initialize() {
        armSubsystem.raiseArm();
    }

    @Override
    public boolean isFinished() {
        return true;
    }

}