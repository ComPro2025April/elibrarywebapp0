package edu.miu.cs.cs425.lesson_z.elibrarywebapp0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"", "/"})
public class PublicPagesController {

    @GetMapping(value = {"", "/elibrary", "/elibrary/home"})
    public String displayHomepage() {
        return "public/index";
    }

    @GetMapping(value = {"/elibrary/about"})
    public String displayAboutPage() {
        return "public/about";
    }

}
