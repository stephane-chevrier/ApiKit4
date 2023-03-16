package campus.apikit4;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tag_data", schema = "kit4", catalog = "")
public class TagDataEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "tag_id", nullable = false)
    private int tagId;
    @Basic
    @Column(name = "when", nullable = false)
    private Timestamp when;
    @Basic
    @Column(name = "value", nullable = false, precision = 0)
    private BigDecimal value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public Timestamp getWhen() {
        return when;
    }

    public void setWhen(Timestamp when) {
        this.when = when;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagDataEntity that = (TagDataEntity) o;
        return id == that.id && tagId == that.tagId && value == that.value && Objects.equals(when, that.when);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tagId, when, value);
    }
}
