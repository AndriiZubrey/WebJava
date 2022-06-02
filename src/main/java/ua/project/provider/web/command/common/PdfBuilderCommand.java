package ua.project.provider.web.command.common;

import ua.project.provider.Path;
import ua.project.provider.db.entity.User;
import ua.project.provider.db.services.*;
import ua.project.provider.utils.ReportBuilder;
import ua.project.provider.web.command.ICommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashSet;


public class PdfBuilderCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        String forward = Path.COMMAND_MAIN;
        if (session.getAttribute("newUser") != null) {
            User user = (User) session.getAttribute("newUser");

            ReportBuilder.contractPDF(response, user);
        } else {
            long id = Long.parseLong(request.getParameter("user_id"));
            IUserService userService = new UserServiceImpl();
            IContactDetailsService detailsService = new ContactDetailsServiceImpl();
            IAccountService accountService = new AccountServiceImpl();

            User fullUser = userService.find(id);
            fullUser.setRoleId(fullUser.getRoleId());
            fullUser.setDetails(detailsService.find(fullUser.getDetails().getId()));
            fullUser.setAccount(accountService.find(fullUser.getAccount().getId()));
            fullUser.setTariffs(new HashSet<>(userService.findUserTariffs(fullUser)));
            request.setAttribute("fullUser", fullUser);

            ReportBuilder.contractPDF(response, fullUser);
        }
        return forward;
    }
}
