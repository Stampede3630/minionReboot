package org.usfirst.frc.team3630.robot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class Drive {
	private RobotDrive driveTrain;
	private Talon fl,fr,bl,br;
	private XboxController boxy;
	
	public Drive() {
		fl = new Talon(Constants.flMotorPin);
		fr = new Talon(Constants.frMotorPin);
		bl = new Talon(Constants.blMotorPin);
		br = new Talon(Constants.brMotorPin);

		driveTrain = new RobotDrive (fl,bl,fr,br);
		boxy = new XboxController(0);
		
		
	}
	public void drivePeriodic () {
		double vx, vy, vtheta;
		vx = boxy.getX (Hand.kRight);
	    vy = boxy.getY (Hand.kRight);
	    vtheta = boxy.getY (Hand.kLeft); 
	    driveTrain.mecanumDrive_Cartesian(vx, vy, vtheta, 0);
	}
}
