public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double precio;

    public Vehiculo() {

    }

    public Vehiculo(String placa, String marca, String modelo, int anio, String color, double precio) {
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
        setColor(color);
        setPrecio(precio);
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPlaca(String placa) {
        if (placa.isEmpty()) {
            RegistroVehiculos.mostrarValidacionRegistro("Placa", "FORMATO INVALIDO ");
            this.placa = "FORMATO INVALIDO";
        }

        else {
            this.placa = placa.toUpperCase();
        }
    }

    public void setMarca(String marca) {
        if (marca.isEmpty()) {
            RegistroVehiculos.mostrarValidacionRegistro("Marca", "FORMATO INVALIDO ");
            this.marca = "FORMATO INVALIDO";
        }

        else {
            this.marca = marca.toUpperCase();
        }
    }

    public void setModelo(String modelo) {
        if (modelo.isEmpty()) {
            RegistroVehiculos.mostrarValidacionRegistro("Modelo", "FORMATO INVALIDO ");
            this.modelo = "FORMATO INVALIDO";
        }

        else {
            this.modelo = modelo.toUpperCase();
        }
    }

    public void setAnio(int anio) {
        if (anio < 1900 || anio > 2027) {
            RegistroVehiculos.mostrarValidacionRegistro("Año", "FECHA INVALIDA ");
            this.anio = 2000;
        }

        else {
            this.anio = anio;
        }
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            RegistroVehiculos.mostrarValidacionRegistro("Color", "FORMATO INVALIDO ");
            this.color = "FORMATO INVALIDO";
        }

        else {
            this.color = color.toUpperCase();
        }
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }

        else {
            RegistroVehiculos.mostrarValidacionRegistro("Precio", "PRECIOR MENOR A 0 ");
            this.precio = 1;
        }
    }    
}
