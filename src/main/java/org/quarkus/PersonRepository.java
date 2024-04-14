package org.quarkus;

import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;


@ApplicationScoped
public class PersonRepository implements PanacheMongoRepositoryBase<Person, ObjectId>
{


}