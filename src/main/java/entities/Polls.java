package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Polls {
	
	public Polls() {};
	Long id;
	
	String name;
	
	@Id
	@GeneratedValue
	Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String toString() {
		String str = "id: " + id + " / name: " + name;
		return str;
	}
}
