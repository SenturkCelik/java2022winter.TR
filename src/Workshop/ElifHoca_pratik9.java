package Workshop;

public class ElifHoca_pratik9 {
    public static void main(String[] args) {

        /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */

        int num = 9;
        String result = "";
        if (num >= 0 && num <= 9) {

            if (num == 9)
                result = "nine";

            else if (num == 8)
                result = "eight";

            else if (num == 7)
                result = "seven";
            else if (num == 6)
                result = "six";
            else if (num == 5)
                result = "five";
            else if (num == 4)
                result = "four";
            else if (num == 3)
                result = "three";
            else if (num == 2)
                result = "two";
            else if (num == 1)
                result = "one";
            else
                result = "zero";
        }else {
                result = "invalid";
            }


            System.out.println("result=" + result);

              //ternary ile

            int n=4;
            String result2=n==9? "nine" :
                           n==8? "eight":
                           n==7? "seven":
                           n==6? "six":
                           n==5? "five":
                           n==4? "four":
                           n==3? "three":
                           n==2? "two":
                           n==1? "one":
                           n==0? "zero" :"Invalid"  ;
            System.out.println(result2);








        }


    }