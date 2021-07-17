package com.example.Isolation_API;

import com.example.Isolation_API.Handlers.ServerHandler;
import com.example.Isolation_API.models.Location;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ServerHandler sHandler = new ServerHandler();

        List<String> deserializedLocations = new ArrayList<String>();


        deserializedLocations = sHandler.getLocations();

        for (String location:deserializedLocations) {
            System.out.println("Location:" + location);
        }
    }
}
