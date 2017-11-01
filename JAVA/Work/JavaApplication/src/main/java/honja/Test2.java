package honja;

public class Test2 {
    public static void main(String[] args) {
        String prov = "74 874 9883 73 9 73646 774";
        // 각 숫자의 합계와 평균
        String[] sArray = prov.split(" ");
        int sum = 0;
        int[] iArray = new int[sArray.length];
        for (int i = 0; i <= sArray.length - 1; i = i + 1) {
            
            String s = sArray[i];// 문자열 배열에서 값을 꺼내서
            
            // 문자열을 정수로 형변환
            int t = Integer.valueOf(s);
            
            iArray[i] = t;
        }
        
        for (int a = 0; a <= iArray.length - 1; a = a + 1) {
            sum = iArray.length;//합이 안나옴. 
        }
        System.out.println(" " + sum);
        
    }
}
