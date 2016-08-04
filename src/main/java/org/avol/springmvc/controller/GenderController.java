package org.avol.springmvc.controller;

import org.avol.springmvc.model.Gender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

/**
 * Created by Durga on 8/4/2016.
 */
@Controller
public class GenderController {

    @RequestMapping(value = "/genders", method = RequestMethod.GET)
    public String getGenders(Model model) {
        model.addAttribute("genders", Arrays.asList(Gender.values()));
        System.out.println(Arrays.asList(Gender.values()));
        return "index";
    }
}
