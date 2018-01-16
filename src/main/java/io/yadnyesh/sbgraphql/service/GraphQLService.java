package io.yadnyesh.sbgraphql.service;

import graphql.GraphQL;
import graphql.schema.DataFetcher;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import io.yadnyesh.sbgraphql.service.datafetcher.AllBooksDataFetcher;
import io.yadnyesh.sbgraphql.service.datafetcher.BookDataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	private GraphQL graphQL;
	
	@Autowired
	private AllBooksDataFetcher allBooksDataFetcher;
	@Autowired
	private BookDataFetcher bookDataFetcher;
	
	@PostConstruct
	public void loadSchema() throws IOException {
		File schemaFile = resource.getFile();
		TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(schemaFile);
		RuntimeWiring wiring = buildRuntimeWiring();
		GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(typeRegistry);
		graphQL = GraphQL.newGraphQL(schema).build();
	}
	
	private RuntimeWiring buildRuntimeWiring() {
		return RuntimeWiring.newRuntimeWiring()
				.type("Query", typeWiring -> typeWiring
					.dataFetcher("allBooks", allBooksDataFetcher)
					.dataFetcher("book", bookDataFetcher))
				.build();
	}
		
	//		return RuntimeWiring.newRuntimeWiring()
	//				.type("Query", typeWiring ->  typeWiring
	//							.dataFetcher("allBooks", allBooksDataFetcher)
	//							.dataFetcher("book", bookDataFetcher)
	//							.build());
//	}
}
