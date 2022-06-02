package ua.project.provider.db.repository;

import ua.project.provider.db.entity.Tariff;
import ua.project.provider.db.entity.User;

import java.util.List;


public interface IUser extends IEntity<User> {

    User getByLogin(String login);

    List<Tariff> getTariffs(User user);

    void addLinksUsersHasTariffs(User user, String[] tariffsId);

    void deleteLinksUsersHasTariffs(User user);
}
