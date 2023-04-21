public class Empleado1 {
    String nombre;
    String apellidoPaterno;
    double salarioMensual;
    //Constructor
    public Empleado1(){
    }
    public Empleado1(String nombre, String apellidoPaterno, double salarioMensual) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salarioMensual = salarioMensual;
    }
    //Metodos
    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setSalarioMensual(double salarioMensual){
        if(salarioMensual<0){
            salarioMensual=0;
        }
        this.salarioMensual=salarioMensual;
    }
    //Getter
    public String getNombre(){
        return nombre;
    }
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    public double getSalarioMensual(){
        return salarioMensual;
    }
}

