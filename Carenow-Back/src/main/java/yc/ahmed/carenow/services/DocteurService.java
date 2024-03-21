package yc.ahmed.carenow.services;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;
import yc.ahmed.carenow.Dtos.DocteurDTO.DocteurRequestDto;
import yc.ahmed.carenow.models.Docteur;
import yc.ahmed.carenow.repositories.DocteurRepository;



@Service
public class DocteurService {
    private final DocteurRepository docteurRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public DocteurService(DocteurRepository docteurRepository, ModelMapper modelMapper) {
        this.docteurRepository = docteurRepository;
        this.modelMapper = modelMapper;
    }

    public List<DocteurRequestDto> getAllDocteurs() {
        List<Docteur> docteurs = docteurRepository.findAll();
        return docteurs.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private DocteurRequestDto convertToDto(Docteur docteur) {
        return modelMapper.map(docteur, DocteurRequestDto.class);
    }

    public DocteurRequestDto getDocteurById(Long id) {
        Docteur Docteur = docteurRepository.findById(id).orElse(null);
        return modelMapper.map(Docteur, DocteurRequestDto.class);
    }

    public DocteurRequestDto createDocteur(DocteurRequestDto docteurDto) {
        Docteur docteur = modelMapper.map(docteurDto, Docteur.class);
        Docteur savedDocteur = docteurRepository.save(docteur);
        return modelMapper.map(savedDocteur, DocteurRequestDto.class);
    }

    public DocteurRequestDto updateDocteur(DocteurRequestDto docteurDto) {
        Docteur docteur = modelMapper.map(docteurDto, Docteur.class);
        Docteur savedDocteur = docteurRepository.save(docteur);
        return modelMapper.map(savedDocteur, DocteurRequestDto.class);
    }

    public void deleteById(Long id) {
        docteurRepository.deleteById(id);
    }
}
