package com.spring67.upload.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

//클라이언트에서 배열로 넘어오는 변수를 자바의 list로 변환하기 위한 클래스

@Repository
public class RepositoryFiles {
    
    //SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    
    //필드명으로는 클라이언트에서 넘어오는 변수명,
    //즉, input 태그의 name 속성 값을 필드명으로 사용해야 한다.
    // <input type = "file" name = "files[0]" />
    private List<org.springframework.web.multipart.MultipartFile> files;
    
    public List<org.springframework.web.multipart.MultipartFile> getFiles(){
        return files;
    }
    public void setFiles(
            List<org.springframework.web.multipart.MultipartFile> files){
        this.files = files;
    }
            
}
