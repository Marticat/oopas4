public class ContactDialogFactory {
    public static ContactDialog createDialog(String action) {
        if (action.equals("add")) {
            return new AddressBookStyleDialog();
        } else if (action.equals("view")) {
            return new WebStyleDialog();
        } else {
            throw new IllegalArgumentException("Unknown action.");
        }
    }
}
