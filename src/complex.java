public class complex {
    String customerName;
    int customerID;
    long accountNumber;
    long mobileNumber;
    String address;
    String pan;
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public long getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getAddress() {
        return address;
    }
    

    public void setAddress(String address) {
        this.address = address;
    }
    public String getPan() {
        return pan;
    }
    public void setPan(String pan) {
        this.pan = pan;
    }
   
    public complex(String customerName, int customerID, long accountNumber, long mobileNumber, String address,
            String pan) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.accountNumber = accountNumber;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.pan = pan;
            }
}
