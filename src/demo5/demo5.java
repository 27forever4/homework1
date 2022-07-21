package demo5;

public class demo5 {
    public static void main(String[] args) {
        Account account=new Account();
        account.balance=100000000;
        account.id=2213121;
        account.save();
        account.getInfo();
        account.withdraw();
        Customer customer=new Customer();
        customer.address="斤斤计较";
        customer.id=123223;
        customer.phone=12313231;
        customer.name="hyj";
        customer.show();
    }
}
