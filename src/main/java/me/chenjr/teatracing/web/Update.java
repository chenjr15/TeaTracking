package me.chenjr.teatracing.web;

import me.chenjr.teatracing.domain.Factory;
import me.chenjr.teatracing.domain.TeaPkg;
import me.chenjr.teatracing.service.TeaPkgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/update")
public class Update {
    private final TeaPkgService teaPkgService;

    @Autowired
    public Update(TeaPkgService teaPkgService) {
        this.teaPkgService = teaPkgService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String updateTeaPkg(
            @RequestParam String factory_name,
            @RequestParam String master_name,
            @RequestParam String seller_name,
            @RequestParam long tea_id,
            @RequestParam boolean forsell
    ){
        System.out.printf("forsell is  %b",forsell);
        TeaPkg teaPkg = teaPkgService.findById(tea_id);
        if (teaPkg != null){
            teaPkg.setFactory(factory_name);
            teaPkg.setForsell(forsell);
            teaPkg.setMaster(master_name);
            teaPkg.setSeller(seller_name);
            teaPkgService.remove(teaPkg);
            teaPkgService.add(teaPkg);

        }

        return "redirect:/list";

    }
}
