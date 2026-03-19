public class Task4 {

    static class BankAccount {
        int acc;
        double balance;

        BankAccount(int a,double b){ acc=a; balance=b; }

        void deposit(double x){ balance+=x; }
        void withdraw(double x){ balance-=x; }
    }

    static class SavingsAccount extends BankAccount {
        SavingsAccount(int a,double b){ super(a,b); }
    }

    static class CreditAccount extends BankAccount {
        CreditAccount(int a,double b){ super(a,b); }
    }

    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount(1,1000);
        s.deposit(500);
        s.withdraw(200);
        System.out.println(s.balance);
    }
}