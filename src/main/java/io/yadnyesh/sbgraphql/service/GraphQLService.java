package io.yadnyesh.sbgraphql.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

@Service
public class GraphQLService {
	
	@Value("classpath:books.graphql")
	Resource resource;
	
	@PostConstruct
	public void loadSchema() throws IOException {
		File schemaFile = resource.getFile();
	}
}
