package io.yadnyesh.sbgraphql.repository;

import io.yadnyesh.sbgraphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String>{

}
