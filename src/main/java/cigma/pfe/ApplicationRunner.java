package cigma.pfe;

import cigma.pfe.Controllers.ClientController;
import cigma.pfe.Controllers.FactureController;
import cigma.pfe.Models.Client;
import cigma.pfe.Models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.Date;

public class ApplicationRunner {
    public static void main(String[] args) {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctr= (ClientController) ctx.getBean("ctrl1");
        Client client1 = new Client("sara");
        Client client2 = new Client("chaimae");
        Client client3 = new Client("kawtar");
// Test1 => save 3 Clients
    //    ctr.save(client1);
     //   ctr.save(client2);
        //   ctr.save(client3);
// Test2 => getAll Clients before modify and remove
           //  ctr.getAll().stream().forEach(i-> System.out.println(i));
// Test3 => getOne Client service
//        System.out.println(ctr.getOne(1));
// Test4 => modify Client service
        //client1.setName("Hassan");
        //  ctr.modify(client1);
// Test5 => remove Client service
        // ctr.remove(2);
// Test getAll Client after modify and remove
        //ctr.getAll().stream().forEach(i-> System.out.println(i));
     //   ctr.Find("Hassan").stream().forEach(i-> System.out.println(i));


        // FactureController ctrlF = (FactureController) ctx.getBean("controllerFacture");
        //saving of factures
        // ctrlF.save(new Facture(new Date(System.currentTimeMillis()), 1600.00));
      //  ctrlF.save(new Facture(new Date(2020, 04,17), 800.88));

       // ctrlF.Find(LocalDate.of(2020,04,7)).stream().forEach(i-> System.out.println(i));
    // ctrlF.save(new Facture(new Date(2020, 04,17), 800.88));
     //   ctrlF.save(new Facture(new Date(2021, 04,17), 100.00));
//ctrlF.save(new Facture(new Date(2022, 04,17), 200.00));
//ctrlF.save(new Facture(new Date(2022, 05,22), 999.99));

//modification des factures id==2
//ctrlF.modify(new Facture(2L, new Date(System.currentTimeMillis()),2344.00));

// supression de facture id==3
//ctrlF.removeById(3L);
// please note that I did some tests on the database
// please note that I did some tests on the database

// Test find use case for facture with id==1
//Facture foundF = ctrlF.getById(1L);

// Test get all factures
//List<Facture> factureList = ctrlF.getAll();


    }
}


