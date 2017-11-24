/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Auto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author RigoBono
 */
@Controller
@RequestMapping("/ver.htm")
public class VerController {
    
    //siempre los métodos deben retornar String
    
    @RequestMapping(method = RequestMethod.GET)
    public String otroMetodo(Model model){
        return "index";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String recibir(@RequestParam("Option") String opc,@RequestParam("Option2") String opc2,@RequestParam("Option3") String opc3, Model model){
        if (opc.equals("1") && opc2.equals("1") && opc3.equals("1")) {
           return "exito";
        }
        else {
            
            return "error";
        }
    }
    
}
