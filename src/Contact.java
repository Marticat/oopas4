public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    // construct bauen
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // zort
    @Override
    public String toString() {
        return String.format("Name: %s%nPhone: %s%nEmail: %s%n", name, phoneNumber, email);
    }
}
