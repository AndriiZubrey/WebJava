package ua.project.provider.web.command.admin;

import ua.project.provider.Path;
import ua.project.provider.db.entity.PackageServices;
import ua.project.provider.db.entity.Tariff;
import ua.project.provider.db.entity.User;
import ua.project.provider.db.services.*;
import ua.project.provider.web.command.ICommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;


public class MainCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        IPackageService IPackageService = new PackageServiceImpl();
        ITariffService ITariffService = new TariffServiceImpl();
        IUserService IUserService = new UserServiceImpl();
        IContactDetailsService detailsService = new ContactDetailsServiceImpl();
        IAccountService IAccountService = new AccountServiceImpl();

        List<PackageServices> services = IPackageService.findAll();
        List<Tariff> internetTariffs = ITariffService.findAllById(1);
        List<Tariff> iptvTariffs = ITariffService.findAllById(2);
        List<Tariff> telephonyTariffs = ITariffService.findAllById(3);

        List<User> users = IUserService.findAll();
        List<User> fullUser = new ArrayList<>();
        for (User user : users) {
            user.setRoleId(user.getRoleId());
            user.setDetails(detailsService.find(user.getDetails().getId()));
            user.setAccount(IAccountService.find(user.getAccount().getId()));
            user.setTariffs(new HashSet<>(IUserService.findUserTariffs(user)));
            fullUser.add(user);
        }

        request.setAttribute("services", services);
        request.setAttribute("internetTariffs", internetTariffs);
        request.setAttribute("iptvTariffs", iptvTariffs);
        request.setAttribute("telephonyTariffs", telephonyTariffs);
        request.setAttribute("fullUser", fullUser);

        return Path.PAGE_MAIN;
    }
}

