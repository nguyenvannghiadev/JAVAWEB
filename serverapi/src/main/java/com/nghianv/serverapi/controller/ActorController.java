package com.nghianv.serverapi.controller;

import com.nghianv.serverapi.model.ActorModel;
import com.nghianv.serverapi.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/api")
public class ActorController {
    @Autowired
    ActorRepository actorRepository;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String homeActor(Model model) {
        List<ActorModel> list = actorRepository.findAll();
        //actorRepository.delete();
        //actorRepository.save()
        //actorRepository.deleteById();
        model.addAttribute("listActor", list);
        return "index";
    }
}
