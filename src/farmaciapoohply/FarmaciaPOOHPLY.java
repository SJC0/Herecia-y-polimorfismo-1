package farmaciapoohply;

import java.util.Scanner;

public class FarmaciaPOOHPLY {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String clave, nombre, diacompra, tipoproducto;
        int cantidad;
        double precio;

        System.out.println("Ingrese clave de producto: ");
        clave = entrada.nextLine();
        System.out.println("Ingrese nombre de producto: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese día de compra: ");
        diacompra = entrada.nextLine();
        System.out.println("Ingrese tipo de producto (Medicamento || Abarrotes)");
        tipoproducto = entrada.nextLine();
        System.out.println("Ingrese cantidad a comprar: ");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el precio individual del producto: ");
        precio = entrada.nextDouble();
        
        precio = precio * cantidad;

        if (tipoproducto.equals("medicamento") || tipoproducto.equals("Medicamento")) {
            Medicamentos medicamentos = new Medicamentos(clave, nombre, diacompra, tipoproducto, cantidad, precio);
            medicamentos.mostrarDatos();
        } else if (tipoproducto.equals("abarrotes") || tipoproducto.equals("Abarrotes")){
            Abarrotes abarrotes = new Abarrotes(clave, nombre, diacompra, tipoproducto, cantidad, precio);
            abarrotes.mostrarDatos();
        }

    }

}
