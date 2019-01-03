package com.sym.wscxfdemo.service;

import com.sym.wscxfdemo.entity.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path(value = "/")
@Produces("application/xml")
//@Produces("application/json")//返回的格式
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
public interface PersonService {

    /**
     * restful格式的接口声明
     * @param name
     * @return
     */
    @GET
    @Path(value = "/{name}")
    Person getPersonByName(@PathParam("name")String name);

    @GET
    @Path(value = "/search")
    Person findPersonByName(@QueryParam("name")String name);
}
