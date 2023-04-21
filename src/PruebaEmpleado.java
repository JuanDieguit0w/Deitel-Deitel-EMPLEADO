import java.util.Scanner;
public class PruebaEmpleado {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Empleado1 e1 = new Empleado1();

        String nombre;
        String apellidoPaterno;
        double salarioMensual;

        System.out.println("SALARIO EMPLEADOS");

        System.out.println("Ingrese el nombre del empleado: ");
        nombre=sc.next();
        e1.setNombre(nombre);

        System.out.println("Ingrese el apellido paterno");
        apellidoPaterno=sc.next();
        e1.setApellidoPaterno(apellidoPaterno);

        System.out.println("Ingrese el salario mensual");
        salarioMensual= Double.parseDouble(sc.next());
        e1.setSalarioMensual(salarioMensual);

        System.out.println("El nombre del empleado es: "+e1.getNombre());
        System.out.println("El apellido paterno del empleado es: "+e1.getApellidoPaterno());
        System.out.println("El salario anual del empleado es: "+ e1.getSalarioMensual()*12);

        System.out.println("El empleado tiene un aumento del 10%");
        e1.setSalarioMensual(e1.getSalarioMensual()*0.1+ e1.getSalarioMensual());
        System.out.println("El salario anual final del empleado es de: $"+e1.getSalarioMensual()*12);

        Empleado1 e3;

        System.out.println("Ingrese el nombre del empleado: ");
        nombre=sc.next();

        System.out.println("Ingrese el apellido paterno");
        apellidoPaterno=sc.next();

        System.out.println("Ingrese el salario mensual");
        salarioMensual= Double.parseDouble(sc.next());

        e3 = new Empleado1(nombre, apellidoPaterno, salarioMensual);

        System.out.println("El nombre del empleado es: "+e3.getNombre());
        System.out.println("El apellido paterno del empleado es: "+e3.getApellidoPaterno());
        System.out.println("El salario anual del empleado es: "+ e3.getSalarioMensual()*12);

        System.out.println("El empleado tiene un aumento del 10%");
        e3.setSalarioMensual(e3.getSalarioMensual()*0.1+ e3.getSalarioMensual());
        System.out.println("El salario anual final del empleado es de: $"+e3.getSalarioMensual()*12);

    }
}
