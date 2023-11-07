package org.firstinspires.ftc.teamcode.CommandBase.Subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * A gripper mechanism that grabs a stone from the quarry.
 * Centered around the Skystone game for FTC that was done in the 2019
 * to 2020 season.
 */
public class Drone extends SubsystemBase {

    private final Servo dronServo;

    public Drone(final HardwareMap hMap, final String name) {
        dronServo = hMap.get(Servo.class, name);
    }

    /**
     * Grabs a stone.
     */
    public void init() {
        dronServo.setPosition(0);
    }


    /**
     * Grabs a stone.
     */
    public void shoot() {
        dronServo.setPosition(0.76);
    }



}