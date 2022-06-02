package ua.project.provider.db.services;

import ua.project.provider.db.entity.ContactDetails;

import java.util.List;


public interface IContactDetailsService {

    List<ContactDetails> findAll();

    ContactDetails find(long id);

    void save(ContactDetails account);

    void update(ContactDetails account);

    void remove(int id);
}
