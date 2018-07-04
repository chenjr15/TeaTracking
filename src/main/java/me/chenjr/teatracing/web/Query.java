package me.chenjr.teatracing.web;

import me.chenjr.teatracing.domain.TeaPkg;
import me.chenjr.teatracing.repositories.TeaPkgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Query {
    @Autowired
    TeaPkgRepository teaPkgRepository;
    @RequestMapping("/query")
    public String showTeaPkg(@RequestParam String tea_id, Model model){
        Long[] tea_ids= {Long.valueOf(tea_id)};
        System.out.println(tea_id);
        System.out.println(tea_ids[0].toString());
        TeaPkg teaPkg= teaPkgRepository.findByTeacode(tea_ids[0]);
//        if (list.size()==0) return  "没有找到.";
        model.addAttribute("teapkg",teaPkg);
        model.addAttribute("viewname","query");
        return "query";
    }

}
