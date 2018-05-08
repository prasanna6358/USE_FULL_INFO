package com.prasanna.billa;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

public class MongoTest {
      public static void main(String[] args) {
       /* MongoClientURI uri  = new MongoClientURI("mongodb://admin:admin123@192.168.10.151:27017/admin?ssl=true");
        MongoClient client = new MongoClient(uri);
        MongoDatabase  database = client.getDatabase("mule");
        System.out.println(database.getName());*/
        getDBConnection();
        //sslEncrypt();
    }

    public static void getDBConnection(){
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
        MongoClientOptions options = MongoClientOptions.builder().sslEnabled(true).build();
        MongoClient mongo = new MongoClient( seeds, credentials , options);
        System.out.println(mongo.getDatabase("mule").listCollections());
    }

    public static void sslEncrypt(){
        MongoCredential credential =  MongoCredential.createMongoCRCredential(
                "admin",
                "admin",
                "admin123".toCharArray()
        );
        MongoClient mongoClient = new MongoClient(new ServerAddress("localhost"),
                Collections.singletonList(credential), MongoClientOptions.builder().sslEnabled(true).socketFactory(getNoopSslSocketFactory()).build());
        mongoClient.getDatabase("mule").listCollections();
    }
}
