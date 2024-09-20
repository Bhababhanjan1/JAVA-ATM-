import java.util.Scanner;
class ATM{
    Scanner sc=new Scanner(System.in);
float bal;
int PIN=2004;
int choice;
public void menu()
{
    
    System.out.println("ENTER YOUR CHOICE");
    System.out.println("1.CHECK A/C BALANCE");
    System.out.println("2.WITHDRAWAL MONEY");
    System.out.println("3.DEPOSIT MONEY");
    System.out.println("4.EXIT");
    choice=sc.nextInt();
    if(choice==1){
        checkbalance();
    }
    else if(choice==2){
        withdrawmoney();
    }
    else if(choice==3)
    {
        depositmoney();
    }
    else if(choice==4){
        return;
    }
    else{
        System.out.println("ENTER A VALID CHOICE");
    }

}
public void checkpin()
{
    
    System.out.println("PLZ ENTER YOUR PIN");
    int PIN=sc.nextInt();
    if(PIN==2004)
    {
        menu();
    }
    else{
        System.out.println("ENTER A VALID PIN");
    }
}
public void checkbalance()
{
    System.out.println("BALANCE:"+bal);
    menu();
}
public void withdrawmoney()
{
    System.out.println("ENTER AMOUNT TO WITHDRAW");
    float amount=sc.nextFloat();
    if(amount>bal)
    {
        System.out.println("INSUFFICIENT BALANCE");
    }
    else{
        bal=bal-amount;
        System.out.println("MONEY WITHDRAWN SUCCESFULLY");
        System.out.println("AVAILABLE BALANCE:"+bal);
        
    }
    menu();
}
public void depositmoney()
{
    System.out.println("ENTER AMOUNT TO BE DEPOSITED:");
    float amount=sc.nextFloat();
    bal=bal+amount;
    System.out.println("MONEY DEPOSITED SUCCESSFULLY");
    System.out.println("AVAILABALE BALANCE:"+bal);
    menu();
}

}
class atmmachine{
public static void main(String[] args) {
    ATM obj=new ATM();
    obj.checkpin();
}
}





