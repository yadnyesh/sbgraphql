package io.yadnyesh.sbgraphql.controller;

import io.yadnyesh.sbgraphql.service.GraphQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/books")
@RestController
public class BookController {
	
	@Autowired
	GraphQLService graphQLService;
	
	@PostMapping
	public void getAllBooks(@RequestBody String query) {
	
	}
}
