package me.chenjr.teatracing.web;

import me.chenjr.teatracing.domain.TeaPkg;
import me.chenjr.teatracing.service.TeaPkgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class List {
    @Autowired
    private TeaPkgService teaPkgService;

    @RequestMapping("/list")
    public String listAll(Model model){
        java.util.List<TeaPkg> teaPkgList = teaPkgService.loadAll();
        model.addAttribute("teaPkgList",teaPkgList);
        return  "list";

    }
}
