package org.quarkus;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PersonRepository implements PanacheMongoRepository<Person>
{


}