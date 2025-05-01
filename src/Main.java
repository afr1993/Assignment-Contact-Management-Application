public class Main {
    public static void main(String[] args) {
        ContactDirectory directory = new ContactDirectory();

        directory.addContact(new Contact(1,"Adrian","6462763442","afr.1993@gmail.com","Personal"));
        directory.addContact(new Contact(2,"Ana","6461314478","ana234@gmail.com","Personal"));
        directory.addContact(new Contact(3,"Mario","6641785442","mario@gmail.com","Profesional"));
        directory.addContact(new Contact(4,"Alberto","646298442","alb3rt@gmail.com","Personal"));

        System.out.println("\n--- All Contacts ---");
        directory.displayContacts();

        System.out.println("\n--- Unique Contact Types ---");
        directory.displayContactTypes();

        System.out.println("\n--- Searching for 'Adrian' ---");
        directory.searchContactByName("Adrian");

        //Contact not found
        System.out.println("\n--- Updating 'Alicia' ---");
        directory.updateContact("Alicia", "646897836", "alice@gmail.com", "Professional");

        System.out.println("\n--- Updating 'Adrian' ---");
        directory.updateContact("Adrian", "111111111", "adrian@gmail.com", "Professional");

        System.out.println("\n--- Sorted Contacts ---");
        directory.sortContactsByName();
    }
}