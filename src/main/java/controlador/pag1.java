/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 * @author Wilson Rodriguez
 * @author Jhony Rojas
 */
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
/**
 * Controlador de la vista pagina1
 */
@ManagedBean
@SessionScoped
/**
 * en esta clase se valida por medio de anotaciones
 */
public class pag1 {
    /**
     * Variables con sus respectivas anotaciones
     */
    @NotNull(message = "Name can't be empty") @Size(min = 1,max = 20)
    private String nombre;
    @Size(min=4,max=10)
    private String usuario;
    @Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    private String correo;
    @Min(10) @Max(20)
    private String edad;
    @Past
    private Date fecha;
    @Pattern(regexp = "^[-+]?\\d+$")
    private String moneda;
/**
 * Getters y setters de las variables del controlador
 * @return 
 */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEdad() {
        return edad;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
