package io.yadnyesh.sbgraphql.service.datafetcher;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import io.yadnyesh.sbgraphql.model.Book;
import io.yadnyesh.sbgraphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllBooksDataFetcher implements DataFetcher<List<Book>>{
	
	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> get(DataFetchingEnvironment dataFetchingEnvironment) {
		return bookRepository.findAll();
	}
}
