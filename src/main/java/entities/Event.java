package entities;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Event {

	@Id
	@GeneratedValue
	private Long id ;
	
	private String name;

	@OneToMany(
			mappedBy = "event",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	private List<User> lUsers = new ArrayList<User>();

	public Event(String name) {
		this.name = name;
	}

	public Event(){}


	public Long getId() {
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

	public void addUser(User user) {
		lUsers.add(user);
	}

	public void removeUser(User user) {
		lUsers.remove(lUsers.indexOf(user));
	}

	public List<User> getlUsers() {
		return lUsers;
	}

	public void setlUsers(List<User> lUsers) {
		this.lUsers = lUsers;
	}
}
