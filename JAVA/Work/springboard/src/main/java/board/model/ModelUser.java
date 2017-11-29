package board.model;

import java.util.Date;

public class ModelUser {
    private String userid ="";
    private Integer userno = null;
    private String email = "";
    private String passwd = "";
    private String name="";
    private String mobile="";
    private Integer retireYN = null;
    private String InsertUID = "";
    private java.util.Date InsertDT = null;
    private String UpdateUID = "";
    private java.util.Date UpdateDT = null;
    public String getUserid() {
        return userid;
        
        
    }
    public ModelUser() {
        super();
    }
    public ModelUser(String userid, Integer userno, String email, String passwd,
            String name, String mobile, Integer retireYN, String insertUID,
            Date insertDT, String updateUID, Date updateDT) {
        super();
        this.userid = userid;
        this.userno = userno;
        this.email = email;
        this.passwd = passwd;
        this.name = name;
        this.mobile = mobile;
        this.retireYN = retireYN;
        InsertUID = insertUID;
        InsertDT = insertDT;
        UpdateUID = updateUID;
        UpdateDT = updateDT;
    }
    @Override
    public String toString() {
        return "ModelUser [userid=" + userid + ", userno=" + userno + ", email="
                + email + ", passwd=" + passwd + ", name=" + name + ", mobile="
                + mobile + ", retireYN=" + retireYN + ", InsertUID=" + InsertUID
                + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID
                + ", UpdateDT=" + UpdateDT + "]";
    }
    public Integer getUserno() {
        return userno;
    }
    public void setUserno(Integer userno) {
        this.userno = userno;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Integer getRetireYN() {
        return retireYN;
    }
    public void setRetireYN(Integer retireYN) {
        this.retireYN = retireYN;
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
    public void setUserid(String userid) {
        this.userid = userid;
    }
    
}
