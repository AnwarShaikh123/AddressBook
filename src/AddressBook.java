import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    String firstName;
    String LastName;
    String Address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public AddressBook(String firstName, String LastName, String Address, String city, String state, String zip, String phoneNumber, String email){
        this.firstName=firstName;
        this.LastName=LastName;
        this.Address=Address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;

    }

    public static void main(String[] args) {
        ArrayList<String> contact= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name:");
        String first_name= sc.nextLine();
        contact.add(first_name);
        System.out.println("Enter last name :");
        String last_name=sc.nextLine();
        contact.add(last_name);
        System.out.println("Enter Address: ");
        String address=sc.nextLine();
        contact.add(address);
        System.out.println("Enter city: ");
        String city=sc.nextLine();
        contact.add(city);
        System.out.println("Enter state: ");
        String state=sc.nextLine();
        contact.add(state);
        System.out.println("Enter zip: ");
        String zip=sc.nextLine();
        contact.add(zip);
        System.out.println("Enter phone number: ");
        String phone_number=sc.nextLine();
        contact.add(phone_number);
        System.out.println("Enter email: ");
        String email=sc.nextLine();
        contact.add(email);
        for(int i=0; i< contact.size();i++){
            System.out.println(contact.get(i));
        }
    }
}

