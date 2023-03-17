package campus.apikit4;

public interface ServiceKit4 {

    ZoneDtoWeb getZoneById(int zoneId);

    ZoneDtoWeb createZone(ZoneDtoWeb zoneDtoWeb);

    TagDtoWeb createTag(TagDtoWeb tagDtoWeb);

    TagDtoWeb getTagById(int zoneId);
}
