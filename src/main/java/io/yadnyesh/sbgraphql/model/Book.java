package io.yadnyesh.sbgraphql.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Book {

	@Id
	private String isn;
	
	private String title;
	
	private String publisher;
	
	private String[] authors;
	
	private String publishDate;
}
