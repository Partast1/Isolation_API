package com.example.Isolation_API.resources;

import com.example.Isolation_API.Handlers.DeSerializer;
import com.example.Isolation_API.Handlers.ServerHandler;
import com.example.Isolation_Server.*;

import com.example.Isolation_API.DAO.LocationDAO;
import com.example.Isolation_API.models.Location;
import com.example.Isolation_Server.Handlers.DBHandler;
import com.example.Isolation_Server.Handlers.GetLocationsTest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("/locations")
//@ApplicationPath("/resources")
public class LocationResource {
    private LocationDAO dao = LocationDAO.getInstance();


//    LocationDAO dao = new LocationDAO();
    DeSerializer deSerializer = new DeSerializer();
    //http://localhost:8080/Isolation_API-1.0-SNAPSHOT/api/resources/locations/getlocations


//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<String> getLocations() {
//        ServerHandler sHandler = new ServerHandler();
//        List<String> locations = new ArrayList<String>();
//
//        try {
//            locations = sHandler.getLocations();
//            }
//        catch (Exception e) {
//
//        }
//        finally
//        {
//            return locations;
//
//        }
//
////        locations = DeSerializer.DeserializeLocations(deserializedLocations);
////        for (Location location:locations) {
////            System.out.println("Latitudehej: " +location.getLatitude() + " Longitude: " + location.getLongitude());
////
////        }
//
//    }
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Location> getLocations() {
   return dao.ListAll();
//    return null;

    }

//        locations = DeSerializer.DeserializeLocations(deserializedLocations);
//        for (Location location:locations) {
//            System.out.println("Latitudehej: " +location.getLatitude() + " Longitude: " + location.getLongitude());
//
//        }

}



