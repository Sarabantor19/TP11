package cigma.pfe.Controllers;

import cigma.pfe.Models.Facture;
import cigma.pfe.Services.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;



@Controller("controllerFacture")
public class FactureController {

    @Autowired
    IFactureService serviceFDI ;

    public FactureController() {
        System.out.println("creation d'un objet facture controller");;
    }

  //  public FactureController(IFactureService factureService) {
        //System.out.println("Call FactureController ...");
      //  this.serviceFDI = factureService;}


    public IFactureService getFactureService()
    {
        return serviceFDI;
    }



    public void save(Facture f)
    {
         System.out.println("presentation layer level...");
        serviceFDI.save(f);

    }


    public void modify(Facture newFacture)
    {
        serviceFDI.modify(newFacture);
    }
    public void removeById(long id)
    {
        serviceFDI.removeById(id);
    }
    public Facture getById(long id)
    {
        return serviceFDI.getById(id);
    }

    public List<Facture> getAll()
    {
        return serviceFDI.getAll();
    }

    public List<Facture> Find(LocalDate date){
        return serviceFDI.Find(date);
    }
}
