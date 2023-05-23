package com.spring.jpa.library.service;

import com.spring.jpa.library.model.Library;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface LibraryService {
    Map<String, Object> readLibrary(int cpg);

    //Object countLibrary();
}
