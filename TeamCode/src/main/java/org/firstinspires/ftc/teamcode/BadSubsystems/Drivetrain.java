package org.firstinspires.ftc.teamcode.BadSubsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivetrain {
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor backLeft;
    private DcMotor backRight;

    public Drivetrain(HardwareMap hardwareMap) {
        // Initialize the motors based on their names in the hardware configuration
        frontLeft = hardwareMap.dcMotor.get("leftFront");
        frontRight = hardwareMap.dcMotor.get("rightFront");
        backLeft = hardwareMap.dcMotor.get("leftBack");
        backRight = hardwareMap.dcMotor.get("rightBack");

        // Set motor directions (adjust as needed)
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
    }

    // Drive the robot with mecanum wheels
    public void drive(double forward, double strafe, double rotate, boolean slowMode) {
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
        backLeft.setPower(powerRearLeft);
        backRight.setPower(powerRearRight);
    }

    // Stop the drivetrain
    public void stop() {
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }
}
