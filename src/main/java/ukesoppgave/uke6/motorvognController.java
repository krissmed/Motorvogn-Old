package ukesoppgave.uke6;

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
}
