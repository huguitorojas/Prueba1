package org.hugo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComercianteExitoso implements Empleado {
    @Autowired
    @Qualifier("informeFinancieroTrim4")
    private CreacionInformeFinanciero nuevoInforme;

    @Autowired
    private TareaFinanciero nuevaTarea;


//@Autowired
//    public ComercianteExitoso(CreacionInformeFinanciero  nuevoInforme){
//        this.nuevoInforme = nuevoInforme;
//    }

//    @Autowired
//    public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//        this.nuevoInforme = nuevoInforme;
//    }

    @Override
    public String getTarea() {
        return nuevaTarea.getTareaFinanciero();
    }

    @Override
    public String getInforme() {
        return nuevoInforme.getInformeFinanciero();
    }
}
