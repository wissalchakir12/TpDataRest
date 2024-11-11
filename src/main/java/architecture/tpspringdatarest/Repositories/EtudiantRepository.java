package architecture.tpspringdatarest.Repositories;

import architecture.tpspringdatarest.Model.Centre;
import architecture.tpspringdatarest.Model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;

@RepositoryRestResource(path="students")
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    List<Etudiant> findEtudiantByNom(@Param("nom")String nom);
    List<Etudiant> findEtudiantByCentre(@Param("centre") Centre centre);
}
