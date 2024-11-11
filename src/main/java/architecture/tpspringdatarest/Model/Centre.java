package architecture.tpspringdatarest.Model;

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
public class Centre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String Nom_centre;
    @Column(name="adress_centre")
    String adress;
}
