package ua.project.provider.db.repository;

import ua.project.provider.db.entity.Tariff;

import java.util.List;


public interface ITariff extends IEntity<Tariff> {

    List<Tariff> getAllByServiceId(long id);

    Tariff getByName(String name);
}
