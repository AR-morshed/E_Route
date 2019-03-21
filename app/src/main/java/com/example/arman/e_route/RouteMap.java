package com.example.arman.e_route;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class RouteMap {

    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;

    public List<LatLng> points;

}
