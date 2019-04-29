package com.example.webjars;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 程江涛 on 2019/4/29.
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Arte");
        return "index";
    }
}
