package com.spring.jpa.library.repository;

import com.spring.jpa.library.model.Library;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LibraryRepository extends PagingAndSortingRepository<Library, Long> {
}
