package com.example.arman.e_route;
import java.util.List;

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<RouteMap> route);

}
