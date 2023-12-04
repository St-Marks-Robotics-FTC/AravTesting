package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.constraints.TrajectoryAccelerationConstraint;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);


        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 45, Math.toRadians(128), Math.toRadians(128), 15)
                // Set bot dimensions
                .setDimensions(16, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(18, -62, Math.toRadians(180)))


                                //Redesign Bot 2+4

                                //.splineTo(new Vector2d(10, -34), Math.toRadians(180))
                                .lineTo(new Vector2d(10, -34))
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(49, -30), Math.toRadians(0))
                                .waitSeconds(0.5)

                                .setReversed(false)
                                .splineToConstantHeading(new Vector2d(12, -11.5), Math.toRadians(180))
                                .splineToConstantHeading(new Vector2d(-58, -11.5), Math.toRadians(180))
                                .waitSeconds(1)
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(12, -11.5), Math.toRadians(0))
                                .splineToConstantHeading(new Vector2d(48, -30), Math.toRadians(0))
                                .waitSeconds(0.5)

                                .setReversed(false)
                                .splineToConstantHeading(new Vector2d(12, -11.5), Math.toRadians(180))
                                .splineToConstantHeading(new Vector2d(-58, -11.5), Math.toRadians(180))
                                .waitSeconds(1)
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(12, -11.5), Math.toRadians(0))
                                .splineToConstantHeading(new Vector2d(48, -30), Math.toRadians(0))
                                .waitSeconds(0.5)

                                .setReversed(false)
                                .splineToConstantHeading(new Vector2d(12, -11.5), Math.toRadians(180))
                                .splineToConstantHeading(new Vector2d(-14, -11.5), Math.toRadians(180))
                                .splineToSplineHeading(new Pose2d(-58, -20, Math.toRadians(195)), Math.toRadians(195))
                                .waitSeconds(1)
                                .setReversed(true)
                                .splineToSplineHeading(new Pose2d(-14, -11.5, Math.toRadians(180)), Math.toRadians(0))
                                .splineToConstantHeading(new Vector2d(12, -11.5), Math.toRadians(0))
                                .splineToConstantHeading(new Vector2d(48, -30), Math.toRadians(0))
                                .waitSeconds(0.5)


/*
                                // TD Bot
                                .lineTo(new Vector2d(10, -29))
                                .waitSeconds(1)
                                .strafeTo(new Vector2d(10.5, -26))

                                .splineToConstantHeading(new Vector2d(-58, -11.5), Math.toRadians(180))
                                .waitSeconds(1)
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(-6, -11.5), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(4, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(12, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .waitSeconds(1)

                                .setReversed(false)
                                .lineToSplineHeading(new Pose2d(0, -11.5, Math.toRadians(180)))
                                .splineToConstantHeading(new Vector2d(-58, -11.5), Math.toRadians(180))
                                .waitSeconds(1)
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(-6, -11.5), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(4, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(12, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .waitSeconds(1)


                                .setReversed(false)
                                .lineToSplineHeading(new Pose2d(0, -11.5, Math.toRadians(180)))
                                .splineToConstantHeading(new Vector2d(-58, -11.5), Math.toRadians(180))
                                .waitSeconds(1)
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(-6, -11.5), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(4, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(12, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .waitSeconds(1)
*/


/*
                                // TD Bot + extendo
                                .lineTo(new Vector2d(10, -29))
                                .waitSeconds(1)
                                .strafeTo(new Vector2d(10.5, -21))

                                .splineToConstantHeading(new Vector2d(-24, -11.5), Math.toRadians(180))
                                .waitSeconds(1)
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(-6, -11.5), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(4, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(12, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .waitSeconds(1)

                                .setReversed(false)
                                .lineToSplineHeading(new Pose2d(0, -11.5, Math.toRadians(180)))
                                .splineToConstantHeading(new Vector2d(-24, -11.5), Math.toRadians(180))
                                .waitSeconds(1)
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(-6, -11.5), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(4, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(12, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .waitSeconds(1)


                                .setReversed(false)
                                .lineToSplineHeading(new Pose2d(0, -11.5, Math.toRadians(180)))
                                .splineToConstantHeading(new Vector2d(-24, -11.5), Math.toRadians(180))
                                .waitSeconds(1)
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(-6, -11.5), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(4, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(12, -11.5, Math.toRadians(160)), Math.toRadians(0))
                                .waitSeconds(1)
*/
                                /*
                                // updated claw bot close side
                                .splineTo(new Vector2d(10, -34), Math.toRadians(180))
                                .waitSeconds(1)
                                .setTangent(Math.toRadians(0))
                                .splineToSplineHeading(new Pose2d(49, -30, Math.toRadians(0 + 1e-6)), Math.toRadians(0))
                                 */
                                /*
                                .splineTo(new Vector2d(-33, -34), Math.toRadians(0))
                                .setTangent(Math.toRadians(180))
                                .splineToConstantHeading(new Vector2d(-33, -11.5), Math.toRadians(0))
                                .splineToConstantHeading(new Vector2d(5, -11.5), Math.toRadians(0))
                                .splineToConstantHeading(new Vector2d(47, -40), Math.toRadians(0))
*/

                                .build()
                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}