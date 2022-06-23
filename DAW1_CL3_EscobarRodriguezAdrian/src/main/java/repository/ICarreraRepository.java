package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import models.Carrera;

public interface ICarreraRepository extends JpaRepository<Carrera, String>{

}
