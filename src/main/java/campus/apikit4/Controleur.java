package campus.apikit4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Nom : Controleur
 * Description : Controleur APIRest
 *
 * @version v1.0
 * Date : 16 mars 2023
 * @author Stéphane CHEVRIER
 */


@RestController
public class Controleur {


    // création de l'objet Service
//    @Autowired
//    private GameService gameService;

    /**
     * requete de test
     */
    @GetMapping("/test")
    public String essai() {
        return "test réussi";
    }
}