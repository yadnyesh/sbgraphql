package io.yadnyesh.sbgraphql.service.datafetcher;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import io.yadnyesh.sbgraphql.model.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllBooksDataFetcher implements DataFetcher<List<Book>>{
	
	@Override
	public List<Book> get(DataFetchingEnvironment dataFetchingEnvironment) {
		return null;
	}
}
