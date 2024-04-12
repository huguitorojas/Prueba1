package org.hugo;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Presentacion del informe financiero del trimestre 3";
    }
}
