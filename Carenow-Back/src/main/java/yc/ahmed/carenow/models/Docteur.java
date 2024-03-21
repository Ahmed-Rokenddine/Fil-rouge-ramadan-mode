package yc.ahmed.carenow.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "docteurs")
public class Docteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nom;

    private String Specialite;

    private Integer Telephone;

    private String image;

    @ManyToOne
    @JoinColumn(name = "hopitaux_id")
    private Hopital hopital;

}
