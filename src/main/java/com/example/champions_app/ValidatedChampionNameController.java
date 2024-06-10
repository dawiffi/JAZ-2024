package com.example.champions_app;

import com.example.champions_app.model.Champion;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ValidatedChampionNameController {
    @GetMapping("/validateChampionName")
    public String loadFormPage(Model m) {
        m.addAttribute("validatedChampion", new Champion());
        return "ChampionName";
    }

    @PostMapping("/addValidatedChampionName")
    public String submitForm(@Valid Champion validatedChampion,
                             BindingResult bindingResult, Model m) {
        if (bindingResult.hasErrors()) {
            return "ChampionName";
        }
        String message = m.addAttribute("message", "Successfully saved champion!")
                + validatedChampion.toString();
        return "ChampionName";
    }
}
