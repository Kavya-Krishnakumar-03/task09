package com.task09;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    private double elevation;
    private double generationtime_ms;
    private Hourly hourly;
    private HourlyUnits hourly_units;
    private double latitude;
    private double longitude;
    private String timezone;
    private String timezone_abbreviation;
    private int utc_offset_seconds;

}
