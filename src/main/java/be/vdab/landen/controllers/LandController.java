package be.vdab.landen.controllers;

import be.vdab.landen.services.LandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("landen")
public class LandController {
    private final LandService landService;

    public LandController(LandService landService) {
        this.landService = landService;
    }
    @GetMapping("aantal")
    long findAantal() {
        return landService.findAantal();
    }
}
