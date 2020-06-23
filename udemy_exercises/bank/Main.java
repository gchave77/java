package udemy_exercises.bank;

public class Main {

    public static void main(String[] args) {

        udemy_exercises.bank.Bank bank = new udemy_exercises.bank.Bank("CitiBank");

        if (bank.addBranch("New York")) {
            System.out.println("New York branch created");
        }

        bank.addCustomer("New York", "Tim S.", 50.05);
        bank.addCustomer("New York", "Mike A.", 175.34);
        bank.addCustomer("New York", "Percy J.", 220.12);

        bank.addBranch("Chicago");
        bank.addCustomer("Chicago", "Bob R.", 150.54);

        bank.addCustomerTransaction("New York", "Tim S.", 44.22);
        bank.addCustomerTransaction("New York", "Mike A.", 12.44);
        bank.addCustomerTransaction("New York", "Percy J.", 1.65);

        bank.addCustomerTransaction("Chicago", "Bob R.", 121.44);
        bank.addCustomerTransaction("Chicago", "Bob R.", 111.65);

        bank.listCustomers("New York", true);
        bank.listCustomers("Chicago", true);

        if (!bank.addCustomer("Dallas", "Brian J.", 5.53)) {
            System.out.println("Error Dallas branch does not exist");
        }

        if (!bank.addBranch("New York")) {
            System.out.println("New York branch already exists");
        }

        if (!bank.addCustomerTransaction("New York", "Fergus Z.", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("New York", "Tim S.", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}