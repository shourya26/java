package switchcase;

public class Switchcase{
public static void  main (String[] args){
    int choice;
    System.out.println("Pick one :1. Hi\t2. Hey\t3. hello\t");
    Scanner s = new Scanner(System.in);
    choice = s.nextInt ();
    switch(choice)
    {
        case 1 : System.out.println("You said hi");
         break;
         case 2 : System.out.println("You said hey");
         break;
         case 3 : System.out.println("You said hello");
         break;
         default : System.out.println("invalid choice");
    }
  }
}
