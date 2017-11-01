package honja;


import java.util.ArrayList;
import java.util.*;

class Student
{
String 이름;
String 학과;
int 학번;
double 학점평균;

public Student(String 이름,String 학과,int 학번,double 학점평균)
{
this.이름=이름;
this.학과=학과;
this.학번=학번;
this.학점평균=학점평균;
}
public String toString()
{
return 이름+","+학과+","+학번+","+학점평균;
}
}

public class Arraylist1 {
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     ArrayList<Student> a=new ArrayList<Student>();
     for(int i=0;i<3;i++)
     {
      System.out.println("이름을 입력하세요");
      String 이름=s.next();
      System.out.println("학과를 입력하세요");
      String 학과=s.next();
      System.out.println("학번을 입력하세요");
      int 학번=s.nextInt();
      System.out.println("학점 평균을 입력하세요");;
      double 학점평균=s.nextDouble();
      
      Student p=new Student(이름,학과,학번,학점평균);
      a.add(p);
     }
     
     for(int i=0;i<a.size();i++)
     {
      System.out.println(a.get(i));
     }
    }
    

   }
   