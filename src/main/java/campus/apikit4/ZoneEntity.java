package campus.apikit4;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "zone")
public class ZoneEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "label", nullable = false, length = 255)
    private String label;
    @Basic
    @Column(name = "parent_zone_id", nullable = true)
    private Integer parentZoneId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getParentZoneId() {
        return parentZoneId;
    }

    public void setParentZoneId(Integer parentZoneId) {
        this.parentZoneId = parentZoneId;
    }

    public ZoneDtoWeb toDtoWeb(ZoneEntity zoneEntity) {
        return new ZoneDtoWeb(zoneEntity.getId(), zoneEntity.getLabel(), zoneEntity.getParentZoneId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZoneEntity that = (ZoneEntity) o;
        return id == that.id && Objects.equals(label, that.label) && Objects.equals(parentZoneId, that.parentZoneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, parentZoneId);
    }
}
