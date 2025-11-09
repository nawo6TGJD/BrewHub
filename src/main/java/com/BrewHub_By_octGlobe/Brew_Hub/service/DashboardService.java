package com.BrewHub_By_octGlobe.Brew_Hub.service;


import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface DashboardService {

    ResponseEntity<Map<String, Object>> getCount();

}
