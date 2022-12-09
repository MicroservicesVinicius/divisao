package ifms.com.div.divisao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifms.com.div.divisao.model.DivisaoModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/divisao")
public class DivisaoController {

    @GetMapping("/num1/{num1}/num2/{num2}")
    public Double getDivisao(@PathVariable String num1, @PathVariable String num2) {
     
        try {
            Double numero1 = Double.parseDouble(num1);
            Double numero2 = Double.parseDouble(num2);
            DivisaoModel div  = new DivisaoModel(numero1,numero2);
            return div.getResultado();

            
        } catch (Exception e) {
                
                 throw new NumberFormatException("Não é permitido letra na url!");
            
        }
      

    }
    
    
}
