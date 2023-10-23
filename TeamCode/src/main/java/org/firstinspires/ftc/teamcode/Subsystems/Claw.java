package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Claw {
    private Servo clawServo1;
    private Servo clawServo2;
    private Servo rotationServo;

    // Claw servo positions
    private static final double CLAW_OPEN_POSITION = 0.2; // Adjust as needed
    private static final double CLAW_CLOSED_POSITION = 0.8; // Adjust as needed

    // Rotation servo positions
    private static final double ROTATION_LEFT_POSITION = 0.0; // Adjust as needed
    private static final double ROTATION_RIGHT_POSITION = 1.0; // Adjust as needed

    public Claw(HardwareMap hardwareMap) {
        // Initialize the claw servos and rotation servo based on their names in the hardware configuration
        clawServo1 = hardwareMap.servo.get("clawServo1");
        clawServo2 = hardwareMap.servo.get("clawServo2");
        rotationServo = hardwareMap.servo.get("rotationServo");

        // Set initial servo positions
        clawServo1.setPosition(CLAW_CLOSED_POSITION);
        clawServo2.setPosition(CLAW_CLOSED_POSITION);
        rotationServo.setPosition(ROTATION_LEFT_POSITION);
    }

    // Open the claw
    public void openClaw() {
        clawServo1.setPosition(CLAW_OPEN_POSITION);
        clawServo2.setPosition(CLAW_OPEN_POSITION);
    }

    // Close the claw
    public void closeClaw() {
        clawServo1.setPosition(CLAW_CLOSED_POSITION);
        clawServo2.setPosition(CLAW_CLOSED_POSITION);
    }

    // Rotate the claw to the left
    public void rotateLeft() {
        rotationServo.setPosition(ROTATION_LEFT_POSITION);
    }

    // Rotate the claw to the right
    public void rotateRight() {
        rotationServo.setPosition(ROTATION_RIGHT_POSITION);
    }

    // Stop the rotation servo
    public void stopRotation() {
        rotationServo.setPosition(0.5); // Set to a neutral position
    }
}
