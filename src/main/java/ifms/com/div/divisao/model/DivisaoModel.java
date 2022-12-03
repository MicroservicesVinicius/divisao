package ifms.com.div.divisao.model;

import lombok.Data;



@Data
public class DivisaoModel {
    Double num1;
    Double num2;
    Double resultado;
    public DivisaoModel(Double num1,Double num2){
        this.num1=num1;
        this.num2=num2;


    }
    public Double getResultado(){
        this.resultado = this.num1/ this.num2;
        return this.resultado;

    }

    
}
