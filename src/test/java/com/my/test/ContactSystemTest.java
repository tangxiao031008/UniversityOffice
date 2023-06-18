package com.my.test;

import com.my.export.ExportFormat;
import com.my.model.Contact;
import com.my.model.Group;
import com.my.model.SearchCriteria;
import com.my.service.ContactService;
import com.my.service.GroupService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class ContactSystemTest {

    @Autowired
    private ContactService contactService;

    @Autowired
    private GroupService groupService;

    @Test
    public void testContactSystem() {
        // 创建联系人
        Contact contact1 = new Contact();
        contactService.addContact(contact1);

        // 创建分组
        Group group1 = new Group("Friends");
        groupService.createGroup(group1);

        // 将联系人添加到分组
        groupService.addContactToGroup(contact1.getId(), group1.getId());

        // 查询联系人
        List<Contact> contacts = contactService.searchContacts(new SearchCriteria().toString());
        System.out.println("查询到的联系人：");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }

        // 修改联系人
        Contact contactToUpdate = contacts.get(0);
        contactToUpdate.setFirstName("UpdatedFirstName");
        contactService.updateContact(contactToUpdate);

        // 删除联系人
        Contact contactToDelete = contacts.get(1);
        contactService.deleteContact(contactToDelete.getId());

        // 导出联系人
        contactService.exportContacts(ExportFormat.CSV);


    }
}


