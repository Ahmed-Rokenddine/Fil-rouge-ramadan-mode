package yc.ahmed.carenow.Dtos.MedocDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedocRequestDto {
    private Long id;

    private String Nom;

    private Integer age;

    private Integer price;

    private String Description;
}
