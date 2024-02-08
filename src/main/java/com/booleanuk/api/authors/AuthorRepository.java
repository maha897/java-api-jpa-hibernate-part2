package com.booleanuk.api.authors;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    boolean existsByFirstNameAndLastName(String firstName, String lastName);
}
