package cigma.pfe.Services;

import cigma.pfe.Models.Facture;

import java.time.LocalDate;
import java.util.List;

public interface IFactureService
{
    Facture save(Facture f);
    Facture modify(Facture newFacture);
    void removeById(long id);
    Facture getById(long id);
    List<Facture> getAll();
    public List<Facture> Find(LocalDate date);



}
