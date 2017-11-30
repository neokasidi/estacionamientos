/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author samm
 */
@Controller
@RequestMapping("/home")
public class homeController {
    
    @RequestMapping(value="/inicio.htm", method = RequestMethod.GET)
    public String inicio(Model model){        
        return "inicio";
    }
    
    @RequestMapping(value="/login.htm", method = RequestMethod.POST)
    public String login(Model model){        
        return "inicio";
    }
}
