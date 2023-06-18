package com.my.controller;

import com.my.model.Contact;
import com.my.model.Group;
import com.my.service.ContactService;
import com.my.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @Autowired
    private GroupService groupService;

    @PostMapping("/add")
    @ResponseBody
    public String addContact(@RequestBody Contact contact) {
        contactService.addContact(contact);
        return "Contact added successfully";
    }

    @GetMapping("/delete")
    @ResponseBody
    public String deleteContact(@RequestParam int id) {
        contactService.deleteContact(id);
        return "Contact deleted successfully";
    }

    @PostMapping("/update")
    @ResponseBody
    public String updateContact(@RequestBody Contact contact) {
        contactService.updateContact(contact);
        return "Contact updated successfully";
    }

    @GetMapping("/search")
    @ResponseBody
    public List<Contact> searchContacts(@RequestParam String name) {
        return contactService.searchContacts(name);
    }

    @PostMapping("/createGroup")
    @ResponseBody
    public String createGroup(@RequestBody Group group) {
        groupService.createGroup(group);
        return "Group created successfully";
    }



}

