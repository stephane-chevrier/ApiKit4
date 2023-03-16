package campus.apikit4;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "meter_data", schema = "kit4", catalog = "")
public class MeterDataEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "meter_id", nullable = false)
    private int meterId;
    @Basic
    @Column(name = "when", nullable = false)
    private Timestamp when;
    @Basic
    @Column(name = "value", nullable = false, precision = 0)
    private int value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMeterId() {
        return meterId;
    }

    public void setMeterId(int meterId) {
        this.meterId = meterId;
    }

    public Timestamp getWhen() {
        return when;
    }

    public void setWhen(Timestamp when) {
        this.when = when;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeterDataEntity that = (MeterDataEntity) o;
        return id == that.id && meterId == that.meterId && value == that.value && Objects.equals(when, that.when);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, meterId, when, value);
    }
}
