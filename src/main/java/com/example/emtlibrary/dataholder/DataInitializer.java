package com.example.emtlibrary.dataholder;

import com.example.emtlibrary.model.Author;
import com.example.emtlibrary.model.Book;
import com.example.emtlibrary.model.Country;
import com.example.emtlibrary.model.enumerations.Category;
import com.example.emtlibrary.repository.AuthorRepository;
import com.example.emtlibrary.repository.BookRepository;
import com.example.emtlibrary.repository.CountryRepository;
import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataInitializer {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final CountryRepository countryRepository;

    public static List<Country> countries = new ArrayList<>();
    public static List<Author> authors = new ArrayList<>();
    public static List<Book> books = new ArrayList<>();

    public DataInitializer(BookRepository bookRepository, AuthorRepository authorRepository, CountryRepository countryRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.countryRepository = countryRepository;
    }


    @PostConstruct
    public void init(){
        Country country0 = new Country("Macedonia", "Europe");
        Country country1 = new Country("Canada", "America");
        Country country2 = new Country("Germany", "Europe");

        this.countryRepository.save(country0);
        this.countryRepository.save(country1);

        Author author0 = new Author("Matt", "Haig", country0);
        Author author1 = new Author("V.E.", "Schwab", country1);
        Author author2 = new Author("Scott", "Fitzgerald", country1);

        this.authorRepository.save(author0);
        this.authorRepository.save(author1);
        this.authorRepository.save(author2);


        Book book0 = new Book("The Midnight Library", Category.DRAMA, author0, 30);
        Book book1 = new Book("The Invisible Life of Addie LaRue", Category.NOVEL, author1, 89);
        Book book2 = new Book("The Great Gatsby", Category.NOVEL, author2, 35);
        Book book3 = new Book("Where the Crawdads Sing", Category.NOVEL, author1, 98);

        this.bookRepository.save(book0);
        this.bookRepository.save(book1);
        this.bookRepository.save(book2);
        this.bookRepository.save(book3);
    }
}
