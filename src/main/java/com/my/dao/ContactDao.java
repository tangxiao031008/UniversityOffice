package com.my.dao;

import com.my.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactDao {

    List<Contact> queryAllContacts();
    void addContact(Contact contact);
    void deleteContact(int id);
    void updateContact(Contact contact);
    List<Contact> searchContacts(String name);


}

