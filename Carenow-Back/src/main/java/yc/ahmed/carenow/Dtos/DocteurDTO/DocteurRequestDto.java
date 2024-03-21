package yc.ahmed.carenow.Dtos.DocteurDTO;

import lombok.*;
import yc.ahmed.carenow.Dtos.DocteurDTO.DocteurResponseDto;
import yc.ahmed.carenow.Dtos.HopitalDTO.HopitalResponseDto;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocteurRequestDto {
    private Long id;

    private String Nom;

    private String Specialite;

    private Integer Telephone;

    private String image;

    private HopitalResponseDto hopital;
}
