package com.spring.jpa.library.dao;

import com.spring.jpa.library.model.Library;
import com.spring.jpa.library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("lbdao")
public class LibraryDAOImpl implements LibraryDAO {

    @Autowired
    LibraryRepository libraryRepository;

    @Override
    public List<Library> selectLibrary(int cpg) {
        Pageable paging = PageRequest.of(cpg, 25, Sort.by("lbno").descending());
        return libraryRepository.findAll(paging).getContent();
    }
}
