package beans;

import dominio.Investigacion;
import jakarta.faces.bean.ManagedBean;

@ManagedBean
public class InvestigacionBean {
    private Investigacion investigacion;

    // Constructor
    public InvestigacionBean() {
        investigacion = new Investigacion("SalvaShop", 
                                          "Lorem ipsum dolor sit amet consectetur adipisicing elit. Nulla tempore assumenda sunt laudantium eaque, odio pariatur exercitationem expedita optio vitae neque aliquam minima velit ducimus iste. Incidunt dolorum doloremque ipsam.",
                                          "https://es.wikipedia.org/wiki/salvashop",
                                          "imagen_investigacion.jpeg");
    }

    public Investigacion getInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(Investigacion investigacion) {
        this.investigacion = investigacion;
    }
}
