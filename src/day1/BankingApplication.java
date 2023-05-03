package day1;

public class BankingApplication {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber("123456");
        bankAccount.setSSN("987654321");
        bankAccount.setAccountHolderName("Taman Neupane");
        bankAccount.setAccountBalance(30000);
        bankAccount.setAccountType(AccountType.SAVING_ACCOUNT);
        bankAccount.setAddress("Nepal");
        bankAccount.setRoutingNumber("akjshdkajs");
        bankAccount.setPhoneNumber("9876543210");
        bankAccount.setUserName("taman");

        String accountNumber = bankAccount.getAccountNumber();
        String hashSSN = bankAccount.getHashedSSN();



    }
}
