package board.model;

import java.util.Arrays;
import java.util.Date;

public class ModelAttachFile {
    private Integer attachfileno = null;
    private String filename = "";
   private String filetype    = "";
   private Integer filesize = null;
   private Integer articleno   = null;
   private Byte[] imageData   = null;
   private Boolean UseYN       = null;
   private String InsertUID   = "";
   private java.util.Date InsertDT    = null;
   private String UpdateUID   = "";
   private java.util.Date UpdateDT    = null;
public Integer getAttachfileno() {
    return attachfileno;
}
public void setAttachfileno(Integer attachfileno) {
    this.attachfileno = attachfileno;
}
public String getFilename() {
    return filename;
}
public void setFilename(String filename) {
    this.filename = filename;
}
public String getFiletype() {
    return filetype;
}
public void setFiletype(String filetype) {
    this.filetype = filetype;
}
public Integer getFilesize() {
    return filesize;
}
public void setFilesize(Integer filesize) {
    this.filesize = filesize;
}
public Integer getArticleno() {
    return articleno;
}
public void setArticleno(Integer articleno) {
    this.articleno = articleno;
}
public Byte[] getImageData() {
    return imageData;
}
public void setImageData(Byte[] imageData) {
    this.imageData = imageData;
}
public Boolean getUseYN() {
    return UseYN;
}
public void setUseYN(Boolean useYN) {
    UseYN = useYN;
}
public String getInsertUID() {
    return InsertUID;
}
public void setInsertUID(String insertUID) {
    InsertUID = insertUID;
}
public java.util.Date getInsertDT() {
    return InsertDT;
}
public void setInsertDT(java.util.Date insertDT) {
    InsertDT = insertDT;
}
public String getUpdateUID() {
    return UpdateUID;
}
public void setUpdateUID(String updateUID) {
    UpdateUID = updateUID;
}
public java.util.Date getUpdateDT() {
    return UpdateDT;
}
public void setUpdateDT(java.util.Date updateDT) {
    UpdateDT = updateDT;
}
@Override
public String toString() {
    return "ModelAttachfile [attachfileno=" + attachfileno + ", filename="
            + filename + ", filetype=" + filetype + ", filesize=" + filesize
            + ", articleno=" + articleno + ", imageData="
            + Arrays.toString(imageData) + ", UseYN=" + UseYN + ", InsertUID="
            + InsertUID + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID
            + ", UpdateDT=" + UpdateDT + "]";
}
public ModelAttachFile(Integer attachfileno, String filename, String filetype,
        Integer filesize, Integer articleno, Byte[] imageData, Boolean useYN,
        String insertUID, Date insertDT, String updateUID, Date updateDT) {
    super();
    this.attachfileno = attachfileno;
    this.filename = filename;
    this.filetype = filetype;
    this.filesize = filesize;
    this.articleno = articleno;
    this.imageData = imageData;
    UseYN = useYN;
    InsertUID = insertUID;
    InsertDT = insertDT;
    UpdateUID = updateUID;
    UpdateDT = updateDT;
}
public ModelAttachFile() {
    super();
}
 
}
