package com.example.dataexplorer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class PersonController {
    private final DataInitializer dataInitializer;
    private List<Person> exampleData; //comment????
//    private DataInitializer dataInitializer;

    @Autowired
    public PersonController(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
        this.exampleData = dataInitializer.getExampleData();   ///comment??
    }

    @GetMapping("/personen")
    public ResponseEntity<List<Person>> readPersonenBySearchParams(
            @RequestParam(name = "vorname", required = false) String vorname,
            @RequestParam(name = "nachname", required = false) String nachname,
            @RequestParam(name = "iban", required = false) String iban,
            @RequestParam(name = "email", required = false) String email,
            @RequestParam(name = "ort", required = false) String ort) {


        List<Person> allPersons = dataInitializer.getExampleData();

        // Filter and return the list of persons based on query parameters
        List<Person> filteredPersons = allPersons.stream()
                .filter(person -> (vorname == null || vorname.equals(person.getVorname()))
                        && (nachname == null || nachname.equals(person.getNachname()))
                        && (iban == null || iban.equals(getFirstIban(person)))
                        && (email == null || email.equals(getFirstEmail(person)))
                        && (ort == null || isOrtMatch(person, ort)))
                .collect(Collectors.toList());

        if (filteredPersons.isEmpty()) {
            throw new PersonNotFoundException("No persons found for the given criteria");
        }

        return ResponseEntity.ok(filteredPersons);
    }

    // Helper methods for filtering
    private String getFirstIban(Person person) {
        if (!person.getBankverbindungen().isEmpty()) {
            return person.getBankverbindungen().get(0).getIban();
        }
        return null;
    }

    private String getFirstEmail(Person person) {
        if (!person.getKommunikationsadressen().isEmpty()) {
            return person.getKommunikationsadressen().get(0).getEmail();
        }
        return null;
    }

    private boolean isOrtMatch(Person person, String ort) {
        if (ort != null && (person.getVorname() != null || person.getNachname() != null)) {
            // Filter by Ort if either Vorname or Nachname is filled
            if (person.getVorname() != null || person.getNachname() != null) {
                // Check if any Anschrift matches the provided Ort
                for (Anschrift anschrift : person.getAnschriften()) {
                    if (anschrift.getOrt().equalsIgnoreCase(ort)) {
                        return true; // Found a match for Ort
                    }
                }
                return false; // No match for Ort
            }
        }
        return true; // No Ort filtering needed
    }
    // Helper method to load all persons from data source (Replace with your logic)
//    private List<Person> loadAllPersonsFromDataSource() {
//        // Replace this with your actual data loading logic
//        List<Person> allPersons = new ArrayList<>();
//        // ... Add persons to the list
//        return allPersons;
//    }
    private List<Person> loadAllPersonsFromDataSource() {
        return dataInitializer.getExampleData();
    }
    public void setExampleData(List<Person> exampleData) {

        this.exampleData = exampleData;
    }

    @GetMapping("/swagger.json")
    public ResponseEntity<String> getSwaggerJson() {
        // Replace this with your logic to load and return the Swagger JSON content
        String swaggerJson = "{ ... }"; // Replace with your actual JSON content
        return ResponseEntity.ok(swaggerJson);
    }
}
