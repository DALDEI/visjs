package org.vaadin.visjs.networkDiagram.options.nodes;

/**
 * Created by David Lee 2020-07-25
 */


public class Margin {
    private int top;
		private int right;
		private int bottom;
		private int left;


    public Margin(){
    	
    }
    
    public Margin(int top,int right,int bottom, int left)  {
    	this.top = top ;
    	this.bottom = bottom;
    	this.right = right ;
    	this.left = left;
    }

    public int getTop() {
    	return top ;
		}
	public int getBottom() {
		return bottom ;
	}

	public int getLeft() {
		return left ;
	}
	public int getRight() {
		return right ;
	}

	public void setTop(int top) {
		this.top = top ;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	public void setLeft(int left) {
		this.left = left;
	}
	public void setRight(int right) {
		this.right = right;
	}


}
