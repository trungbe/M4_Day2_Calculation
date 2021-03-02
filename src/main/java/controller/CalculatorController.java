package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/show")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping("/show")
    public ModelAndView calculator(@RequestParam int num1, int num2, String check) {
        int result = 0;
        switch (check) {
            case "Addition":
                result = num1 + num2;
                break;
            case "Subtraction":
                result = num1 - num2;
                break;
            case "Multiplication":
                result = num1 * num2;
                break;
            case "Division":
                result = num1 / num2;
                break;
        }
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("result", result);
        modelAndView.addObject("check", check);
        return modelAndView;
    }
}
