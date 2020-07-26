package org.vaadin.visjs.networkDiagram.options.nodes;

/**
 * Created by David Lee 2020-07-25
 */


public class HeightConstraint {
    private int minimum;
    private VAlign valign = VAlign.middle;
    
    public HeightConstraint(){
    	
    }
    
    public HeightConstraint(int minimum,VAlign valign) {
    	this.minimum=minimum;
    	this.valign=valign;
    }
    
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public VAlign  getVAlign() {
		return valign;
	}
	public void setVAlign(org.vaadin.visjs.networkDiagram.options.nodes.HeightConstraint.VAlign valign) {
		this.valign = valign;
	}
	public static enum VAlign {
    	top,
		 middle,
		 bottom
	}
    
}
