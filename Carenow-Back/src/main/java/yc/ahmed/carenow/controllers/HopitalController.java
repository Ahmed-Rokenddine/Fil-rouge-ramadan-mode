package yc.ahmed.carenow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import yc.ahmed.carenow.Dtos.HopitalDTO.HopitalRequestDto;
import yc.ahmed.carenow.services.HopitalService;
import org.springframework.stereotype.Controller;



@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/hopitaux")
public class HopitalController {
    private final HopitalService hopitalService;

    @Autowired
    public HopitalController(HopitalService hopitalService) {
        this.hopitalService = hopitalService;
    }

    @GetMapping
    public List<HopitalRequestDto> getAllHopitaux() {
        return hopitalService.getAllHopitaux();
    }

    @GetMapping("/{id}")
    public HopitalRequestDto getHopitalById(@PathVariable Long id) {
        return hopitalService.getHopitalById(id);
    }

    @PostMapping("/create")
    public HopitalRequestDto createHopital(@RequestBody HopitalRequestDto hopital) {
        return hopitalService.createHopital(hopital);
    }

    @PutMapping("/update")
    public HopitalRequestDto updateHopital(@RequestBody HopitalRequestDto hopital) {
        return hopitalService.updateHopital(hopital);
    }

    @DeleteMapping("/{id}")
    public void deleteHopitalById(@PathVariable Long id) {
        hopitalService.deleteById(id);
    }
}
