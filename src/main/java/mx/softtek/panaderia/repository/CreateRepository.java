package mx.softtek.panaderia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.softtek.panaderia.model.modelDB.Usuarios;

@Repository
public interface CreateRepository extends JpaRepository<Usuarios, Long>{

}
 