public class Contact {
    String firstName;
    String LastNAme;
    String Address;
    String city;
    String state;
    String zip;
    String  phoneNumber;
    String email;

    public Contact(String firstName, String LastNAme, String Address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.LastNAme = LastNAme;
        this.Address = Address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

        public String getInfo () {

            return "First name is" + firstName + "Last Name is" + LastNAme + "Address is " + Address + "City is" + city + "State is" + state + "Zip is " + zip + "Phone number is" + phoneNumber + "Email is " + email;

        }
    }

