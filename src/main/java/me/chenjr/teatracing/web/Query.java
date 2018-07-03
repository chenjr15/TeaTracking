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
    public String showTeaPkg(@RequestParam Long tea_id, Model model){
        Long[] tea_ids= {tea_id};
        List<TeaPkg> list= teaPkgRepository.findAllById(Arrays.asList(tea_ids));
//        if (list.size()==0) return  "没有找到.";
        model.addAttribute("teaList",list);
        return "query.html";
    }

}
