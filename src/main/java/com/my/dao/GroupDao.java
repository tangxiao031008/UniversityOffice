package com.my.dao;

import com.my.model.Group;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupDao {
    void createGroup(Group group);
    void deleteGroup(int id);
    void updateGroup(Group group);
    List<Group> getAllGroups();
    Group getGroupById(int id);
}

