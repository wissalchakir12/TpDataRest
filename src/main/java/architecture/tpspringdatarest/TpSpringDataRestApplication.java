package architecture.tpspringdatarest;

import architecture.tpspringdatarest.Enums.Genre;
import architecture.tpspringdatarest.Model.Etudiant;
import architecture.tpspringdatarest.Repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpSpringDataRestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TpSpringDataRestApplication.class, args);
    }

    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public void run(String... args) throws Exception {
        Etudiant et1=Etudiant.builder()
                .nom("Oubid")
                .prenom("Said")
                .genre(Genre.King)
                .build();
        etudiantRepository.save(et1);
        Etudiant et2=Etudiant.builder()
                .nom("Hassni")
                .prenom("Oussama")
                .genre(Genre.King)
                .build();
        etudiantRepository.save(et2);
        Etudiant et3=Etudiant.builder()
                .nom("Hanudco")
                .prenom("Bassaasa")
                .genre(Genre.Alien)
                .build();
        etudiantRepository.save(et3);
        Etudiant et4=Etudiant.builder()
                .nom("Fatna")
                .prenom("Saadiya")
                .genre(Genre.Femme)
                .build();
        etudiantRepository.save(et4);
        Etudiant et5=Etudiant.builder()
                .nom("El Moumeni")
                .prenom("Thami")
                .genre(Genre.King)
                .build();
        etudiantRepository.save(et5);
        Etudiant et6=Etudiant.builder()
                .nom("Hatim")
                .prenom("Ammour")
                .genre(Genre.Hmmar)
                .build();
        etudiantRepository.save(et6);
    }
}
