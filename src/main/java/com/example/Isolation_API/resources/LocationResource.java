package com.example.Isolation_API.resources;

import com.example.Isolation_Server.*;

import com.example.Isolation_API.DAO.LocationDAO;
import com.example.Isolation_API.models.Location;
import com.example.Isolation_Server.Handlers.DBHandler;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("/locations")
//@ApplicationPath("/resources")
public class LocationResource {
    LocationDAO locationAccess = new LocationDAO();
    //http://localhost:8080/Isolation_API-1.0-SNAPSHOT/api/resources/locations/getlocations
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Location> getLocations() {
        List<Location> locations = new ArrayList<Location>();

        DBHandler handler = new DBHandler();

        locations = handler.ReadPositions();
        return null;
    }


}
