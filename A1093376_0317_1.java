import java.util.*;
public class A1093376_0317_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入整數 m：");
        int m = sc.nextInt();
        System.out.println("請輸入整數 n：");
        int n = sc.nextInt();

        int [][] array = new int[m][n];                      

        for(int i = 0 ; i < array.length ; i++){                          
            for(int j = 0 ; j < array[i].length ; j++){                     
                array[i][j]=(i+1)*(j+1);        
            }
        }
        System.out.println("結果顯示：");
        for(int [] x : array ){                     
            for(int y : x){
                System.out.print(y);
                System.out.print(" ");
            }
            System.out.println();                                                    
        }
    }
}