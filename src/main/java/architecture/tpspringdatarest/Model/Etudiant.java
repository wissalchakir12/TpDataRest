package architecture.tpspringdatarest.Model;

import architecture.tpspringdatarest.Enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name ="etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column(name="nom_etudiant", nullable=false)
    String nom;
    @Column(name="prenom_etudiant")
    String prenom;
    @Enumerated(EnumType.STRING)
    Genre genre;

    @ManyToOne
    Centre centre;
}
