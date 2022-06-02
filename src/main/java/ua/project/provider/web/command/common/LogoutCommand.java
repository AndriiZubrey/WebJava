package ua.project.provider.web.command.common;

import org.apache.log4j.Logger;
import ua.project.provider.Path;
import ua.project.provider.web.command.ICommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogoutCommand implements ICommand {
    private static final Logger log = Logger.getLogger(LogoutCommand.class);

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        log.debug("ICommand starts");

        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        log.debug("ICommand finished");
        return Path.PAGE_INDEX;
    }
}
