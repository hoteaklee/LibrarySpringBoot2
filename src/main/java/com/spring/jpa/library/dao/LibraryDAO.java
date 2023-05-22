package com.spring.jpa.library.dao;

import com.spring.jpa.library.model.Library;

import java.util.List;

public interface LibraryDAO {
    List<Library> selectLibrary(int cpg);
}
