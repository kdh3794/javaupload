package board.model;

public class ModelRecommend {
    private String userid = "";
    private Integer articleno = null;
    private Boolean good = null;
    private Boolean bad = null;
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public Integer getArticleno() {
        return articleno;
    }
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }
    public Boolean getGood() {
        return good;
    }
    public void setGood(Boolean good) {
        this.good = good;
    }
    public Boolean getBad() {
        return bad;
    }
    public void setBad(Boolean bad) {
        this.bad = bad;
    }
    @Override
    public String toString() {
        return "ModelRecommend [userid=" + userid + ", articleno=" + articleno
                + ", good=" + good + ", bad=" + bad + "]";
    }
    public ModelRecommend(String userid, Integer articleno, Boolean good,
            Boolean bad) {
        super();
        this.userid = userid;
        this.articleno = articleno;
        this.good = good;
        this.bad = bad;
    }
    public ModelRecommend() {
        super();
    }
   

}
