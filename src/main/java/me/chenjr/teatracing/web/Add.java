package me.chenjr.teatracing.web;

import me.chenjr.teatracing.domain.Master;
import me.chenjr.teatracing.domain.TeaPkg;
import me.chenjr.teatracing.service.TeaPkgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Add {
    @Autowired
    TeaPkgService teaPkgService;

    @RequestMapping(value = "/add",method = {RequestMethod.POST})
    public String addTeaPkg(@RequestParam String factory_name,
                            @RequestParam String master_name,
                            @RequestParam String seller_name,
                            Model model){

        TeaPkg  teaPkg =  teaPkgService.add(new TeaPkg(factory_name,master_name,seller_name));
        model.addAttribute("teacode",teaPkg.getTeacode());
        model.addAttribute("queryUrl","/query?tea_id="+teaPkg.getTeacode());
        model.addAttribute("viewname","add");

        return "add.html";
    }
    @RequestMapping(value = "/add",method = {RequestMethod.GET})
    public String showAddUI(Model model){
        model.addAttribute("viewname","add");
        return "add-ui.html";

    }
}
