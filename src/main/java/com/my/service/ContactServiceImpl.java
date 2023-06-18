package com.my.service;

import com.my.dao.ContactDao;
import com.my.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactDao contactDao;

    @Override
    public void addContact(Contact contact) {
        contactDao.addContact(contact);
    }
    @Override
    public void deleteContact(int id) {
        contactDao.deleteContact(id);
    }
    @Override
    public void updateContact(Contact contact) {
        contactDao.updateContact(contact);
    }
    @Override
    public List<Contact> searchContacts(String keyword) {
        return contactDao.searchContacts(keyword);
    }

    @Override
    public void exportContacts(Object csv) {

    }
}