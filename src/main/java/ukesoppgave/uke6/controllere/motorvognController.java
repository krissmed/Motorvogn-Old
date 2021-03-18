package ukesoppgave.uke6.controllere;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ukesoppgave.uke6.modeller.Motorvogn;
import ukesoppgave.uke6.modeller.Bil;

import java.util.ArrayList;

@RestController
public class motorvognController {
    public static ArrayList<Motorvogn> motorvogner = new ArrayList<>();
    public final ArrayList<Bil> bilRegister = new ArrayList<>();

    public motorvognController(){
        Bil bil1 = new Bil("Volvo", "V30");
        bilRegister.add(bil1);
        Bil bil2 = new Bil("Volvo", "V70");
        bilRegister.add(bil2);
        Bil bil3 = new Bil("Volvo", "V91");
        bilRegister.add(bil3);
        Bil bil4 = new Bil("Audi", "V8");
        bilRegister.add(bil4);
        Bil bil5 = new Bil("Audi", "Q7");
        bilRegister.add(bil5);
        Bil bil6 = new Bil("Audi", "Q8");
        bilRegister.add(bil6);
    }
    @GetMapping("/hentBiler")
    public ArrayList<Bil> hentBiler(){
        return bilRegister;
    }

    //Legg til en ny bil i motorvogn
    @PostMapping("/motorvogn")
    public ArrayList<Motorvogn> motorvogn(Motorvogn bil){
        motorvogner.add(bil);
        return motorvogner;
    }
    //Skriver ut tabellen til index.html
    @GetMapping("/hentTabell")
    public ArrayList<Motorvogn> hentArray(){
        return motorvogner;
    }
    //Slett innhold i motorvogner
    @GetMapping("/slett")
    public void slettArray(){
        motorvogner.clear();
    }
}
