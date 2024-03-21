package yc.ahmed.carenow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import yc.ahmed.carenow.services.DocteurService;
import org.springframework.stereotype.Controller;
import yc.ahmed.carenow.Dtos.DocteurDTO.DocteurRequestDto;

import java.util.List;

@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/docteurs")
public class DocteurController {
    private final DocteurService docteurService;

    @Autowired
    public DocteurController(DocteurService docteurService) {
        this.docteurService = docteurService;
    }

    @GetMapping
    public List<DocteurRequestDto> getAllDocteurs() {
        return docteurService.getAllDocteurs();
    }

    @GetMapping("/{id}")
    public DocteurRequestDto getDocteurById(@PathVariable Long id) {
        return docteurService.getDocteurById(id);
    }

    @PostMapping("/create")
    public DocteurRequestDto createDocteur(@RequestBody DocteurRequestDto Docteur) {
        return docteurService.createDocteur(Docteur);
    }

    @PutMapping("/update")
    public DocteurRequestDto updateDocteur(@RequestBody DocteurRequestDto Docteur) {
        return docteurService.updateDocteur(Docteur);
    }

    @DeleteMapping("/{id}")
    public void deleteDocteurById(@PathVariable Long id) {
        docteurService.deleteById(id);
    }
}

