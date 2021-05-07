package org.openclassrooms.bibliotheque.repository;

import org.openclassrooms.bibliotheque.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
