public class Robot {
	
private String name;
private int positionX;
private int positionY;
private int facing;
public final static int NORTH = 1, EAST = 2, SOUTH = 3, WEST = 4;

public String getName() {
	return name;
}
public int getPositionX() {
	return positionX;
}
public int getPositionY() {
	return positionY;
}
public int getFacing() {
	return facing;
}
//constructor that gets the robot's name
public Robot(String name) {
	this.name=name;
	 positionX=0;
	 positionY=0;
	 this.facing=NORTH;
}
//Another constructor that gets the robot's name, its coordinates of location and orientation
public Robot(String name,int positionnX,int positionnY,int facing) {
	this.name=name;
	if(positionnX>0)
		positionX=positionnX;
	else 
		positionX=0;
	if(positionnY>0)
		positionY=positionnY;
	else
		positionY=0;	
	if(facing<=4 && facing>=1)
		this.facing=facing;
	else 
		this.facing=NORTH;
}
//The method will return the robot information as a string
  public String toString() {
	if(facing==1) {
	  return (name+'('+positionX+','+positionY+')'+"NORTH");
  }
	  else if(facing==2) {
		  return (name+'('+positionX+','+positionY+')'+"EAST");
  }
	  else if(facing==3) {
		 return (name+'('+positionX+','+positionY+')'+"SOUTH");
  }
	  else  {
		  return (name+'('+positionX+','+positionY+')'+"WEST");
  }
  }
  //The method will advance the robot one step in the direction it is facing
  public void move() {
	  if(this.facing==NORTH) {
		  this.positionY=this.positionY+1;
	  }
	  else if(this.facing==EAST) {
		  this.positionX=this.positionX+1;
	  }
	  else if(this.facing==SOUTH) {
		  int move=this.getPositionY()-1;
		  if(move>=0) {
		  this.positionY=move;
	  }}
	  else if(this.facing==WEST) {
		  int move=this.getPositionX()-1;
		  if(move>=0) {
		  this.positionX=move;
		  }}
  }
  //The method will cause the robot to turn 90 degrees to the left
  public void turnLeft() {
	  if(this.getFacing()==NORTH)
		 this.facing=(WEST);
	  else if(this.getFacing()==EAST)
		 this.facing=(NORTH);
	  else if(this.getFacing()==SOUTH)
		  this.facing=(EAST);
	  else if(this.getFacing()==WEST)
		 this.facing=(SOUTH);
  }
}
