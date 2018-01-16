package io.yadnyesh.sbgraphql.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/books")
@RestController
public class BookController {
	
	@PostMapping
	public void getAllBooks(@RequestBody String query) {
	
	}
}
