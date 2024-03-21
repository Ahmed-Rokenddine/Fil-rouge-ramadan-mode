package yc.ahmed.carenow.Dtos.HopitalDTO;

import lombok.*;
import yc.ahmed.carenow.Dtos.DocteurDTO.DocteurResponseDto;
import yc.ahmed.carenow.Dtos.HopitalDTO.HopitalResponseDto;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HopitalRequestDto {
    private Long id;

    private String Nom;

    private String Adresse;

    private Integer Telephone;

    private String image;

    private List<DocteurResponseDto> docteurs = new ArrayList<>();
}
