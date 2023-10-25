package org.firstinspires.ftc.teamcode.BadSubsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private DcMotor intakeMotor;
    private Servo servo1;
    private Servo servo2;

    // Servo positions for the intake drop and up positions
    private static final double INTAKE_DROP_POSITION = 0.0; // Adjust as needed
    private static final double INTAKE_UP_POSITION = 1.0;   // Adjust as needed

    public Intake(HardwareMap hardwareMap) {
        // Initialize the motor and servos based on their names in the hardware configuration
        intakeMotor = hardwareMap.dcMotor.get("intakeMotor");
        servo1 = hardwareMap.servo.get("servo1");
        servo2 = hardwareMap.servo.get("servo2");

        // Set motor direction (adjust as needed)
        intakeMotor.setDirection(DcMotor.Direction.FORWARD);

        // Set initial servo positions
        servo1.setPosition(INTAKE_UP_POSITION);
        servo2.setPosition(INTAKE_UP_POSITION);
    }

    // Start the intake motor to collect objects
    public void startIntake() {
        intakeMotor.setPower(1.0); // Adjust power level as needed
    }

    // Stop the intake motor
    public void stopIntake() {
        intakeMotor.setPower(0.0);
    }

    // Lower the intake mechanism
    public void dropIntake() {
        servo1.setPosition(INTAKE_DROP_POSITION);
        servo2.setPosition(INTAKE_DROP_POSITION);
    }

    // Raise the intake mechanism
    public void raiseIntake() {
        servo1.setPosition(INTAKE_UP_POSITION);
        servo2.setPosition(INTAKE_UP_POSITION);
    }
}
