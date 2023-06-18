package com.my.service;

import com.my.model.Contact;

import java.util.List;

public interface ContactService {
    void addContact(Contact contact);
    void deleteContact(int id);
    void updateContact(Contact contact);
    List<Contact> searchContacts(String keyword);
    void exportContacts(Object csv);
}
