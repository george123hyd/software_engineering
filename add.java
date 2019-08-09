import java.util.Scanner;
public class add{
  public static void main(String args[]){
    float a,b,res;
    char choice,ch;
    Scanner scan=new Scanner(System.in);
    do{
      System.out.print("1.Add two nums\n");
      System.out.print("2.Mult two nums\n");
      System.out.print("3.exit\n");
      System.out.print("enter yr choice\n");
      choice=scan.next().charAt(0);
      switch(choice){
        case '1':a=scan.nextFloat();
                b=scan.nextFloat();
                res=a+b;
                System.out.print(res);
                break;
        case '2':a=scan.nextFloat();
                b=scan.nextFloat();
                res=a*b;
                System.out.print(res);
                break;
        case '3':System.exit(0);
                  break;
        default :System.out.print("ueryhgfeigwhg");
      }
      System.out.print("\n");
    }
    while(choice!=2);

    }
  }
