package org.firstinspires.ftc.teamcode.CommandBased.Commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.CommandBased.Subsystems.IntakeSubsystem;
import org.firstinspires.ftc.teamcode.CommandSample.GripperSubsystem;

/**
 * A simple command that grabs a stone with the {@link GripperSubsystem}.  Written explicitly for
 * pedagogical purposes. Actual code should inline a command this simple with {@link
 * com.arcrobotics.ftclib.command.InstantCommand}.
 */
public class IntakePixel extends CommandBase {

    // The subsystem the command runs on
    private final IntakeSubsystem m_intakeSubsystem;

    public IntakePixel(IntakeSubsystem subsystem) {
        m_intakeSubsystem = subsystem;
        addRequirements(m_intakeSubsystem);
    }

    @Override
    public void initialize() {
        m_intakeSubsystem.intake();
        m_intakeSubsystem.drop();
    }

    @Override
    public boolean isFinished() {
        return true;
    }

}
