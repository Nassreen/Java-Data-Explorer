package com.example.dataexplorer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
public class DataInitializer {
//    private final PersonController personController;
private static final Logger logger = LoggerFactory.getLogger(DataInitializer.class);

    public List<Person> getExampleData() {
        logger.info("Fetching example data");
        List<Person> exampleData = createExampleData();
        logger.info("Example data fetched successfully");
        return exampleData;
    }
    public List<Person> createExampleDataList() {
      List<Person> exampleData = createExampleData();
     return exampleData;
 }

    private List<Person> createExampleData() {
        List<Person> exampleData = new ArrayList<>();

        // first person
        Person person1 = new Person();
        person1.setId(53624L);
        person1.setVorname("Anton");
        person1.setNachname("Schegolev");
        person1.setGeschlecht("m");

        Anschrift anschrift1 = new Anschrift();
        anschrift1.setId(62549263L);
        anschrift1.setStrasse("Heidmühlenweg");
        anschrift1.setHausnummer("10b");
        anschrift1.setPlz("82321");
        anschrift1.setOrt("Elmo");
        anschrift1.setLand("Deutschland");

        person1.setAnschriften(Collections.singletonList(anschrift1));

        Kommunikationsadresse kommunikationsadresse1 = new Kommunikationsadresse();
        kommunikationsadresse1.setId(7563894L);
        kommunikationsadresse1.setEmail("anton.schegolev@gmail.com");
        kommunikationsadresse1.setTelefon("0176-38398294872");

        person1.setKommunikationsadressen(Collections.singletonList(kommunikationsadresse1));

        Bankverbindung bankverbindung1 = new Bankverbindung();
        bankverbindung1.setId(95736L);
        bankverbindung1.setIban("DE837223323232323");
        bankverbindung1.setBankname("Bank AG");
        bankverbindung1.setBankleitzahl("10010010");
        bankverbindung1.setBic("DE302GSD");
        bankverbindung1.setKontonummer("23231212313");
        bankverbindung1.setLand("Deutschland");

        person1.setBankverbindungen(Collections.singletonList(bankverbindung1));

        exampleData.add(person1);

        //second person
        Person person2 = new Person();
        person2.setId(92832L);
        person2.setVorname("Frank");
        person2.setNachname("Schröder");
        person2.setGeschlecht("m");

        Anschrift anschrift2 = new Anschrift();
        anschrift2.setId(233L);
        anschrift2.setStrasse("Musterweg");
        anschrift2.setHausnummer("2c");
        anschrift2.setPlz("39272");
        anschrift2.setOrt("Hamburg");
        anschrift2.setLand("Deutschland");

        Kommunikationsadresse kommunikationsadresse2 = new Kommunikationsadresse();
        kommunikationsadresse2.setId(3928L);
        kommunikationsadresse2.setEmail("frank.schroeder@gmail.com");
        kommunikationsadresse2.setTelefon("0176-2389238923");

        Bankverbindung bankverbindung2 = new Bankverbindung();
        bankverbindung2.setId(39283L);
        bankverbindung2.setIban("DE9382746264242");
        bankverbindung2.setBankname("Raffeisen Bank");
        bankverbindung2.setBankleitzahl("100038923");
        bankverbindung2.setBic("DENOLADE9382");
        bankverbindung2.setKontonummer("93826462846");
        bankverbindung2.setLand("Deutschland");

        person2.setAnschriften(Collections.singletonList(anschrift2));
        person2.setKommunikationsadressen(Collections.singletonList(kommunikationsadresse2));
        person2.setBankverbindungen(Collections.singletonList(bankverbindung2));

        exampleData.add(person2);

        // third person
        Person person3 = new Person();
        person3.setId(2389238L);
        person3.setVorname("Henning");
        person3.setNachname("Radtke");
        person3.setGeschlecht("m");

        Anschrift anschrift3 = new Anschrift();
        anschrift3.setId(38254L);
        anschrift3.setStrasse("Platzweg");
        anschrift3.setHausnummer("100");
        anschrift3.setPlz("39372");
        anschrift3.setOrt("Münster");
        anschrift3.setLand("Deutschland");

        Kommunikationsadresse kommunikationsadresse3 = new Kommunikationsadresse();
        kommunikationsadresse3.setId(304824L);
        kommunikationsadresse3.setEmail("henning.radtke@gmail.com");
        kommunikationsadresse3.setTelefon("0176-302746242");

        Bankverbindung bankverbindung3 = new Bankverbindung();
        bankverbindung3.setId(73525632L);
        bankverbindung3.setIban("DE933836482742");
        bankverbindung3.setBankname("Money Bank");
        bankverbindung3.setBankleitzahl("3983472738");
        bankverbindung3.setBic("DEMO39282");
        bankverbindung3.setKontonummer("109393992983");
        bankverbindung3.setLand("Deutschland");

        person3.setAnschriften(Collections.singletonList(anschrift3));
        person3.setKommunikationsadressen(Collections.singletonList(kommunikationsadresse3));
        person3.setBankverbindungen(Collections.singletonList(bankverbindung3));

        exampleData.add(person3);

        // fourth person
        Person person4 = new Person();
        person4.setId(12345L);
        person4.setVorname("Laura");
        person4.setNachname("Müller");
        person4.setGeschlecht("w");

        Anschrift anschrift4 = new Anschrift();
        anschrift4.setId(98765L);
        anschrift4.setStrasse("Hauptstraße");
        anschrift4.setHausnummer("42");
        anschrift4.setPlz("12345");
        anschrift4.setOrt("Berlin");
        anschrift4.setLand("Deutschland");

        Kommunikationsadresse kommunikationsadresse4 = new Kommunikationsadresse();
        kommunikationsadresse4.setId(56789L);
        kommunikationsadresse4.setEmail("laura.mueller@gmail.com");
        kommunikationsadresse4.setTelefon("0176-987654321");

        Bankverbindung bankverbindung4 = new Bankverbindung();
        bankverbindung4.setId(54321L);
        bankverbindung4.setIban("DE123456789012345");
        bankverbindung4.setBankname("Sparkasse");
        bankverbindung4.setBankleitzahl("10050000");
        bankverbindung4.setBic("SPRKDEFF");
        bankverbindung4.setKontonummer("9876543210");
        bankverbindung4.setLand("Deutschland");

        person4.setAnschriften(Collections.singletonList(anschrift4));
        person4.setKommunikationsadressen(Collections.singletonList(kommunikationsadresse4));
        person4.setBankverbindungen(Collections.singletonList(bankverbindung4));

        exampleData.add(person4);

        // fifth person
        Person person5 = new Person();
        person5.setId(54321L);
        person5.setVorname("Sophie");
        person5.setNachname("Schmidt");
        person5.setGeschlecht("w");

        Anschrift anschrift5 = new Anschrift();
        anschrift5.setId(87654L);
        anschrift5.setStrasse("Lindenallee");
        anschrift5.setHausnummer("7");
        anschrift5.setPlz("54321");
        anschrift5.setOrt("München");
        anschrift5.setLand("Deutschland");

        Kommunikationsadresse kommunikationsadresse5 = new Kommunikationsadresse();
        kommunikationsadresse5.setId(98765L);
        kommunikationsadresse5.setEmail("sophie.schmidt@gmail.com");
        kommunikationsadresse5.setTelefon("0176-543210987");

        Bankverbindung bankverbindung5 = new Bankverbindung();
        bankverbindung5.setId(76543L);
        bankverbindung5.setIban("DE987654321098765");
        bankverbindung5.setBankname("Commerzbank");
        bankverbindung5.setBankleitzahl("12040000");
        bankverbindung5.setBic("COBADEFFXXX");
        bankverbindung5.setKontonummer("8765432109");
        bankverbindung5.setLand("Deutschland");

        person5.setAnschriften(Collections.singletonList(anschrift5));
        person5.setKommunikationsadressen(Collections.singletonList(kommunikationsadresse5));
        person5.setBankverbindungen(Collections.singletonList(bankverbindung5));

        exampleData.add(person5);

// Return the list of example data
        return exampleData;


    }
}

