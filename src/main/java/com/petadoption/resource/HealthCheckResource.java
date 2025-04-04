package com.petadoption.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.HashMap;
import java.util.Map;

@Path("/api/health")
public class HealthCheckResource {

    @GET
    @Produces("application/json")
    public Map<String, String> healthCheck() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        return response;
    }
} 