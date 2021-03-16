package ukesoppgave.uke6.controllere;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ukesoppgave.uke6.modeller.Motorvogn;

import java.util.ArrayList;

@RestController
public class motorvognController {
    public static ArrayList<Motorvogn> motorvogner = new ArrayList<>();
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
