package ua.project.provider.web.command.common;

import ua.project.provider.Path;
import ua.project.provider.web.command.ICommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NoCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String errorMessage = "No such command";
        request.setAttribute("errorMessage", errorMessage);
        return Path.PAGE_ERROR_PAGE;
    }
}
