package org.quarkus;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import org.bson.types.ObjectId;

@Path("/persons")
public class PersonResource
{

    @Inject
    PersonRepository personRepository;

    @POST
    public Response create(Person person) {
        personRepository.persistOrUpdate(person);
        return Response.status(Response.Status.CREATED)
            .entity(person)
            .build();
    }

    @GET
    public Response getAll() {
        return Response.status(Response.Status.OK)
            .entity(personRepository.listAll())
            .build();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") String id) {
        Person person = personRepository.findById(new ObjectId(id));
        return Response.status(Response.Status.OK)
            .entity(person)
            .build();
    }

}