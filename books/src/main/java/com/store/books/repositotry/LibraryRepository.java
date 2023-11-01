package com.store.books.repositotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.books.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, String>{

}
