package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Robot: Auto Drive Up Close Red Side", group="Autonomous")
public class AutoUpCloseRed extends LinearOpMode {

    private DcMotor leftFrontDrive = null;
    private DcMotor leftBackDrive = null;
    private DcMotor rightFrontDrive = null;
    private DcMotor rightBackDrive = null;

    private ElapsedTime runtime = new ElapsedTime();

    private DcMotor catapult1 = null;
    private DcMotor catapult2 = null;
    private DcMotor intake = null;

    private double CATAPULT_UP_POWER = -0.95;
    private double CATAPULT_DOWN_POWER = 1;
    private double CATAPULT_HOLD_POWER = -0.2;

    @Override
    public void runOpMode() {
        leftFrontDrive = hardwareMap.get(DcMotor.class, "left_front_drive");
        leftBackDrive = hardwareMap.get(DcMotor.class, "left_back_drive");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "right_front_drive");
        rightBackDrive = hardwareMap.get(DcMotor.class, "right_back_drive");

        catapult1 = hardwareMap.get(DcMotor.class, "catapult1");
        catapult2 = hardwareMap.get(DcMotor.class, "catapult2");
        intake = hardwareMap.get(DcMotor.class, "intake");


        leftFrontDrive.setDirection(DcMotor.Direction.FORWARD);
        leftBackDrive.setDirection(DcMotor.Direction.FORWARD);
        rightFrontDrive.setDirection(DcMotor.Direction.REVERSE);
        rightBackDrive.setDirection(DcMotor.Direction.REVERSE);

        catapult1.setDirection(DcMotor.Direction.REVERSE); // Backwards should pivot DOWN, or in the stowed position.
        catapult2.setDirection(DcMotor.Direction.FORWARD);
        intake.setDirection(DcMotor.Direction.FORWARD);

        // set initial wheel motor behavior
        leftFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // set initial subsystem behavior
        catapult1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        catapult2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        waitForStart();

        leftFrontDrive.setPower(-0.4);
        leftBackDrive.setPower(-0.4);
        rightFrontDrive.setPower(-0.4);
        rightBackDrive.setPower(-0.4);

        sleep(350);
        leftFrontDrive.setPower(0);
        leftBackDrive.setPower(0);
        rightFrontDrive.setPower(0);
        rightBackDrive.setPower(0);

        catapult1.setPower(1);
        catapult2.setPower(1);
        sleep(500);
        catapult1.setPower(-0.2);
        catapult2.setPower(-0.2);

        sleep(2000);

        catapult1.setPower(-1);
        catapult2.setPower(-1);

        sleep(2000);

        catapult1.setPower(1);
        catapult2.setPower(1);
        sleep(500);
        catapult1.setPower(-0.2);
        catapult2.setPower(-0.2);

        leftFrontDrive.setPower(-0.6);
        leftBackDrive.setPower(-0.6);
        rightFrontDrive.setPower(-0.6);
        rightBackDrive.setPower(-0.6);

        sleep(1250);

        leftFrontDrive.setPower(0.6);
        leftBackDrive.setPower(0.6);
        rightFrontDrive.setPower(-0.6);
        rightBackDrive.setPower(-0.6);

//        leftFrontDrive.setPower(-0.6);
//        leftBackDrive.setPower(0.6);
//        rightFrontDrive.setPower(0.6);
//        rightBackDrive.setPower(-0.6);

        sleep(325);

        intake.setPower(-1);

        leftFrontDrive.setPower(0.4);
        leftBackDrive.setPower(0.4);
        rightFrontDrive.setPower(0.4);
        rightBackDrive.setPower(0.4);

        sleep(4000);

        leftFrontDrive.setPower(-0.4);
        leftBackDrive.setPower(-0.4);
        rightFrontDrive.setPower(-0.4);
        rightBackDrive.setPower(-0.4);

        sleep(1500);

        leftFrontDrive.setPower(-0.6);
        leftBackDrive.setPower(-0.6);
        rightFrontDrive.setPower(0.6);
        rightBackDrive.setPower(0.6);

        sleep(325);

        leftFrontDrive.setPower(0);
        leftBackDrive.setPower(0);
        rightFrontDrive.setPower(0);
        rightBackDrive.setPower(0);

        sleep(100);
    }

}
