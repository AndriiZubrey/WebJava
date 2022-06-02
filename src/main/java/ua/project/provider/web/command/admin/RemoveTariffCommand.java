package ua.project.provider.web.command.admin;

import ua.project.provider.Path;
import ua.project.provider.db.services.ITariffService;
import ua.project.provider.db.services.TariffServiceImpl;
import ua.project.provider.web.command.ICommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RemoveTariffCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        ITariffService service = new TariffServiceImpl();
        int tariffId = Integer.parseInt(request.getParameter("tariff_id"));
        service.remove(tariffId);
        return Path.COMMAND_MAIN;
    }
}
