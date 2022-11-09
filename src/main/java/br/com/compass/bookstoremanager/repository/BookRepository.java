package br.com.compass.bookstoremanager.repository;

import br.com.compass.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookService extends JpaRepository<Book, Long> {
}
