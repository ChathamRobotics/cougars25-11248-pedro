package pedroPathing.tuners_tests;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp (name = "Slide Testing")
public class SlideTesting extends LinearOpMode {

    @Override
    public void runOpMode() {
        DcMotorEx slideLeft = hardwareMap.get(DcMotorEx.class, "slideLeft");
        DcMotorEx slideRight = hardwareMap.get(DcMotorEx.class, "slideRight");

        slideRight.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();


        while (opModeIsActive()) {
            slideLeft.setPower(gamepad1.left_stick_y * -.5);
            slideRight.setPower(gamepad1.left_stick_y * -.5);
        }
    }
}
