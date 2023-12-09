package com.hometest.crudservice.repository;

import com.hometest.crudservice.model.Employee;
import com.azure.spring.data.cosmos.repository.CosmosRepository;

public interface EmployeeRepository extends CosmosRepository<Employee, String> {
    //CosmosRepository provides in-built methods to perform CRUD on Azure Cosmos DB
    //To configure Azure Cosmos DB, we need to set the dependency in pom.xml file and save the details of database in application.properties
}
