package yc.ahmed.carenow.services;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import yc.ahmed.carenow.Dtos.HopitalDTO.HopitalRequestDto;
import yc.ahmed.carenow.models.Hopital;
import yc.ahmed.carenow.repositories.HopitalRepository;

@Service
public class HopitalService {

    private final HopitalRepository hopitalRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public HopitalService(HopitalRepository hopitalRepository, ModelMapper modelMapper) {
        this.hopitalRepository = hopitalRepository;
        this.modelMapper = modelMapper;
    }

    public List<HopitalRequestDto> getAllHopitaux() {
        List<Hopital> hopitaux = hopitalRepository.findAll();
        return hopitaux.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private HopitalRequestDto convertToDto(Hopital hopital) {
        return modelMapper.map(hopital, HopitalRequestDto.class);
    }

    public HopitalRequestDto getHopitalById(Long id) {
        Hopital hopital = hopitalRepository.findById(id).orElse(null);
        return modelMapper.map(hopital, HopitalRequestDto.class);
    }

    public HopitalRequestDto createHopital(HopitalRequestDto hopitalDto) {
        Hopital hopital = modelMapper.map(hopitalDto, Hopital.class);
        Hopital savedHopital = hopitalRepository.save(hopital);
        return modelMapper.map(savedHopital, HopitalRequestDto.class);
    }

    public HopitalRequestDto updateHopital(HopitalRequestDto hopitalDto) {
        Hopital hopital = modelMapper.map(hopitalDto, Hopital.class);
        Hopital savedHopital = hopitalRepository.save(hopital);
        return modelMapper.map(savedHopital, HopitalRequestDto.class);
    }

    public void deleteById(Long id) {
        hopitalRepository.deleteById(id);
    }
}
