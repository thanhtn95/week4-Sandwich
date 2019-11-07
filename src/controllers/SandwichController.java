package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandwichController {
    private ArrayList<String> list = new ArrayList<>();
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getIndex(Model model){
        ArrayList<String> condimentList = new ArrayList<>();
        condimentList.add("Letture");
        condimentList.add("Tomato");
        condimentList.add("Mustard");
        condimentList.add("Pickle");
        condimentList.add("Eatable Gold");
        model.addAttribute("condiment",condimentList);
        list = condimentList;
        return "index";
    }

    @RequestMapping(value = "/showSandwich", method = RequestMethod.POST)
    public String showSandwich(@RequestParam("condiment") String[] condimentList, Model model){
        String result ="";
        for(String con : condimentList){
            result+=con+", ";
        }
        result=result.substring(0,result.length()-2);
        model.addAttribute("condiment",list);
        model.addAttribute("result",result);
        return  "index";
    }
}
