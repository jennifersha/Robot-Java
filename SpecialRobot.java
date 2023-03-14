public class SpecialRobot extends Robot{
	public SpecialRobot(String name) {
		super(name);
	}
public SpecialRobot(String name,int positionnX,int positionnY,int facing) {
	super(name,positionnX,positionnY,facing);
}
//The method will cause the robot to turn 90 degrees to the right
public void turnRight() {
	for(int facing=0;facing<3;facing++) {
	  super.turnLeft();
		  }
}
}