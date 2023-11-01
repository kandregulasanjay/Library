package com.store.books.service;

import java.util.List;

import com.store.books.entity.Library;

public interface LibraryService {

	public List<Library>getAllLibraries();
	
	public String createLibraries(Library library);
	
	public String updateLibraries(Library library);
	
	public String deleteLibraries(String bodyId);
	
	public Library getLibraries(String bodyId);
}
