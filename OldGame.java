import java.util.Scanner;import java.util.Random;
public class OldGame
{
    public static void main(String[]args)
    {
        System.out.println("Hello guys this is a small game check it out\n Enter 0 for help");
        Scanner k=new Scanner(System.in);
        //  System.out.println("Want to know the rules of the Game press y/n");
        // if (k.next=="Y")
        System.out.print("Pls Enter your favorite tool: \n1)Scissor\n2)Paper\n3)Stone ");
        Integer rawInput=100;boolean stupid=true;
        // int u=0;
        while(stupid)
        {
            try
            {
                rawInput=new Integer(k.nextInt());
            }
            catch(java.util.InputMismatchException ime)
            {
                System.out.println("You gave wrong input");
                k.next(); // clear the string from keyboard / input stream
               continue; // restart
            }
            if(rawInput instanceof Integer && rawInput>=1 && rawInput<=3)
            {
                stupid=false;
            }
            else
            {
                System.out.println("wrong input pls enter again");
            }
            /*u++;*/ //if(u==5)break; 
        }
        // int pInput=Integer.parseInt(rawInput);
        //built tools
        
        Random r=new Random();
        int rndm =1+r.nextInt(2);
        
        /*if(rawInput==0)
         {
         System.out.println("Paper grabs Stone but is cut by the scissors.The stone breaks the scissors");
         }
         else{*/
        if(rndm==rawInput)
        {
            System.out.println(" Game tied");
        }
        else
        {
            if(rawInput==1 )
            {
                if(rndm==2)
                {System.out.println("Scissor cuts paper ,You WIN!!");}
                if(rndm==3){System.out.println("Stone breaks Scissors,You Lose!!");}
            }
            if(rawInput==2)
            {
                if(rndm==1){System.out.println("Scissors cuts paper, You LOSE!!");}
                if(rndm==3){System.out.println("Paper Grabs Stone,You WIN!!");}
            }       
            if(rawInput==3)
            {
                if(rndm==1){System.out.println("Stone breaks scissor, You WIN!!");}
                if(rndm==2){System.out.println("Paper grabs stone, You LOSE!!");}
            }
        }
        System.out.println("Thanks For Playin this small game");
    }
}
//}