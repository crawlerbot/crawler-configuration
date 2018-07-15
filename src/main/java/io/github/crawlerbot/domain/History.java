package io.github.crawlerbot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

/**
 * A History.
 */
@Document(collection = "history")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "history")
public class History implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("name")
    private String name;

    // simlife-needle-entity-add-field - Simlife will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public History name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }
    // simlife-needle-entity-add-getters-setters - Simlife will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        History history = (History) o;
        if (history.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), history.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "History{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            "}";
    }
}
