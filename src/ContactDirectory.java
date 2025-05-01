import  java.util.*;
public class ContactDirectory {
    private  List<Contact> contacts;
    private Set<String> contactType;
    private Map <String, Contact> contactMap;

    public ContactDirectory() {
        this.contacts = new ArrayList<>();
        this.contactType = new  HashSet<>();
        this.contactMap = new HashMap<>();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
        contactType.add(contact.getContactType());
        contactMap.put(contact.getName(), contact);
    }

    public void updateContact(String name, String newPhone, String newEmail, String newType){
        Contact contact = contactMap.get(name);
        if(contact != null){
            contact.setPhoneNumber(newPhone);
            contact.setEmail(newEmail);
            contact.setContactType(newType);
            contactType.add(newType);
            System.out.println("Contact Updated: "+contact);
        } else {
            System.out.println("Contact not found: "+name);
        }
    }

    public void displayContacts(){
        for (Contact c : contacts){
            System.out.println(c);
        }
    }

    public void sortContactsByName() {
        contacts.sort(Comparator.comparing(Contact::getName));
        System.out.println("Contacts sorted by name: ");
        displayContacts();
    }

    public void displayContactTypes() {
        System.out.println("Unique contact types:");
        for (String type : contactType) {
            System.out.println(type);
        }
    }

    public void searchContactByName(String name){
        Contact contact = contactMap.get(name);
        if (contact != null) {
            System.out.println("Contact found: " + contact);
        } else {
            System.out.println("No contact found with name: " + name);
        }
    }

}
