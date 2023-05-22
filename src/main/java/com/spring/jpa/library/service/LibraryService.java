package com.spring.jpa.library.service;

import com.spring.jpa.library.model.Library;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LibraryService {
    List<Library> readLibrary(int cpg);
}
