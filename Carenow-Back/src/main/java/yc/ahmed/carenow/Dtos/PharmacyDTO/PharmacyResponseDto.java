package yc.ahmed.carenow.Dtos.PharmacyDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PharmacyResponseDto {
    private Long id;

    private String Nom;

    private String Adresse;

    private Integer Telephone;

    private Boolean Type;
}
