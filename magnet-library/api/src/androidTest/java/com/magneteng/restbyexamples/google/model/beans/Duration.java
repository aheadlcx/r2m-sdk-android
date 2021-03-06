/**
 * File generated by Magnet rest2mobile 1.0 - Sep 23, 2014 1:59:00 PM
 * @see {@link http://developer.magnet.com}
 */

package com.magneteng.restbyexamples.google.model.beans;


/**
 * Generated from json example
{
  "text" : "45mins",
  "value" : 2727
}

 */

public class Duration {
  
  private String text;
  
  private Integer value;

  public String getText() {
    return text;
  }
  public Integer getValue() {
    return value;
  }

  /**
  * Builder for Duration
  **/
  public static class DurationBuilder {
    private Duration toBuild = new Duration();

    public DurationBuilder() {
    }

    public Duration build() {
      return toBuild;
    }

    public DurationBuilder text(String value) {
      toBuild.text = value;
      return this;
    }
    public DurationBuilder value(Integer value) {
      toBuild.value = value;
      return this;
    }
  }
}
