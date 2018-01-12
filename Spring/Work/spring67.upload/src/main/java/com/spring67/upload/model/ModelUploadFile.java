package com.spring67.upload.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelUploadFile {
    private Integer uploadFileNo = null;// uploadFileNo INT UNSIGNED NOT NULL AUTO_INCREMENT
    private String  fileNameOrig = "";  // fileNameOrig NVARCHAR(100) NOT NULL -- 진짜 파일명
    private String  fileNameTemp = "";  // fileNameTemp NVARCHAR(100) NOT NULL -- 서버에 저장되는 임시 파일명
    private Integer fileSize     = null;// fileSize INT UNSIGNED NOT NULL
    private String  contentType  = "";  // contentType NVARCHAR(30) NOT NULL
    public Integer getUploadFileNo() {
        return uploadFileNo;
    }
    public void setUploadFileNo(Integer uploadFileNo) {
        this.uploadFileNo = uploadFileNo;
    }
    public String getFileNameOrig() {
        return fileNameOrig;
    }
    public void setFileNameOrig(String fileNameOrig) {
        this.fileNameOrig = fileNameOrig;
    }
    public String getFileNameTemp() {
        return fileNameTemp;
    }
    public void setFileNameTemp(String fileNameTemp) {
        this.fileNameTemp = fileNameTemp;
    }
    public Integer getFileSize() {
        return fileSize;
    }
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    @Override
    public String toString() {
        return "ModelUploadFile [uploadFileNo=" + uploadFileNo
                + ", fileNameOrig=" + fileNameOrig + ", fileNameTemp="
                + fileNameTemp + ", fileSize=" + fileSize + ", contentType="
                + contentType + "]";
    }
    public ModelUploadFile(Integer uploadFileNo, String fileNameOrig,
            String fileNameTemp, Integer fileSize, String contentType) {
        super();
        this.uploadFileNo = uploadFileNo;
        this.fileNameOrig = fileNameOrig;
        this.fileNameTemp = fileNameTemp;
        this.fileSize = fileSize;
        this.contentType = contentType;
    }
    public ModelUploadFile() {
        super();
    }
    
    
}
