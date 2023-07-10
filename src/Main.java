import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(dividesByTwo(scanner.nextInt()));
//    }
//
//    static String dividesByTwo(int a) {
//        if (a % 2 == 0) {
//            return "jup san ";
//        } else {
//            return "tak san ";
//        }
//  Scanner scanner= new Scanner(System.in);
//        System.out.println(method(scanner.nextInt(), scanner.nextInt(), scanner.nextInt() ) );
//    }
//   static double method(int a,int b,int c) {
//        return (double) (a+b+c)/3;
//   }
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sandar(sc.nextInt()));
//    }
//
//    static int sandar(double san) {
//        int b = 0;
//        for (int i = 0; i <= san; i++) {
//            b += i;
//        }
//        return b;

//        int[] array ={1,2,14,12,17,22,45};
//        System.out.println(metod(array));
//    }
//  static int metod(int[]array) {
//      int b = array[0];
//      for (int i = 0; i < array.length; i++) {
//         if (b > array[i]){
//             b=array[i];
//         }
//      }
//      return b;
        int[]array =new int[300];
        System.out.println(method(array));
  }
  static int method (int []array ){
        int count=0;
      for (int i = 0; i < array.length ; i++) {
        array[i]=i;

        if (array[i]%3==0&&array[i]%4==0&&array[i]%5==0){
            count+=array[i];
        }
      }return count;
  }
}

