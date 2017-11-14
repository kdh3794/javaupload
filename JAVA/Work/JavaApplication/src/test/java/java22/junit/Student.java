package java22.junit;

public class Student {
    
    private String name="";
    private int    score = 0;
    
   
    
    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getScore() {
        return score;
    }



    public void setScore(int score) {
        this.score = score;
    }



    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }



    public Student(String name, int score) {
        super();
        this.name = name;
        this.score = score;
    }



    public Student() {
        super();
    }



    public String getgrade(int grade) {
        
        String result = "";
        
        if (grade >= 90) {
            result =  "A";
        } else if (grade >= 80) {
            result =  "B";
        } else if (grade >= 70) {
            result =  "C";
        } else if (grade >= 60) {
            result = "D";
        } else {
            result =  "F";
        }
        return result;
        
    }
    
}
