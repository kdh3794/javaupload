package java18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex18_05_Date {
    
    public static void main(String[] args) {
        SimpleDateFormat tf = null;
        
        // 현재 날짜와 시간 출력
        Date now = new Date();
        System.out.println(now.getDate());
        
        // 2017으로 출력되게
        tf = new SimpleDateFormat("yyyy");
        System.out.println(tf.format(now)); // 현재 연도만 출력
        
        System.out.println(now.getYear()); // 강사님
        
        tf = new SimpleDateFormat("MM");
        System.out.println(tf.format(now)); // 현재 월만 출력
        
        tf = new SimpleDateFormat("dd");
        System.out.println(tf.format(now)); // 현재 일만 출력
        
        System.out.println(now.getDay()); // 강사님
        
        tf = new SimpleDateFormat("hh");
        System.out.println(tf.format(now));// 현재 시간만 출력
        
        System.out.println(now.getHours()); // 강사님
        
        tf = new SimpleDateFormat("mm");
        System.out.println(tf.format(now));// 현재 분만 출력
        
        System.out.println(now.getMinutes()); // 강사님
        
        tf = new SimpleDateFormat("ss");
        System.out.println(tf.format(now));// 현재 초만 출력
        
        System.out.println(now.getSeconds()); // 강사님
        
        // 현재에 +3년 , -4월, +2일 "yyyy-MM-dd" 형태로 출력하시오.
        now.setYear(now.getYear() + 3); // 117+3
        now.setMonth(now.getMonth() - 4);
        now.setDate(now.getDate() + 2);
        
        tf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(tf.format(now)); // 2020-06-27
        
        // 현재에 +4시간 -30분 + 10초 출력 "HH:mm:ss" 형태로 출력하시오.
        now.setHours(now.getHours() + 4);
        now.setMinutes(now.getMinutes() - 30);
        now.setSeconds(now.getSeconds() + 10);
        tf = new SimpleDateFormat("HH:mm:ss");
        
        tf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(tf.format(now));
        
   
        
    }
    
}
