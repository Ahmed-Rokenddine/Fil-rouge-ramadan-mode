package yc.ahmed.carenow.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hopitaux")
public class Hopital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nom;

    private String Adresse;

    private Integer Telephone;

    private String image;

    @OneToMany(mappedBy = "hopital", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Docteur> docteurs = new ArrayList<Docteur>();

}
