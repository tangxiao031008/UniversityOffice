package com.my.service;


import com.my.dao.GroupDao;
import com.my.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDao groupDao;

    @Override
    public void createGroup(Group group) {
        groupDao.createGroup(group);
    }

    @Override
    public void deleteGroup(int id) {
        groupDao.deleteGroup(id);
    }

    @Override
    public void updateGroup(Group group) {
        groupDao.updateGroup(group);
    }

    @Override
    public List<Group> getAllGroups() {
        return groupDao.getAllGroups();
    }

    @Override
    public void addContactToGroup(int id, int id1) {

    }

}
