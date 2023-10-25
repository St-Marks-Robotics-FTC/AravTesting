package org.firstinspires.ftc.teamcode.BadSubsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Slides {
    private DcMotor slideMotor1;
    private DcMotor slideMotor2;

    public Slides(HardwareMap hardwareMap) {
        // Initialize the two slide motors based on their names in the hardware configuration
        slideMotor1 = hardwareMap.dcMotor.get("slideMotor1");
        slideMotor2 = hardwareMap.dcMotor.get("slideMotor2");

        // Set motor directions and other configurations as needed
        slideMotor1.setDirection(DcMotor.Direction.FORWARD);
        slideMotor2.setDirection(DcMotor.Direction.REVERSE);

        // Set other motor configurations such as run modes, zero power behavior, etc.
    }

    // Extend the slides
    public void extendSlides() {
        slideMotor1.setPower(1.0); // Adjust power level as needed
        slideMotor2.setPower(1.0); // Adjust power level as needed
    }

    // Retract the slides
    public void retractSlides() {
        slideMotor1.setPower(-1.0); // Adjust power level as needed
        slideMotor2.setPower(-1.0); // Adjust power level as needed
    }

    // Stop the slides
    public void stopSlides() {
        slideMotor1.setPower(0);
        slideMotor2.setPower(0);
    }

    // You can add more methods as needed, such as fine-tuning the position of the slides
}
