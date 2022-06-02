package ua.project.provider.db.services;

import ua.project.provider.db.entity.PackageServices;

import java.util.List;


public interface IPackageService {

    List<PackageServices> findAll();

    PackageServices find(long id);

    void save(PackageServices service);

    void update(PackageServices service);

    void remove(long id);
}
