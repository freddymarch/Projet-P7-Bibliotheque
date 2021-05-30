package org.openclassrooms.bibliotheque.repository;

import org.openclassrooms.bibliotheque.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
