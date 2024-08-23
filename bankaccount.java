public class bankaccount {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Anu";
        myAcc.setPassword("1isn,ske"); 

    }

}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

}
