import java.util.Scanner;

public class javatest1 {
    public static void main(String[] args) {
        // 자바 기본개념익히기
        System.out.print("이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();
        
        if(name.equals("장현석")){
            System.out.println("일치");
            System.out.println(name);
        }else{
            System.out.println("불일치");
            System.out.println(name);
        }
      
        
        String[] array = {"사과","딸기","포도","배"};
        for(int i=0; i<array.length; i++){
            if(i==array.length-1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i]+" ");

            }
        }
    }
}
