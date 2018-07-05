package me.chenjr.teatracing.web;


import me.chenjr.teatracing.domain.TeaPkg;
import me.chenjr.teatracing.service.TeaPkgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/edit")
public class Edit {
    private final TeaPkgService teaPkgService;

    @Autowired
    public Edit(TeaPkgService teaPkgService) {
        this.teaPkgService = teaPkgService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doAction(@RequestParam long tea_id, @RequestParam String action, Model model){

        TeaPkg teaPkg= teaPkgService.findById(tea_id);
        if (teaPkg != null){
            if (action.equals("del"))
                teaPkgService.deleteById(tea_id);
            else if (action.equals("sell"))
                teaPkgService.sellById(tea_id);
        }
        return "redirect:/list";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showEditPage(@RequestParam long tea_id, Model model){
        System.out.println("get tea_id "+tea_id);
        TeaPkg teaPkg= teaPkgService.findById(tea_id);
        System.out.println("got teapkg :"+teaPkg.getFactory());
        model.addAttribute("teaPkg",teaPkg);
        model.addAttribute("viewname","query");
        return  "edit";
    }
}
