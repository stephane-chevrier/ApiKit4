package campus.apikit4;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "meter", schema = "kit4", catalog = "")
public class MeterEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "zone_id", nullable = false)
    private int zoneId;
    @Basic
    @Column(name = "tag_id", nullable = true)
    private Integer tagId;
    @Basic
    @Column(name = "label", nullable = false, length = 255)
    private String label;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeterEntity that = (MeterEntity) o;
        return id == that.id && zoneId == that.zoneId && Objects.equals(tagId, that.tagId) && Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, zoneId, tagId, label);
    }
}
