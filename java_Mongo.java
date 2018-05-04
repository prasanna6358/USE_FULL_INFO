package com.prasanna.billa;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

public class MongoTest {
    public static void main(String[] args) {
        MongoClientURI uri  = new MongoClientURI("mongodb://admin:admin123@localhost:27017/admin");
        MongoClient client = new MongoClient(uri);
        MongoDatabase  database = client.getDatabase("mule");
        System.out.println(database.getName());

    }

    private void getDBConnection(){
        List<ServerAddress> seeds = new ArrayList<ServerAddress>();
        seeds.add( new ServerAddress( "localhost" ));
        List<MongoCredential> credentials = new ArrayList<MongoCredential>();
        credentials.add(
                MongoCredential.createMongoCRCredential(
                        "admin",
                        "admin",
                        "admin123".toCharArray()
                )
        );
        MongoClient mongo = new MongoClient( seeds, credentials );
        System.out.println(mongo.getDatabase("mule").getName());
    }
}
