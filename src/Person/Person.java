package Person;

public class Person {
    private String name, address, phone_number, Email;

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public Person(String name, String address, String phone_number, String email) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        Email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return Email;
    }

    public String toString(){
        return "name: " + this.name + " address " + this.address + " phone number: " + this.phone_number + " E-mail: " + this.Email;
    }

}
