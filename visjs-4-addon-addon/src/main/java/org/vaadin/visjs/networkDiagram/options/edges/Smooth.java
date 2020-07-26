package org.vaadin.visjs.networkDiagram.options.edges;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Martin Prause 5.8.2017
 */


public class Smooth {
	
	
	  private boolean enabled=true;
	  private Type type=Type.dynamic;
	  private double roundness=0.5;
	  private ForceDirection forceDirection;
      
      
      public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}


	public double getRoundness() {
		return roundness;
	}
	public void setRoundness(double roundness) {
		this.roundness = roundness;
	}


	public ForceDirection getForceDirection() {
		return forceDirection;
	}
	public void setForceDirection(ForceDirection forceDirection){
      	this.forceDirection = forceDirection ;
	}



	public static enum Type {
	        @SerializedName("dynamic")
	        dynamic,
	        @SerializedName("continuous")
	        continuous,
	        @SerializedName("diagonalCross")
	        diagonalCross,
	        @SerializedName("straightCross")
	        straightCross,
	        @SerializedName("horizontal")
	        horizontal,
	        @SerializedName("vertical")
	        vertical,
	        @SerializedName("curvedCW")
	        curvedCW,
	        @SerializedName("curvedCCW")
	        curvedCCW,
	        @SerializedName("cubicBezier")
	        cubicBezier,
	        @SerializedName("discrete")
	        discrete,
	}

	public static enum ForceDirection {
      	horizontal,
		  	vertical,
		   none


	}

}
