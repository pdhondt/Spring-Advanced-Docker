package be.vdab.landen.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
@RequestMapping("/")
class GebruikerController {
    GebruikerController() throws IOException {
        System.out.println("Besturingssysteem: " + System.getProperty("os.name"));
        System.out.println("Gebruikersnaam: " + System.getProperty("user.name"));
        System.out.println("Home directory van de gebruiker: " +
                System.getProperty("user.home"));
        var homeDirectory = Path.of(System.getProperty("user.home"));
        System.out.println("homeDirectory: " + homeDirectory);
        var bestand = homeDirectory.resolve("organisatie.txt");
        if (!Files.exists((bestand))) {
            Files.writeString(bestand, "VDAB");
            System.out.println(bestand + " gemaakt");
        }
    }
}
