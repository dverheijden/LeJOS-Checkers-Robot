package movement;

import java.awt.Point;

import lejos.nxt.NXTRegulatedMotor;

public class Motor {
	
	/**
	 * 
	 */
	
	private NXTRegulatedMotor xMotor1;
	private NXTRegulatedMotor xMotor2;
	private NXTRegulatedMotor yMotor;
	
	protected int squareSize = 4;
	private static Point currentPos = new Point(7,7);
	
	public Motor (NXTRegulatedMotor x1, NXTRegulatedMotor x2, NXTRegulatedMotor y){
		this.xMotor1 = x1;
		this.xMotor2 = x2;
		this.yMotor = y;
	}
	
	public void moveTo(Point pos){
		int xDistance = currentPos.x - pos.x;
		int yDistance = currentPos.y - pos.y;
		
		int xAngle = 465 * xDistance;
		int yAngle = 715 * yDistance;
		xMotor1.rotate(xAngle, true);
		xMotor2.rotate(xAngle);
		yMotor.rotate(yAngle);
		
		this.currentPos = pos;
	}
}