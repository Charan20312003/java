class BankAccount{
//propaerty
 static double balance;
public static void credit(double amount){
System.out.println("credit started");
if(amount>0.0)
{
 balance = balance+amount;
}
else
{
 System.out.println("invalid amount");
}

System.out.println("credit endeded");
}


public static void debit(double amount)
{
System.out.println("debit started");
if(amount<=balance)
{
 balance = balance-amount;
}
else
{
 System.out.println("invalid amount");
}

System.out.println("debit endeded");
}
public static void getBalance()
{
System.out.println("balance"+balance);

}
}


