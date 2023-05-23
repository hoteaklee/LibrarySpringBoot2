package com.spring.jpa.library.repository;

import com.spring.jpa.library.model.Library;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LibraryRepository extends PagingAndSortingRepository<Library, Long> {

//    @Query("select ceil(count (lbno)/25) from  Library ")
//    int countLibraryBy();
}
