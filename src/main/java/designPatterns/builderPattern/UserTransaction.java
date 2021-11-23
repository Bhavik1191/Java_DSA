package designPatterns.builderPattern;

public class UserTransaction {

    public static void main(String[] args) {



        //Create Object Traditional way
        Transactions transaction = new Transactions("123","321","","","","");
        System.out.println(transaction.toString());



        //Create object Builder pattern way
        Transactions transactionsBuilder1 = new Transactions.TransactionBuilder()
                //.setAmount("14")
                .setCurrency("USD")
                .setFromAccount("123")
                .build();

        System.out.println(transactionsBuilder1.toString());



        //If I don't have any values then it will take default values
        Transactions transactionsBuilder2 = new Transactions.TransactionBuilder().build();
        System.out.println(transactionsBuilder2.toString());
    }
}
