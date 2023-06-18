package com.my.service;

import com.my.model.Contact;
import com.my.model.Group;

import java.util.List;

public interface GroupService {
    void createGroup(Group group);
    void deleteGroup(int id);
    void updateGroup(Group group);
    List<Group> getAllGroups();
    void addContactToGroup(int id, int id1);
}
