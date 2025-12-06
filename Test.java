import java.util.Scanner;


public class Test{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

   
    

    
      
      
         String choice ;
          System.out.println("Enter your choice(1, , 2 , 3 ,4)");
        System.out.println();

        System.out.println("Enter user choice");
     String User;
     User   = scanner.next();

     System.out.println("Enter computer choice");
     String Computer;
     Computer = scanner.next();



         
          choice = scanner.next();
          switch (choice) {
            case "1":if(User.equals("Rock")&& Computer.equals("Scissor")) System.out.println("User wins ");
                
                break;
                case "2":if(User.equals("Paper")&& Computer.equals("Scissor")) System.out.println("Computer wins  ");
                    break;
                    case"3" :if(User.equals("Scissor")&& Computer.equals("Rock")) System.out.println("Computer wins");
                    break;

                   
            case "4":if(User.equals("Scissor")&& Computer.equals("Paper")) System.out.println("User wins  ");
                
                break;
               
          
            default:
                break;
          }
        
    }
}