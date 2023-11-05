package org.firstinspires.ftc.teamcode.CommandBase.Subsystems;


import com.acmerobotics.dashboard.config.Config;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.controller.PIDController;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.opencv.core.Mat;

/**
 * A gripper mechanism that grabs a stone from the quarry.
 * Centered around the Skystone game for FTC that was done in the 2019
 * to 2020 season.
 */
@Config
public class ArmSubsystem extends SubsystemBase {
    private PIDController armPID;

    public static double p = 0, i = 0, d = 0;
    public static double f = 0;

    public static double target = 0;

    private final double ticks_in_degrees = 1425 / 360;




    private final DcMotorEx armMotor;

    public ArmSubsystem(final HardwareMap hMap) {
        armMotor = hMap.get(DcMotorEx.class, "arm");

        armPID = new PIDController(p, i, d);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
        armPID.setPID(p, i, d);
        int armPos = armMotor.getCurrentPosition();
        double pid = armPID.calculate(armPos, target);

        double ff = Math.cos(Math.toRadians(target / ticks_in_degrees)) * f;

        double power = pid + ff;

        armMotor.setPower(power);

    }

    // raise arm
    public void raiseArm() {
        armMotor.setPower(0.5);
    }

    // lower arm
    public void lowerArm() {
        armMotor.setPower(-0.5);
    }



}