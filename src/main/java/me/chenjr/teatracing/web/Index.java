package me.chenjr.teatracing.web;

import me.chenjr.teatracing.domain.TeaPkg;
import me.chenjr.teatracing.service.TeaPkgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Index {

    @Autowired
    private TeaPkgService teaPkgService;

    @RequestMapping("/")
    public String showIndex(Model model){
        model.addAttribute("viewname","index");
        return  "index";
    }
}
