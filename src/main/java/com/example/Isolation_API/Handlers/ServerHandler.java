package com.example.Isolation_API.Handlers;

import com.example.Isolation_Server.Handlers.GetLocationsTest;

import java.util.ArrayList;
import java.util.List;

public class ServerHandler {
    List<String> deserializedLocations = new ArrayList<String>();
    public List<String> getLocations(){

        GetLocationsTest handler = new GetLocationsTest();

        deserializedLocations = handler.getLocationsJson();
        return deserializedLocations;
    }


}
