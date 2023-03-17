package campus.apikit4;

import jakarta.validation.Valid;
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

    // création de l'objet Service
    @Autowired
    private ServiceKit4 serviceKit4;

    // requete de test

    @Value("${kit4.test.message}")
    private String testMessage;

    @GetMapping("${kit4.test}")
    public String test() {
        return testMessage;
    }

    // requetes sur la table zone

    @PostMapping("${kit4.zone}")
    @Transactional
    public ZoneDtoWeb createZone(@RequestBody @Valid ZoneDtoWeb zoneDtoWeb) {
        return serviceKit4.createZone(zoneDtoWeb);
    }

    @GetMapping("${kit4.zone}/{zoneId}${kit4.info}")
    @Transactional
    public Object infoZoneById(@PathVariable("zoneId") int zoneId) {
        return serviceKit4.getZoneById(zoneId);
    }


    // requetes sur la table tag

    @PostMapping("${kit4.tag}")
    @Transactional
    public TagDtoWeb createTag(@RequestBody TagDtoWeb tagDtoWeb) {
        return serviceKit4.createTag(tagDtoWeb);
    }

    @GetMapping("${kit4.tag}/{tagId}${kit4.info}")
    @Transactional
    public Object infoTagById(@PathVariable("tagId") int zoneId) {
        return serviceKit4.getTagById(zoneId);
    }


}