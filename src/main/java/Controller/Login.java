package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login {

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request,
                              HttpServletResponse response) {
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        String message;
        if(userName != null && userName.equals("jai") && password != null && password.equals("123")){
            message = "Welcome " + userName + ".";
            return new ModelAndView("home", "message", message);

        } else {
            message = "Wrong username or password.";
            return new ModelAndView("errorPage", "message", message);
        }
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }


}
