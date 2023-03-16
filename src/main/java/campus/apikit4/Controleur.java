package campus.apikit4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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

    @Value("${kit4.test.message}")
    private String testMessage;

    // création de l'objet Service
    @Autowired
    private ServiceKit4 serviceKit4;

    /**
     * requete de test
     */
    @GetMapping("${kit4.test}")
    public String test() {
        return testMessage;
    }

    /**
     * method de creation d'une partie
     * @param zoneDtoWeb parametres d'une zone
     * @return ZoneDtoWeb
     */
    @PostMapping("${kit4.zone}")
    @Transactional
    public ZoneDtoWeb createZone(@RequestBody ZoneDtoWeb zoneDtoWeb) {
        return serviceKit4.getZone(serviceKit4.setZone(zoneDtoWeb));
    }
}