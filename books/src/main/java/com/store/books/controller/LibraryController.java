package com.store.books.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.books.entity.Library;
import com.store.books.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {
	
	LibraryService libraryService;

	public LibraryController(LibraryService libraryService) {
		super();
		this.libraryService = libraryService;
	}
	

	@GetMapping
	public List<Library>getAllbookDetails(){
		return libraryService.getAllLibraries();
	}
	
	@GetMapping("/{bookId}")
	public Library getAllBookDetails(@PathVariable("bookId") String bookId) {
		return libraryService.getLibraries(bookId);
	}
	
	
	@PostMapping
	public String createBookDetails(@RequestBody Library library ) {
		return libraryService.createLibraries(library);
	}
	
	@PutMapping
	public String updateBookDetails(@RequestBody Library library ) {
		return libraryService.updateLibraries(library);
	}
	
	@DeleteMapping("/{bookId}")
	public String deleteBookDetails(@PathVariable("bodyId") String bodyId ) {
		return libraryService.deleteLibraries(bodyId);
	}
	
}