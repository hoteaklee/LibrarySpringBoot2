package com.spring.jpa.library.service;

import com.spring.jpa.library.dao.LibraryDAO;
import com.spring.jpa.library.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("lbsrv")
public class LibraryServiceImpl  implements LibraryService{

    @Autowired
    LibraryDAO lbdao;

    @Override
    public Map<String, Object> readLibrary(int cpg) {
        return  lbdao.selectLibrary(cpg -1);
    } //페이지는 0부터 시작하는거라 -1해줌

//    @Override
//    public Object countLibrary() {
//        return lbdao.countLibrary();
//    }
}
