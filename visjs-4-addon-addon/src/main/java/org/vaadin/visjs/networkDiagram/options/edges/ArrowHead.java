package org.vaadin.visjs.networkDiagram.options.edges;

/**
 * Created by Martin Prause 5.8.2017
 */

public class ArrowHead {
  private boolean enabled = false;
  private float scaleFactor = 1.0f;
  private Arrows.Type type = Arrows.Type.arrow;

  public ArrowHead() {
    enabled = true;
  }

  public ArrowHead(final float scaleFactor, final Arrows.Type type) {
    enabled = true;
    this.scaleFactor = scaleFactor;
    this.type = type;
  }


  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(final boolean enabled) {
    this.enabled = enabled;
  }

  public float getScaleFactor() {
    return scaleFactor;
  }

  public void setScaleFactor(final float scaleFactor) {
    this.scaleFactor = scaleFactor;
  }

  public Arrows.Type getType() {
    return type;
  }

  public void setType(final Arrows.Type type) {
    this.type = type;
  }



}
