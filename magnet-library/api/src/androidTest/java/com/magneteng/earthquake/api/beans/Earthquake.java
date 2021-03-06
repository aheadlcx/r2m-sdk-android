/**
 * File generated by Magnet rest2mobile 1.0 - Sep 18, 2014 5:28:36 PM
 * @see {@link http://developer.magnet.com}
 */


/** Generated from json example
{
  "src" : "us",
  "eqid" : "c0002fj4",
  "timedate" : "2011-03-3107:15:30",
  "lat" : "38.9536",
  "lon" : "142.0174",
  "magnitude" : "6.2",
  "depth" : "39.6",
  "region" : "neartheeastcoastofHonshu,Japan"
}

*/

package com.magneteng.earthquake.api.beans;


public class Earthquake {
  
  private String depth;
  
  private String eqid;
  
  private String lat;
  
  private String lon;
  
  private String magnitude;
  
  private String region;
  
  private String src;
  
  private String timedate;

  public String getDepth() {
    return depth;
  }
  public String getEqid() {
    return eqid;
  }
  public String getLat() {
    return lat;
  }
  public String getLon() {
    return lon;
  }
  public String getMagnitude() {
    return magnitude;
  }
  public String getRegion() {
    return region;
  }
  public String getSrc() {
    return src;
  }
  public String getTimedate() {
    return timedate;
  }

  /**
  * Builder for Earthquake
  **/
  public static class EarthquakeBuilder {
    private Earthquake toBuild = new Earthquake();

    public EarthquakeBuilder() {
    }

    public Earthquake build() {
      return toBuild;
    }

    public EarthquakeBuilder depth(String value) {
      toBuild.depth = value;
      return this;
    }
    public EarthquakeBuilder eqid(String value) {
      toBuild.eqid = value;
      return this;
    }
    public EarthquakeBuilder lat(String value) {
      toBuild.lat = value;
      return this;
    }
    public EarthquakeBuilder lon(String value) {
      toBuild.lon = value;
      return this;
    }
    public EarthquakeBuilder magnitude(String value) {
      toBuild.magnitude = value;
      return this;
    }
    public EarthquakeBuilder region(String value) {
      toBuild.region = value;
      return this;
    }
    public EarthquakeBuilder src(String value) {
      toBuild.src = value;
      return this;
    }
    public EarthquakeBuilder timedate(String value) {
      toBuild.timedate = value;
      return this;
    }
  }
}
