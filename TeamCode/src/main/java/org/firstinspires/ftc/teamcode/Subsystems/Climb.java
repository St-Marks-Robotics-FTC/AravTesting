package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Climb {
    private Servo servo1;
    private Servo servo2;

    // Servo positions for the climb mechanism
    private static final double POSITION_1 = 0.2; // Adjust as needed
    private static final double POSITION_2 = 0.8; // Adjust as needed

    public Climb(HardwareMap hardwareMap) {
        // Initialize the two servos for the climb mechanism based on their names in the hardware configuration
        servo1 = hardwareMap.servo.get("servo1");
        servo2 = hardwareMap.servo.get("servo2");

        // Set initial servo positions
        servo1.setPosition(POSITION_1);
        servo2.setPosition(POSITION_1);
    }

    // Move the climb mechanism to position 1
    public void hold() {
        servo1.setPosition(POSITION_1);
        servo2.setPosition(POSITION_1);
    }

    // Move the climb mechanism to position 2
    public void expand() {
        servo1.setPosition(POSITION_2);
        servo2.setPosition(POSITION_2);
    }
}
