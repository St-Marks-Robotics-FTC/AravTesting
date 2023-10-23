package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivetrain {
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor rearLeft;
    private DcMotor rearRight;

    public Drivetrain(HardwareMap hardwareMap) {
        // Initialize the motors based on their names in the hardware configuration
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        rearLeft = hardwareMap.dcMotor.get("rearLeft");
        rearRight = hardwareMap.dcMotor.get("rearRight");

        // Set motor directions (adjust as needed)
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        frontRight.setDirection(DcMotor.Direction.REVERSE);
        rearLeft.setDirection(DcMotor.Direction.FORWARD);
        rearRight.setDirection(DcMotor.Direction.REVERSE);
    }

    // Drive the robot with mecanum wheels
    public void drive(double forward, double strafe, double rotate) {
        double powerFrontLeft = forward + strafe + rotate;
        double powerFrontRight = forward - strafe - rotate;
        double powerRearLeft = forward - strafe + rotate;
        double powerRearRight = forward + strafe - rotate;

        // Normalize power levels so they don't exceed +/-1
        double maxPower = Math.max(
                Math.max(Math.abs(powerFrontLeft), Math.abs(powerFrontRight)),
                Math.max(Math.abs(powerRearLeft), Math.abs(powerRearRight))
                );

        if (maxPower > 1.0) {
            powerFrontLeft /= maxPower;
            powerFrontRight /= maxPower;
            powerRearLeft /= maxPower;
            powerRearRight /= maxPower;
        }

        // Set motor powers
        frontLeft.setPower(powerFrontLeft);
        frontRight.setPower(powerFrontRight);
        rearLeft.setPower(powerRearLeft);
        rearRight.setPower(powerRearRight);
    }

    // Stop the drivetrain
    public void stop() {
        frontLeft.setPower(0);
        frontRight.setPower(0);
        rearLeft.setPower(0);
        rearRight.setPower(0);
    }
}
