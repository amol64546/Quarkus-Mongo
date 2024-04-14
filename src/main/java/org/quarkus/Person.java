package org.quarkus;


import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

@MongoEntity
public class Person
{
    private ObjectId id;

    private String name;
}
