package com.webapp.sport;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicina")
public class MedicinaWebService {

    @GetMapping
    public String test() {
        return "First try in Spring Web";

    }
    @GetMapping("/farmacists")
    public List<String> farmacistsList()
    {
        return List.of(" Andrei","Tudor","Vlad","Emil","Mihai");
    }
    @GetMapping("/doctor")
    public List<String> doctorList(){

        return List.of("reumatolog","oftalmolog","neurolog","terapeut","urolog");
    }

@PostMapping("/add/{farmacistsName}")
 public void add(@PathVariable("farmacistsName") String farmacistsName) {
    System.out.println(farmacistsName);
    }
}
