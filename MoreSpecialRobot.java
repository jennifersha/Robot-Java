public class MoreSpecialRobot extends SpecialRobot {
	//This robot also has information on its battery charge percentage
	private int battery;

	public int getBattery() {
		return battery;
	}
	public MoreSpecialRobot(String name) {
		super(name);
		this.battery=100;
	}
	public MoreSpecialRobot(String name,int positionnX,int positionnY,int facing) {
		super(name,positionnX,positionnY,facing);
		this.battery=100;
	}

	public int battery() {
		return this.battery;
	}
	//That in every move, one percent of the load dropped
	public void move() {
		if(battery>0) {
		   if(this.getFacing()==NORTH) {
			super.move();
			this.battery=battery-1;
	}
		else if(this.getFacing()==EAST) {
			super.move();
			this.battery=battery-1;
		}
		else if(this.getFacing()==SOUTH && this.getPositionY()>0) {
			super.move();
		    this.battery=battery-1;
				}
		else if(this.getFacing()==WEST && this.getPositionX()>0) {
				super.move();
				this.battery=battery-1;
			}
		}}
	//Which will also show the percentage of charge in addition to the usual details.
	public String toString() {
		if(getFacing()==1) {
			return (getName()+'('+getPositionX()+','+getPositionY()+')'+"NORTH "
		+"Battery at :"+battery+"%");
		}
		else if(getFacing()==2) {
			return (getName()+'('+getPositionX()+','+getPositionY()+')'+"EAST "
		+"Battery at :"+battery+"%");
		}
		else if(getFacing()==3) {
			return (getName()+'('+getPositionX()+','+getPositionY()+')'+"SOUTH "
		+"Battery at :"+battery+"%");
		}
		else  {
			return (getName()+'('+getPositionX()+','+getPositionY()+')'+"WEST "
		+"Battery at :"+battery+"%");
		}
	}

}
