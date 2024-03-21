package yc.ahmed.carenow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yc.ahmed.carenow.Dtos.MedocDTO.MedocRequestDto;
import yc.ahmed.carenow.services.MedocService;

import java.util.List;

@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/Medocs")
public class MedocController {

    private final MedocService medocService;

    public MedocController(MedocService medocService) {
        this.medocService = medocService;
    }

    @GetMapping
    public List<MedocRequestDto> getAllMedocs() {
        return medocService.getAllMedocs();
    }

    @GetMapping("/{id}")
    public MedocRequestDto getMedocById(@PathVariable Long id) {
        return medocService.getMedocById(id);
    }

    @PostMapping("/create")
    public MedocRequestDto createMedoc(@RequestBody MedocRequestDto medoc) {
        return medocService.createMedoc(medoc);
    }

    @PutMapping("/update")
    public MedocRequestDto updateMedoc(@RequestBody MedocRequestDto medoc) {
        return medocService.updateMedoc(medoc);
    }

    @DeleteMapping("/{id}")
    public void deleteMedocById(@PathVariable Long id) {
        medocService.deleteById(id);
    }
}
