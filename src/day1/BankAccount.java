package day1;

 public class BankAccount {

    /* States
        -> Account Number (String)
        -> Account Type (Account Type)
        -> Account Holder Name (String)
        -> Routing Number (String)
        -> Signature Of Account Holder (Collection of byte) => Blob
        -> Phone Number Associated with Account (String)
        -> Address of Account Holder (String)
        -> Username (String)
        -> Password (Collection of chars)
        -> Account Balance (double)
        -> Transfer Limit (Float)
        -> Photo (String) => Example : D:/Download/taman.png
        -> User Type (String)
        -> Email (String)
        -> SSN / Citizen Ship Number (String)
        -> Statements (List of something)
    */

     private String accountNumber;
     private double accountBalance;
     private AccountType accountType;
     private String accountHolderName;
     private String routingNumber;
     private byte[] signatureOfAccountHolder;
     private String phoneNumber;
     private String address;
     private String userName;
     private String password;
     private String ssn; // 123456789
     private String hashedSSN; // #####789



     /* Constructors

    */

    /* Behaviour
        Login
        Check Balance
        Transfer Balance
        View Statement

        Getters & Setters => In encapsulation to access the states we need getters and setters
    */

     public String getAccountNumber(){
          return accountNumber;
     }
     public void setAccountNumber(String accNumber){
          accountNumber = accNumber;
     }

     public void setSSN(String socialNumber){
          ssn = socialNumber; // encryption(socialNumber) => akjshdaj21eqw
          // hashedSSN = hashed(socialNumber) => #####6789
     }

     public String getHashedSSN(){
          return hashedSSN;
     }

      public double getAccountBalance() {
           return accountBalance;
      }

      public void setAccountBalance(double accountBalance) {
           this.accountBalance = accountBalance;
      }

      public AccountType getAccountType() {
           return accountType;
      }

      public void setAccountType(AccountType accountType) {
           this.accountType = accountType;
      }

      public String getAccountHolderName() {
           return accountHolderName;
      }

      public void setAccountHolderName(String accountHolderName) {
           this.accountHolderName = accountHolderName;
      }

      public String getRoutingNumber() {
           return routingNumber;
      }

      public void setRoutingNumber(String routingNumber) {
           this.routingNumber = routingNumber;
      }

      public String getPhoneNumber() {
           return phoneNumber;
      }

      public void setPhoneNumber(String phoneNumber) {
           this.phoneNumber = phoneNumber;
      }

      public String getAddress() {
           return address;
      }

      public void setAddress(String address) {
           this.address = address;
      }

      public String getUserName() {
           return userName;
      }

      public void setUserName(String userName) {
           this.userName = userName;
      }

      public boolean transferBalance(BankAccount fromAccount, BankAccount toAccount, double amount){
          // Code to transfer the balance
           return true;
      }

      public void getInstance(){
          BankAccount bankAccount = new BankAccount();
          bankAccount.ssn = "asdasd";
     }
}
