package com.example.Isolation_API.DAO;


import com.example.Isolation_API.Handlers.DeSerializer;
import com.example.Isolation_API.Handlers.ServerHandler;
import com.example.Isolation_API.models.Location;

import java.util.ArrayList;
import java.util.List;

public class LocationDAO {
    private static LocationDAO instance;
    private List<Location> locations = new ArrayList<>();



        public List<Location> getLocations() {
            ServerHandler sHandler = new ServerHandler();
            DeSerializer deserializer = new DeSerializer();

            List<String> sLocations = new ArrayList<String>();
            List<Location> locations = new ArrayList<>();

            try {
                sLocations = sHandler.getLocations();
                locations = deserializer.DeserializeLocations(sLocations);
            } catch (Exception e) {

            } finally {
                return locations;

            }
        }

    public List<Location> ListAll()
    {
        List<Location> locations = new ArrayList();

        locations = getLocations();
        return new ArrayList<Location>(locations);
    }

//        locations = DeSerializer.DeserializeLocations(deserializedLocations);




    public static LocationDAO getInstance() {
        if (instance == null) {
            instance = new LocationDAO();
        }

        return instance;
    }
//
//    public Location get(int id) {
//        id = locations.indexOf(productToFind);
//        if (id >= 0) {
//            return locations.get(id);
//        }
//        return null;
//    }

}
