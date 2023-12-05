

/**
 * 
 * @author chaitanya
 *
 */
public class Fan {

	private static int STOPPED=0;
	private static int SLOW=1;
	private static int MEDIUM=2;
	private static int FAST=3;
	
	private int fanSpeed=STOPPED;
	private boolean isFanOn;
	private double fanRadius=6;
	private String fanColor;
	
	public Fan() {
		
	}
	
	public Fan(int fanSpeed, boolean isFanOn, double fanRadius, String fanColor) {
		
		this.fanSpeed = fanSpeed;
		this.isFanOn = isFanOn;
		this.fanRadius = fanRadius;
		this.fanColor = fanColor;
	}



	/**
	 * @return the fanSpeed
	 */
	public int getFanSpeed() {
		return fanSpeed;
	}



	/**
	 * @param fanSpeed the fanSpeed to set
	 */
	public void setFanSpeed(int fanSpeed) {
		this.fanSpeed = fanSpeed;
	}



	/**
	 * @return the isFanOn
	 */
	public boolean isFanOn() {
		return isFanOn;
	}



	/**
	 * @param isFanOn the isFanOn to set
	 */
	public void setFanOn(boolean isFanOn) {
		this.isFanOn = isFanOn;
	}



	/**
	 * @return the fanRadius
	 */
	public double getFanRadius() {
		return fanRadius;
	}



	/**
	 * @param fanRadius the fanRadius to set
	 */
	public void setFanRadius(double fanRadius) {
		this.fanRadius = fanRadius;
	}



	/**
	 * @return the fanColor
	 */
	public String getFanColor() {
		return fanColor;
	}



	/**
	 * @param fanColor the fanColor to set
	 */
	public void setFanColor(String fanColor) {
		this.fanColor = fanColor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(isFanOn) {
			return "The Fan speed is set to " +fanSpeed +" with a color of "+ fanColor +" and radius is of "  + fanRadius;
		}else {
			return "The Fan is white with a radious of " + fanRadius + " and the fan is off";
		}
		
	}

	
	
	
}
