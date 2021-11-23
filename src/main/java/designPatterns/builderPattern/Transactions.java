package designPatterns.builderPattern;

public class Transactions {

    private String toUserId;
    private String fromUserId ;
    private String amount;
    private String currency;
    private String toAccount;
    private String fromAccount;



    //Normal constructor if not using builder class
    //We need to take all params as parameter every time even if its same
    // No need this, if we are using builder class. This is just to show difference
    public Transactions(String toUserId, String fromUserId, String amount, String currency, String toAccount, String fromAccount)
    {
        this.toUserId = toUserId;
        this.fromUserId =fromUserId;
        this.amount =amount;
        this.currency =currency;
        this.toAccount =toAccount;
        this.fromAccount =fromAccount;
    }

    /**
     * This is another constructor which has Param as builder class
     *
     * @param transactionBuilder
     */
    public Transactions(TransactionBuilder transactionBuilder)
    {
        this.toUserId = transactionBuilder.toUserId;
        this.fromUserId =transactionBuilder.fromUserId;
        this.amount =transactionBuilder.amount;
        this.currency =transactionBuilder.currency;
        this.toAccount =transactionBuilder.toAccount;
        this.fromAccount =transactionBuilder.fromAccount;

    }


    /**
     * Overriding toString() method just to Print data for showing the value
     * No compulsorily needed of same
     * @return
     */
    @Override
    public String toString() {
        return "User Transaction Details : " + toUserId + " "+ fromUserId + " "+ amount+ " "+ currency + " "+toAccount+" "+ fromAccount;
    }


    //Creating Stating nested builder class
    public static class TransactionBuilder {

        private String toUserId;
        private String fromUserId ;
        private String amount;
        private String currency;
        private String toAccount;
        private String fromAccount;



        // Now in this case all the values are mandatory and we already have Pre defined value wit us
        // Because in testing we store test data with us.
        //If any use case which hase mandatory params, are not predefined then we need to take those from outside.
        // So declare those in Constructor params
        // ex - TransactionBuilder(String amount)
        // Now if we call this we always have to give amount from outside
        public TransactionBuilder(){

            this.toUserId = "default_userid";
            this.fromUserId = "default_userid";
            this.amount = "default_amount";
            this.toUserId = "default_toUserId";
            this.toAccount = "default_toAccount";
            this.fromAccount = "default_fromAccount";
        }


        // These all are setter method, used to set values
        //If we not use them then, as created in constructor default values will be assigned to all variables.
        public TransactionBuilder setFromUserId(String fromUserId) {
            this.fromUserId = fromUserId;
            return this;
        }

        public TransactionBuilder setAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public TransactionBuilder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public TransactionBuilder setToAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public TransactionBuilder setFromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public TransactionBuilder setToUserId(String toUserId) {
            this.toUserId = toUserId;
            return this;
        }

        /**
         * build() method used to return the parent class of builder, after perform all the actions by the builder.
         * So use this method in the end after you set the required data to this builder class
         * @return
         */
        public Transactions build()
        {
            return new Transactions(this);
        }
    }
}

