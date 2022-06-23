package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import models.Reserva;

public interface IReservaRepository extends JpaRepository<Reserva, Integer>{

}
