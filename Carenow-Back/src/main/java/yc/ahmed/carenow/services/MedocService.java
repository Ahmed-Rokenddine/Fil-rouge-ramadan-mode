package yc.ahmed.carenow.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yc.ahmed.carenow.Dtos.MedocDTO.MedocRequestDto;
import yc.ahmed.carenow.models.Medoc;
import yc.ahmed.carenow.repositories.MedocRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedocService {
    private final MedocRepository medocRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public MedocService(MedocRepository medocRepository, ModelMapper modelMapper) {
        this.medocRepository = medocRepository;
        this.modelMapper = modelMapper;
    }

    public List<MedocRequestDto> getAllMedocs() {
        List<Medoc> Medocs = medocRepository.findAll();
        return Medocs.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private MedocRequestDto convertToDto(Medoc medoc) {
        return modelMapper.map(medoc, MedocRequestDto.class);
    }

    public MedocRequestDto getMedocById(Long id) {
        Medoc medoc = medocRepository.findById(id).orElse(null);
        return modelMapper.map(medoc, MedocRequestDto.class);
    }

    public MedocRequestDto createMedoc(MedocRequestDto MedocDto) {
        Medoc medoc = modelMapper.map(MedocDto, Medoc.class);
        Medoc savedMedoc = medocRepository.save(medoc);
        return modelMapper.map(savedMedoc, MedocRequestDto.class);
    }

    public MedocRequestDto updateMedoc(MedocRequestDto MedocDto) {
        Medoc medoc = modelMapper.map(MedocDto, Medoc.class);
        Medoc savedMedoc = medocRepository.save(medoc);
        return modelMapper.map(savedMedoc, MedocRequestDto.class);
    }

    public void deleteById(Long id) {
        medocRepository.deleteById(id);
    }
}
