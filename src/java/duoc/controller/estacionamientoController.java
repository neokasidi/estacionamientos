
package duoc.controller;

import duoc.services.estacionamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class estacionamientoController {
    
    @Autowired
    @Qualifier("estacionamientoService")
    estacionamientoService estaSer;
    
    @RequestMapping(value="/home.htm", method = RequestMethod.GET)
    public String star(Model model){
        //model.addAttribute("modelEstacionamientos", estaSer.todo());
        return "index";
    }
    
    @RequestMapping(value="/con.htm", method = RequestMethod.GET)
    public String inicio(Model model){
        model.addAttribute("modelEstacionamientos", estaSer.todo());
        return "inicio";
    }
    
}
