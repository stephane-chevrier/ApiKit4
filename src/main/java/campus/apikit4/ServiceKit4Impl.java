package campus.apikit4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceKit4Impl implements ServiceKit4 {

    // table zone

    @Autowired
    private ZoneDaoPersistenceRepository zoneDao;

    @Override
    public ZoneDtoWeb createZone(ZoneDtoWeb zoneDtoWeb) {
        ZoneEntity zoneEntity = new ZoneEntity();
        zoneEntity.setParentZoneId(zoneDtoWeb.parent_zone_id());
        zoneEntity.setLabel(zoneDtoWeb.label());
        // si l'enregistrement dont l'id est parent_zone_id existe, alors l'enregistrement cree est sauvegarde
        if (zoneDao.findById(zoneDtoWeb.parent_zone_id()).isPresent()) {
            zoneDao.save(zoneEntity);
            return getZoneById(zoneEntity.getId());
        }
        throw new IllegalArgumentException();
    }

    @Override
    public ZoneDtoWeb getZoneById(int zoneId) {
        ZoneEntity zoneEntity = zoneDao.findById(zoneId).orElseThrow(); // orElseThrow() remplace le get avec gestion exception
        return new ZoneDtoWeb(zoneEntity.getId(),zoneEntity.getLabel(),zoneEntity.getParentZoneId() );
    }

    // table Tag

    @Autowired
    private TagDaoPersistenceRepository tagDao;

    @Override
    public TagDtoWeb createTag(TagDtoWeb tagDtoWeb) {
        TagEntity tagEntity = new TagEntity();
        tagEntity.setLabel(tagDtoWeb.label());
        tagDao.save(tagEntity);
        return getTagById(tagEntity.getId());
    }

    @Override
    public TagDtoWeb getTagById(int zoneId) {
        TagEntity tagEntity = tagDao.findById(zoneId).orElseThrow(); // orElseThrow() remplace le get avec gestion exception
        return new TagDtoWeb(tagEntity.getId(),tagEntity.getLabel());
    }
}
