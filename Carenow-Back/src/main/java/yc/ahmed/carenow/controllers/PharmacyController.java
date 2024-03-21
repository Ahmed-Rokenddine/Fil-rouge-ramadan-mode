package yc.ahmed.carenow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yc.ahmed.carenow.Dtos.PharmacyDTO.PharmacyRequestDto;
import yc.ahmed.carenow.services.PharmacyService;

import java.util.List;

@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/Pharmacy")
public class PharmacyController {

    private final PharmacyService pharmacyService;

    public PharmacyController(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    @GetMapping
    public List<PharmacyRequestDto> getAllPharmacies() {
        return pharmacyService.getAllPharmacys();
    }

    @GetMapping("/{id}")
    public PharmacyRequestDto getPharmacyById(@PathVariable Long id) {
        return pharmacyService.getPharmacyById(id);
    }

    @PostMapping("/create")
    public PharmacyRequestDto createPharmacy(@RequestBody PharmacyRequestDto pharmacy) {
        return pharmacyService.createPharmacy(pharmacy);
    }

    @PutMapping("/update")
    public PharmacyRequestDto updatePharmacy(@RequestBody PharmacyRequestDto pharmacy) {
        return pharmacyService.updatePharmacy(pharmacy);
    }

    @DeleteMapping("/{id}")
    public void deletePharmacyById(@PathVariable Long id) {
        pharmacyService.deleteById(id);
    }
}
