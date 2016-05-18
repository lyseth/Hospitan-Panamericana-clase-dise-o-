package citasModificada;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean
public class selec_especialistaModificar {

    private List<SelectItem> categorias;
    private String seleccion;

    @PostConstruct
    public void init() {
        categorias = new ArrayList<SelectItem>();
        SelectItemGroup cardiologia = new SelectItemGroup("Telecardiología");
        SelectItemGroup dermatologia = new SelectItemGroup("Teledermatología");
        SelectItemGroup oftanmologia = new SelectItemGroup("Teleoftanmología");
        SelectItemGroup radiologia = new SelectItemGroup("Teleradiología");

        SelectItem opcion1 = new SelectItem("Jorge Diaz","Jorge Diaz");
        SelectItem opcion2 = new SelectItem("Juan Robles","Juan Robles");
        SelectItem opcion3 = new SelectItem("Laura Perez","Laura Perez");
        SelectItem opcion4 = new SelectItem("Lina Cavañas","Lina Cavañas");

        SelectItem opcion5 = new SelectItem("Paula Ariza","Paula Ariza");
        SelectItem opcion6 = new SelectItem("Juan Torres","Juan Torres");
        SelectItem opcion7 = new SelectItem("Paola Rogríguez","Paola Rogríguez");
        SelectItem opcion8 = new SelectItem("Luis Nuñez","Luis Nuñez");

        SelectItem opcion9 = new SelectItem("Pablo Ruiz","Pablo Ruiz");
        SelectItem opcion10 = new SelectItem("Manuel Rojas","Manuel Rojas");
        SelectItem opcion11 = new SelectItem("Juana Castaño","Juana Castaño");
        SelectItem opcion12 = new SelectItem("Manuela Robles","Manuela Robles");

        SelectItem opcion13 = new SelectItem("Manuel Martinez","Manuel Martinez");
        SelectItem opcion14 = new SelectItem("Paola Mendez","Paola Mendez");
        SelectItem opcion15 = new SelectItem("Daniela Callejas","Daniela Callejas");
        SelectItem opcion16 = new SelectItem("Lorena Martinez","Lorena Martinez");

        cardiologia.setSelectItems(new SelectItem[]{opcion1, opcion2, opcion3, opcion4});
        dermatologia.setSelectItems(new SelectItem[]{opcion5, opcion6, opcion7, opcion8});
        oftanmologia.setSelectItems(new SelectItem[]{opcion9, opcion10, opcion11, opcion12});
        radiologia.setSelectItems(new SelectItem[]{opcion13, opcion14, opcion15, opcion16});

        categorias.add(cardiologia);
        categorias.add(dermatologia);
        categorias.add(oftanmologia);
        categorias.add(radiologia);
    }

    public List<SelectItem> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<SelectItem> categorias) {
        this.categorias = categorias;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }
}
