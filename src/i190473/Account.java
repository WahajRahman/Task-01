package i190473;

import java.util.*;

/**

*

* Bank Account Class

* // Main ClassName -- "Main"

*/

class Account{

    String name,acc_type;

    int Acc_num,Acc_Balance;

    Account()
    {}

        Account(String n,int acc_num,int b,String a_t)
        {

            name=n;

            Acc_num=acc_num;

            Acc_Balance=b;

            acc_type=a_t;

        }

} // end class

class create_account extends Account
{

    create_account(String n,int acc_num,int b,String a_t){ // pass name and account type

            name=n;

            Acc_num=acc_num;

            Acc_Balance=b;

            acc_type=a_t;

    }

    create_account(){

        super();

    }

        

    void insert(String n,int acc_num,String a_t){ // input user name, account number and type

        name=n;

        acc_type=a_t;

        Acc_num=acc_num; // generate random number

        Acc_Balance=0;

    }

    

    void display_details(){

        System.out.println("Depositor Name :" +name);

        System.out.println("Account Number : "+Acc_num);

        System.out.println("Account Balance : "+Acc_Balance);

        System.out.println("Account Type : "+acc_type);

    }

        void deposite(int acc_num,int money){                 

                Acc_Balance=money;    

        }

        

        int withdraw(int withd){

                Acc_Balance=Acc_Balance-withd;

                return Acc_Balance;

        }
        
        void zakat()
        {
        	if (Acc_Balance >= 20000)
        	{
        		System.out.println("Amount of zakat is: " + (Acc_Balance * 2.5) / 100);
        	}
        	
        	else 
        	{
        		System.out.println("Zakat is not applicable");
        	}
        	
        }

  

} // end class

      
