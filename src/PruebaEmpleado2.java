import java.util.Scanner;

public class PruebaEmpleado2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Empleado1 e2 = new Empleado1();

        String nombre;
        String apellidoPaterno;
        double salarioMensual;

        System.out.println("SALARIO EMPLEADOS");

        System.out.println("Ingrese el nombre del empleado: ");
        nombre=sc.next();
        e2.setNombre(nombre);

        System.out.println("Ingrese el apellido paterno");
        apellidoPaterno=sc.next();
        e2.setApellidoPaterno(apellidoPaterno);

        System.out.println("Ingrese el salario mensual");
        salarioMensual= Double.parseDouble(sc.next());
        e2.setSalarioMensual(salarioMensual);

        System.out.println("El nombre del empleado es: "+ e2.getNombre());
        System.out.println("El apellido paterno del empleado es: "+ e2.getApellidoPaterno());
        System.out.println("El salario anual del empleado es: "+ e2.getSalarioMensual()*12);

        System.out.println("El empleado tiene un aumento del 10%");
        e2.setSalarioMensual(e2.getSalarioMensual()*0.1+ e2.getSalarioMensual());
        System.out.println("El salario anual final del empleado es de: $"+ e2.getSalarioMensual()*12);

        Empleado1 e4;

        System.out.println("Ingrese el nombre del empleado: ");
        nombre=sc.next();

        System.out.println("Ingrese el apellido paterno");
        apellidoPaterno=sc.next();

        System.out.println("Ingrese el salario mensual");
        salarioMensual= Double.parseDouble(sc.next());

        e4 = new Empleado1(nombre, apellidoPaterno, salarioMensual);

        System.out.println("El nombre del empleado es: "+e4.getNombre());
        System.out.println("El apellido paterno del empleado es: "+e4.getApellidoPaterno());
        System.out.println("El salario anual del empleado es: "+ e4.getSalarioMensual()*12);

        System.out.println("El empleado tiene un aumento del 10%");
        e4.setSalarioMensual(e4.getSalarioMensual()*0.1+ e4.getSalarioMensual());
        System.out.println("El salario anual final del empleado es de: $"+e4.getSalarioMensual()*12);
    }

}

