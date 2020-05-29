class Account {

    private long balance;
    private String ownerName;
    private boolean locked;


    long getBalance() {
        return this.balance;
    }

    long setBalance(long balance) {

        return this.balance = balance;
    }

    String getOwnerName() {
        return this.ownerName;
    }

    String setOwnerName(String ownerName) {
        return this.ownerName = ownerName;
    }

    boolean isLocked() {
        return this.locked;
    }

    boolean setLocked(Boolean locked) {
        return this.locked = locked;
    }



}