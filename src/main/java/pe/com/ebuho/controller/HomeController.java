package pe.com.ebuho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.com.ebuho.repository.AdmMenuRepository;

/**
 * Created by John on 10/29/2015.
 */
@Controller
public class HomeController {
    @Autowired
    private AdmMenuRepository admMenuRepository;
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("menus",admMenuRepository.findAll());
        return "home";
    }
}
