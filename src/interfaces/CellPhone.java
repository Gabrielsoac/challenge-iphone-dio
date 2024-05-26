package interfaces;

import entities.Chip;
import entities.Contact;

import java.util.ArrayList;
import java.util.List;

public interface CellPhone {

    Chip chip = new Chip();
    List<Contact> contacts = new ArrayList<>();

    boolean toCall(String number);
    boolean inviteSMS(String number, String message);

}
