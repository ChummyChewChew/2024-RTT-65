package org.leorodriguez.glab030931.MyController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/showFlowerList")
    public String sendDataToHtml(Model model) {
        String[] flowers = new String[]{ "Rose", "Lily", "Tulip", "Carnation", "Hyacinth"};
        String[] City = new String[]{"nyc","nj","dallas", "chicago", "philadelphia"};
        model.addAttribute("flowersVariable", flowers);
        model.addAttribute("cityVariable", City);
        return "viewFlowers";
    }
}
