package FreeCodeCamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactManagerTest {
    private static ContactManager contactManager;
    @BeforeAll
    public static void setup()
    {
        contactManager = new ContactManager();
    }
    @Test
    public void shouldCreateContact()
    {
        contactManager.addContact("John","Doe","0123456789");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1,contactManager.getAllContacts().size());

        Assertions.assertTrue(contactManager.getAllContacts().stream().anyMatch(contact -> contact.getFirstName().equals("John")
        && contact.getLastName().equals("Doe")));
    }
    @Test
    @DisplayName("Should Not Create Contact When First Name is Null")
    public void shouldThrowRunTimeExceptionWhenFirstNameIsNull()
    {
        Assertions.assertThrows(RuntimeException.class,() -> {
            contactManager.addContact(null,"Doe","0123456789");
        });
    }


}