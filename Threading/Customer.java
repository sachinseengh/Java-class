
public class Customer {
    int amount=10000;
    synchronized void withdraw(int amount){
        System.out.println("goint to withdraw");
        
        if(this.amount<amount)
{
    System.out.println("Less balance;waiting for money to be stored");
    try{wait();}catch(Exception e){System.out.println(e);}
}
this.amount-=amount;
System.out.println("withdraw completed");    
}
synchronized void deposit(int amount){
    System.out.println("Goint to depositt.....pls wait");
    this.amount+=amount;
    System.out.println("deposti complted....");
    notify();
}

}

    
