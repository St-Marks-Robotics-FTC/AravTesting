package org.firstinspires.ftc.teamcode.CommandBased.Subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * A gripper mechanism that grabs a stone from the quarry.
 * Centered around the Skystone game for FTC that was done in the 2019
 * to 2020 season.
 */
public class IntakeSubsystem extends SubsystemBase {

    private final DcMotor intakeMotor;
    private final Servo dropServo;

    public IntakeSubsystem(final HardwareMap hMap) {
        intakeMotor = hMap.get(DcMotor.class, "IntakeMotor");
        dropServo = hMap.get(Servo.class, "IntakeServo");
    }

    /**
     * Grabs a stone.
     */
    public void drop() {
        dropServo.setPosition(0.76);
    }

    /**
     * Releases a stone.
     */
    public void raise() {
        dropServo.setPosition(0);
    }


    public void intake() {
        intakeMotor.setPower(1);
    }

}