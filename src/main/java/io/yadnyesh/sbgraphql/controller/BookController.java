package io.yadnyesh.sbgraphql.controller;

import graphql.ExecutionResult;
import io.yadnyesh.sbgraphql.service.GraphQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Object> getAllBooks(@RequestBody String query) {
		ExecutionResult executionResult = graphQLService.getGraphQL().execute(query);
		return new ResponseEntity<>(executionResult, HttpStatus.OK);
	}
}
