package cigma.pfe.Services;

import cigma.pfe.Models.Client;
import cigma.pfe.Repositories.IFactureDao;
import cigma.pfe.Models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class FactureServiceImpl implements IFactureService
{

    @Autowired
    IFactureDao dao;

    @Override
    public Facture save(Facture f)
    {
        return (Facture) dao.save(f);
    }
    @Override
    public Facture modify(Facture newFacture)
    {
        Facture  oldfacture = dao.findById(newFacture.getId()).get();
        oldfacture.setDate(newFacture.getDate());
        oldfacture.setAmount(newFacture.getAmount());
        return dao.save(oldfacture);
    }
    @Override
    public void removeById(long id)
    {
        dao.deleteById(id);
    }

    @Override
    public Facture getById(long id)
    {
        return null ;
    }

    @Override
    public List<Facture> getAll()
    {
        return null;
    }
    public List<Facture> Find(LocalDate date) {
        return (List<Facture>) dao.findByDate(date);
    }

}
