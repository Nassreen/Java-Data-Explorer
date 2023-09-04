package com.example.dataexplorer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/intern")
@CrossOrigin(origins = "http://localhost:3000")
@Api(tags = "personen", description = "Endpoints for managing persons, including search and retrieval")
public class PersonController {
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
    private final DataInitializer dataInitializer;

    @Autowired
    public PersonController(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }

    @ApiOperation("Get a list of all persons")
    @GetMapping("/personen")
    public ResponseEntity<List<Person>> getAllPersons() {
        logger.info("Received request to get all persons");

        List<Person> allPersons = dataInitializer.getExampleData();

        if (allPersons == null) {
            logger.error("Example data is null");
            return ResponseEntity.internalServerError().build();
        }

        logger.info("Returning all persons");
        return ResponseEntity.ok(allPersons);
    }
}
