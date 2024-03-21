package yc.ahmed.carenow.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yc.ahmed.carenow.Dtos.PharmacyDTO.PharmacyRequestDto;
import yc.ahmed.carenow.models.Pharmacy;
import yc.ahmed.carenow.repositories.PharmacyRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PharmacyService {

    private final PharmacyRepository pharmacyRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public PharmacyService(PharmacyRepository pharmacyRepository, ModelMapper modelMapper) {
        this.pharmacyRepository = pharmacyRepository;
        this.modelMapper = modelMapper;
    }

    public List<PharmacyRequestDto> getAllPharmacys() {
        List<Pharmacy> Pharmacys = pharmacyRepository.findAll();
        return Pharmacys.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private PharmacyRequestDto convertToDto(Pharmacy pharmacy) {
        return modelMapper.map(pharmacy, PharmacyRequestDto.class);
    }

    public PharmacyRequestDto getPharmacyById(Long id) {
        Pharmacy pharmacy = pharmacyRepository.findById(id).orElse(null);
        return modelMapper.map(pharmacy, PharmacyRequestDto.class);
    }

    public PharmacyRequestDto createPharmacy(PharmacyRequestDto PharmacyDto) {
        Pharmacy pharmacy = modelMapper.map(PharmacyDto, Pharmacy.class);
        Pharmacy savedPharmacy = pharmacyRepository.save(pharmacy);
        return modelMapper.map(savedPharmacy, PharmacyRequestDto.class);
    }

    public PharmacyRequestDto updatePharmacy(PharmacyRequestDto PharmacyDto) {
        Pharmacy pharmacy = modelMapper.map(PharmacyDto, Pharmacy.class);
        Pharmacy savedPharmacy = pharmacyRepository.save(pharmacy);
        return modelMapper.map(savedPharmacy, PharmacyRequestDto.class);
    }

    public void deleteById(Long id) {
        pharmacyRepository.deleteById(id);
    }
    
}
