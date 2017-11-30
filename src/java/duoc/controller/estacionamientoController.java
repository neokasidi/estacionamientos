
package duoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/estacionamientos")
public class estacionamientoController {
    
    @RequestMapping(value="/home.htm", method = RequestMethod.GET)
    public String inicio(Model model){        
        return "inicio";
    }
    
}
