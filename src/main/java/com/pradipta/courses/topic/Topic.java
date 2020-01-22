package com.pradipta.courses.topic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class Topic {
	@Id
	@Column(name = "id")
	private @Getter @Setter String id;
	@Column(name = "title")
	private @Getter @Setter String title;
	@Column(name = "desc")
	private @Getter @Setter String desc;
	
	public Topic() {
	}

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.title = name;
		this.desc = description;
	}
}
