class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        String fullName;
        if (this.firstName != "" && this.lastName != "") {
            return fullName = this.firstName + " " + this.lastName;
        } else if (this.firstName == "" && this.lastName != "") {
            return fullName = this.lastName;
        } else if (this.lastName == "" && this.firstName != "") {
            return fullName = this.firstName;
        } else {
            return "Unknown";
        }
    }

    public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName());

        User katie = new User();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName());

        User larry = new User();
        larry.setFirstName(null);
        larry.setLastName(null);
        System.out.println(larry.getFullName());
    }
}