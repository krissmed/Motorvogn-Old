package ukesoppgave.uke6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class motorvognController {
    public static ArrayList<Motorvogn> motorvogner = new ArrayList<>();

    @PostMapping("/motorvogn")
    public ArrayList<Motorvogn> motorvogn(Motorvogn bil){
        motorvogner.add(bil);
        return motorvogner;
    }
    @GetMapping("/hentTabell")
    public ArrayList<Motorvogn> motorvogn(){
        return motorvogner;
    }
}
