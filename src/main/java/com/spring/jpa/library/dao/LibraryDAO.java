package com.spring.jpa.library.dao;

import com.spring.jpa.library.model.Library;

import java.util.List;
import java.util.Map;

public interface LibraryDAO {
    Map<String, Object> selectLibrary(int cpg);

    //int countLibrary();
}
