package com.store.books.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.store.books.entity.Library;
import com.store.books.repositotry.LibraryRepository;
import com.store.books.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {
	

	LibraryRepository libraryRepository;
	
     public LibraryServiceImpl(LibraryRepository libraryRepository) {
		super();
		this.libraryRepository = libraryRepository;
	}

	@Override
	public List<Library> getAllLibraries() {
		return libraryRepository.findAll();
		
	}

	@Override
	public String createLibraries(Library library) {
		libraryRepository.save(library);
		return "Successfully Created";
	}

	@Override
	public String updateLibraries(Library library) {
		libraryRepository.save(library);
		return "Successfully updated";
	}

	@Override
	public String deleteLibraries(String bodyId) {
		libraryRepository.deleteById(bodyId);
		return "Successfully Deleted";
	}

	@Override
	public Library getLibraries(String bodyId) {
		return libraryRepository.findById(bodyId).get();		
	}

}
