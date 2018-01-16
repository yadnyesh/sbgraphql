package io.yadnyesh.sbgraphql.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class GraphQLService {
	
	@Value("classpath:books.graphql")
	Resource resource;
	
	
}
