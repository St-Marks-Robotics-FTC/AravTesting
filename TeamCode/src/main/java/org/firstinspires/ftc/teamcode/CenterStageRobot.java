package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.BadSubsystems.Claw;
import org.firstinspires.ftc.teamcode.BadSubsystems.Climb;
import org.firstinspires.ftc.teamcode.BadSubsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.BadSubsystems.Drone;
import org.firstinspires.ftc.teamcode.BadSubsystems.Intake;
import org.firstinspires.ftc.teamcode.BadSubsystems.Outtake;
import org.firstinspires.ftc.teamcode.BadSubsystems.Slides;
import org.firstinspires.ftc.teamcode.BadSubsystems.Virtual4Bar;

@TeleOp(name = "TeleOp Example", group = "TeleOp")
public class CenterStageRobot extends LinearOpMode {
    private Drivetrain drivetrain;
    private Intake intake;
    private Outtake outtake;
    private Claw claw;
    private Virtual4Bar virtual4Bar;
    private Slides slides;

    private Drone drone;
    private Climb climb;

    @Override
    public void runOpMode() {
        // Initialize the subsystems
        drivetrain = new Drivetrain(hardwareMap);
        intake = new Intake(hardwareMap);
        claw = new Claw(hardwareMap);
        virtual4Bar = new Virtual4Bar(hardwareMap);

        drone = new Drone(hardwareMap);
        climb = new Climb(hardwareMap);

        outtake = new Outtake(claw, virtual4Bar, slides);


        // Wait for the start button to be pressed
        waitForStart();

        while (opModeIsActive()) {
            // Drivetrain control
            double drive = -gamepad1.left_stick_y;
            double strafe = gamepad1.left_stick_x;
            double rotate = gamepad1.right_stick_x;
            drivetrain.drive(drive, strafe, rotate, gamepad1.left_bumper);

            // Intake control
            if (gamepad1.right_trigger > 0) {
                intake.dropIntake();
                intake.startIntake();
            } else {
                intake.raiseIntake();
                intake.stopIntake();
            }


            // Climb control
            if (gamepad1.x) {
                climb.expand();
            }

            // Drone control
            if (gamepad1.y) {
                drone.shoot();
            }


            if (gamepad1.b) {
                outtake.performOuttake();
            }


            if (gamepad2.left_bumper) {
                claw.rotateLeft();
            } else if (gamepad2.right_bumper) {
                claw.rotateRight();
            }


        }
    }
}
