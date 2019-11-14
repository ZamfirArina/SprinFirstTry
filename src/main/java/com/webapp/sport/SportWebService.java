package com.webapp.sport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sport")
public class SportWebService {

    @GetMapping
    public String test() {
        return "First try in Spring Web";
    }
    @GetMapping("/trainers")
    public List<String> studentsList(){
        return List.of("Andrei","Alexandrina","Dumitru","Andrei","Zina");
    }
    @GetMapping("/players")
    public List<String> teachersList(){
        return List.of("Vadim","Anatolie","Silvia","Ana","Petrea");
    }

}