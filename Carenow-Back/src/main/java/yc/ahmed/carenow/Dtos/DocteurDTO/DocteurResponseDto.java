package yc.ahmed.carenow.Dtos.DocteurDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocteurResponseDto {
    private Long id;

    private String Nom;

    private String Specialite;

    private Integer Telephone;

    private String image;
}
