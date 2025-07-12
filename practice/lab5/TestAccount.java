package practice.lab5;

public class TestAccount {
    public static void main(String[] args) {
        Account arthur = new Account("Arthur", 200) {
            @Override
            public void monthEnd() {

            }
        };
        Account brenda = new Account("Brenda", 70) {
            @Override
            public void monthEnd() {

            }
        };
        System.out.println(arthur);
        System.out.println(brenda);
        arthur.withdraw(50);
        brenda.withdraw(50);

    }
}
