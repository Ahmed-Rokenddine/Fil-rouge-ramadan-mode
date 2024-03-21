package yc.ahmed.carenow.Dtos.HopitalDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HopitalResponseDto {
    private Long id;

    private String Nom;

    private String Adresse;

    private Integer Telephone;

    private String image;
}
