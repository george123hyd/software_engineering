import java.util.Scanner;
public class caladd{
  public static void main(String args[]){
    float a,b,res;
    char choice,ch;
    Scanner scan=new Scanner(System.in);
    do{
      System.out.println("1.Add two nums\n");
      System.out.println("2.Mult two nums\n");
      System.out.println("3.exit\n");
      System.out.println("enter yr choice\n");
      choice=scan.next().charAt(0);
      switch(choice){
        case'1':a=scan.nextFloat();
                b=scan.nextFloat();
                System.out.println("res : " a+b);
                break;
        case '3':System.exit(0);
                  break;
        default :System.out.println("ueryhgfeigwhg");
      }
      System.out.println("\n");
    }
    while(choice!=2);

    }
  }
}
