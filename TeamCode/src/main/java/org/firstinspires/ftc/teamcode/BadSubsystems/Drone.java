package org.firstinspires.ftc.teamcode.BadSubsystems;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drone {
    private Servo droneServo;

    // Servo positions for the drone mechanism
    private static final double HOLD = 0.2; // Adjust as needed
    private static final double RELEASE = 0.8; // Adjust as needed

    public Drone(HardwareMap hardwareMap) {
        // Initialize the servo for the drone mechanism based on its name in the hardware configuration
        droneServo = hardwareMap.servo.get("droneServo");

        // Set the initial servo position
        droneServo.setPosition(HOLD);
    }

    // Move the drone mechanism to position 1
    public void hold() {
        droneServo.setPosition(HOLD);
    }

    // Move the drone mechanism to position 2
    public void shoot() {
        droneServo.setPosition(RELEASE);
    }
}
