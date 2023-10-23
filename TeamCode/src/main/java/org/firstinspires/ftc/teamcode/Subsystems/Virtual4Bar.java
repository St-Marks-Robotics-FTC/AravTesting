package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Virtual4Bar {
    private Servo servo1;
    private Servo servo2;

    // Servo positions for the 4-bar
    private static final double FULLY_RETRACTED_POSITION = 0.0; // Adjust as needed
    private static final double FULLY_EXTENDED_POSITION = 1.0;  // Adjust as needed

    public Virtual4Bar(HardwareMap hardwareMap) {
        // Initialize the two servos for the 4-bar based on their names in the hardware configuration
        servo1 = hardwareMap.servo.get("servo1");
        servo2 = hardwareMap.servo.get("servo2");

        // Set initial servo positions
        servo1.setPosition(FULLY_RETRACTED_POSITION);
        servo2.setPosition(FULLY_RETRACTED_POSITION);
    }

    // Extend the 4-bar
    public void extend4Bar() {
        servo1.setPosition(FULLY_EXTENDED_POSITION);
        servo2.setPosition(FULLY_EXTENDED_POSITION);
    }

    // Retract the 4-bar
    public void retract4Bar() {
        servo1.setPosition(FULLY_RETRACTED_POSITION);
        servo2.setPosition(FULLY_RETRACTED_POSITION);
    }

    // Set the 4-bar to a custom position (0.0 to 1.0)
    public void set4BarPosition(double position) {
        if (position < 0.0) {
            position = 0.0;
        } else if (position > 1.0) {
            position = 1.0;
        }

        servo1.setPosition(position);
        servo2.setPosition(position);
    }
}
