package campus.apikit4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceKit4 {

    @Autowired
    private ZoneDaoPersistenceRepository zoneDao;

    @Override
    public ZoneDtoWeb getZone(ZoneEntity zoneEntity) {
        ZoneDtoWeb zoneDtoWeb = new ZoneDtoWeb(zoneEntity.getId(),zoneEntity.getLabel(),zoneEntity.getParentZoneId() );
    return zoneDtoWeb;
}
    @Override
    public ZoneEntity setZone(ZoneDtoWeb zoneDtoWeb) {
        ZoneEntity zoneEntity = new ZoneEntity();
        zoneEntity.setParentZoneId(zoneDtoWeb.parent_zone_id());
        zoneEntity.setLabel(zoneDtoWeb.label());
        zoneDao.save(zoneEntity);
    return zoneEntity;
    }
}
