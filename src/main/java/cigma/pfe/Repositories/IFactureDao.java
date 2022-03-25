package cigma.pfe.Repositories;

import cigma.pfe.Models.Facture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface IFactureDao extends CrudRepository<Facture,Long> {
    List<Facture> findByDate(LocalDate date);
}
