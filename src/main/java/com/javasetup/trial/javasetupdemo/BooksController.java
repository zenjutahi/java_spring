package com.javasetup.trial.javasetupdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return Arrays.asList(new Book(2, "Be Your own master", "zenjy kaka"));
	}
	

}
