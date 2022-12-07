import java.util.Scanner;

import static java.lang.Math.abs;

public class BankAcc {
    String CusName;
    int CusId, balance,preTrans;
    BankAcc(String name,int id,int bal){
        CusName=name;
        CusId=id;
        balance=bal;
        System.out.println("Customer name: "+CusName);
        System.out.println("Customer ID: "+CusId);
        System.out.println("Balance: "+balance);

    }
    void deposit(int amount)
    {
        //logical error
        if(amount<=0)
            System.out.println("please enter correct amount");
        else
        {balance+=amount;
            preTrans=amount;
            System.out.println("amount: "+preTrans);
            System.out.println("Balance: "+balance);
        }

    }
    void withdrow(int amount)
    {
        if(balance>=abs(amount))
        {balance-=abs(amount);
            preTrans=amount;
            System.out.println("amount: "+abs(preTrans));
            System.out.println("Balance: "+balance);
        }
    }
    void getPreTrans(int trans)
    {
        trans=preTrans;
        if(trans>0)
        {
            System.out.println("last transaction is Deposit");
            System.out.println("amount is: "+trans);
        }
        else if(trans<0)
        {
            System.out.println("last transaction is Withdrow");
            System.out.println("amount is: "+abs(trans));
        }
    }
    void showMenu(){
        System.out.println("1.deposit\t 2.withdrow\t 3.get transaction\t 4.Exit");
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("please enter the process number");
            int x = input.nextInt();
            if(x==4)
            {
                System.out.println("Thanks for choosing us :)");
                break;
            }
            switch(x){
                case 1:
                    System.out.println("enter the amount of money:");
                    int am = input.nextInt();
                    deposit(am);
                    break;
                case 2:
                    System.out.println("enter the amount of money:");
                    int amm = input.nextInt();
                    withdrow(amm);
                    break;
                case 3:
                    getPreTrans(preTrans);
                    break;
            }
        }
    }


}
