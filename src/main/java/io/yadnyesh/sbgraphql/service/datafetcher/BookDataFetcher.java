package io.yadnyesh.sbgraphql.service.datafetcher;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import io.yadnyesh.sbgraphql.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookDataFetcher implements DataFetcher<Book>{
	
	@Override
	public Book get(DataFetchingEnvironment dataFetchingEnvironment) {
		return null;
	}
}
