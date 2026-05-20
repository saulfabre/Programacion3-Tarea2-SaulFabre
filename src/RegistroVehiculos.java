import java.util.ArrayList;

public class RegistroVehiculos {
    
    ArrayList <Vehiculo> vehiculos = new ArrayList<>();

    //1. Registrar vehiculo
    public void registrarVehiculo(String placa, String marca, String modelo, int anio, String color, double precio) {

        Vehiculo vehiculo = new Vehiculo(placa, marca, modelo, anio, color, precio);
        vehiculos.add(vehiculo);
    }

    //2. Mostrar vehiculos
    public void mostrarVehiculos() {

        for (Vehiculo vehiculo : vehiculos) {
            mostrarVehiculo(vehiculo);
        }
    }

    //3. Buscar vehiculo por placa
    public void buscarVehiculoPlaca(String placa) {

        Vehiculo vehiculo = buscarVehiculo(placa);

        if (vehiculo != null) {
            System.out.println("Vehiculo : encontrado");
            mostrarVehiculo(vehiculo);
        }

        else {
            System.out.println("Vehiculo : no encontrado ");
        }
    }

    //4. Mostrar vehiculos por marca
    public void mostrarVehiculosMarca(String marca) {

        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getMarca() == marca) {
                mostrarVehiculo(vehiculo);
            }
        }
        System.out.println("Vehiculo : no hay vehiculos " + marca);       
    }

    public void mostrarVehiculo(Vehiculo vehiculo) {

        System.out.println("================================");
        System.out.println("   VEHICULO : " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        System.out.println("================================");

        System.out.println("= Placa : " + vehiculo.getPlaca() + " =");
        System.out.println("= Marca : " + vehiculo.getMarca() + " =");
        System.out.println("= Modelo : " + vehiculo.getModelo() + " =");
        System.out.println("= Año : " + vehiculo.getAnio() + " =");
        System.out.println("= Color : " + vehiculo.getColor() + " =");
        System.out.println("= Precio : " + vehiculo.getPrecio() + " =");
    }


    public Vehiculo buscarVehiculo(String placa) {

        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getPlaca() == placa) {
                return vehiculo;
            }
        }
        return null;
    }
}
