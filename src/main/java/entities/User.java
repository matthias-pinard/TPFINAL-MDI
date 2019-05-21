package entities;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    @JsonIgnore
    private Event event;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonIgnore
    public Event getEvent() {
        return event;
    }

    @JsonIgnore
    public void setEvent(Event event) {
        this.event = event;
    }
}
