package ua.project.provider.db.services;

import ua.project.provider.db.entity.Tariff;
import ua.project.provider.db.entity.User;

import java.util.List;


public interface IUserService {

    List<User> findAll();

    User find(long id);

    void save(User user);

    void update(User user);

    void remove(int id);

    User findByLogin(String login);

    List<Tariff> findUserTariffs(User user);

    void saveLinksUsersHasTariffs(User user, String[] tariffsId);

    void removeLinksUsersHasTariffs(User user);
}
