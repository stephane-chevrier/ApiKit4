package campus.apikit4;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tag", schema = "kit4", catalog = "")
public class TagEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "label", nullable = false, length = 255)
    private String label;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagEntity tagEntity = (TagEntity) o;
        return id == tagEntity.id && Objects.equals(label, tagEntity.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label);
    }
}
