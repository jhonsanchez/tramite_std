package pe.com.ebuho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pe.com.ebuho.repository.AdmMenuRepository;

/**
 * Created by John on 10/29/2015.
 */
@Controller
@RequestMapping("/mypage")
public class HomeController {
    @Autowired
    private AdmMenuRepository admMenuRepository;
    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("menus",admMenuRepository.findAll());
        return "mypage";
    }
    @RequestMapping("/{page}/{size}")
    public String homePagination(Model model,@PathVariable("page") int page, @PathVariable("size") int size){
        model.addAttribute("menus",admMenuRepository.findAll());
        return "mypage";
    }
}
