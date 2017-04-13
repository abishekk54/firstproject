package ques1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aa_event")
public class Event {
	@Id
	
	int id;
	String eventName;
	@ElementCollection
	@CollectionTable(name="a_feedback")
	Set<String> feedBack;
	
	public Event() {
		// TODO Auto-generated constructor stub
	}

	public Event(int id, String eventName) {
		super();
		this.id = id;
		this.eventName = eventName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Set<String> getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(Set<String> feedBack) {
		this.feedBack = feedBack;
	}
	
	
	

}
