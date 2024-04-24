import java.util.Scanner;

public class EjercicioExamenFormateado {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el tipo del producto");
    System.out.println("1) Alimentación  2) Electrónica  3) Farmacia  4) Moda");
    int tipoProducto = Integer.parseInt(System.console().readLine());
    int tipoAlimento;
    String nombreProducto;
    double cantidadProducto;
    double precioUnidadProducto;
    double IVA;
    //Para empezar, defino unas cuantas variables que son universales a cada caso
    //del switch.
    switch (tipoProducto) {
      case 1:
        //En el primer caso, voy a plantear un menú que nos muestre el tipo de
        //alimento que ofrece este supermercado. Una vez sea escogido, el programa
        //se encargará de evaluar si el número admitido es válido
        System.out.println("Introduzca el tipo de alimento");
        System.out.println("1) Huevos  2) Leche    3) Pan");
        System.out.println("4) Fruta   5) Verdura  6) Otros");
        double precioTotalAlimento;
        double ivaProductoAlimento;
        double precioTotalAlimentoIVA;
        tipoAlimento = Integer.parseInt(System.console().readLine());
        if ((tipoAlimento >= 1) && (tipoAlimento <= 6)) {
          System.out.println("Introduzca el nombre del producto");
          nombreProducto = System.console().readLine();
          System.out.println("Introduzca la cantidad de productos");
          cantidadProducto = s.nextDouble();
          System.out.println("Introduzca el precio por unidad del producto:");
          precioUnidadProducto = s.nextDouble();
          precioTotalAlimento = (cantidadProducto * precioUnidadProducto);
          System.out.println("Factura");
          System.out.println("---------------------------");
          System.out.println("Artículo:           " + nombreProducto);
          System.out.printf(
            "Precio:             %.2f / unidad\n",
            precioUnidadProducto
          );
          System.out.printf(
            "Cantidad:           %.0f \u20AC\n",
            cantidadProducto
          );
          System.out.printf(
            "Total:              %.2f \u20AC\n",
            precioTotalAlimento
          );
          if ((tipoAlimento >= 1) && (tipoAlimento <= 5)) {
            IVA = 4;
            ivaProductoAlimento = precioTotalAlimento * (IVA / 100);
            precioTotalAlimentoIVA = precioTotalAlimento * (1 + (IVA / 100));
          } else {
            IVA = 10;
            ivaProductoAlimento = precioTotalAlimento * (IVA / 100);
            precioTotalAlimentoIVA = precioTotalAlimento * (1 + (IVA / 100));
          }
          System.out.print("IVA al " + IVA + "%: ");
          System.out.printf("       %.2f\n", ivaProductoAlimento);
          System.out.println("---------------------------");
          System.out.printf(
            "Total con IVA :     %.2f\n",
            precioTotalAlimentoIVA
          );
        } else {
          System.out.println("No hay un tipo de alimento asignado a ese valor");
        }
        break;
      case 2:
        System.out.println("Introduzca el nombre del producto");
        nombreProducto = System.console().readLine();
        System.out.println("Introduzca la cantidad de productos");
        cantidadProducto = s.nextDouble();
        System.out.println("Introduzca el precio por unidad del producto");
        precioUnidadProducto = s.nextDouble();
        double precioTotalElectrónica = precioUnidadProducto * cantidadProducto;
        double descuentoPrecioTotalElectrónica = (precioTotalElectrónica * 0.2);
        double precioTotalElectrónicaDescuento =
          precioTotalElectrónica - descuentoPrecioTotalElectrónica;
        IVA = 21;
        double ivaDelPrecioTotalElectrónica =
          precioTotalElectrónicaDescuento * (IVA);
        double precioTotalElectrónicaIVA =
          precioTotalElectrónicaDescuento + ivaDelPrecioTotalElectrónica;
        System.out.println("Factura");
        System.out.println("---------------------------");
        System.out.println("Artículo:           " + nombreProducto);
        System.out.printf(
          "Precio:             %.2f / unidad\n",
          precioUnidadProducto
        );
        System.out.printf(
          "Cantidad:           %.0f \u20AC\n",
          cantidadProducto
        );
        System.out.printf(
          "Total:              %.2f \u20AC\n",
          precioTotalElectrónica
        );
        System.out.print("Descuento del 20%");
        System.out.printf("   %.2f \u20AC\n", descuentoPrecioTotalElectrónica);
        System.out.printf(
          "Total con descuento %.2f \u20AC\n",
          precioTotalElectrónicaDescuento
        );
        System.out.print("IVA al " + IVA + "%: ");
        System.out.printf("      %.2f\n", ivaDelPrecioTotalElectrónica);
        System.out.println("---------------------------");
        System.out.printf(
          "Total con IVA       %.2f \u20AC\n",
          precioTotalElectrónicaIVA
        );
        break;
      case 3:
        System.out.println("Introduzca el nombre del producto");
        nombreProducto = System.console().readLine();
        System.out.println("Introduzca la cantidad de productos");
        cantidadProducto = s.nextDouble();
        System.out.println("Introduzca el precio por unidad del producto");
        precioUnidadProducto = s.nextDouble();
        double precioTotalFarmacia = precioUnidadProducto * cantidadProducto;
        IVA = 4;
        double ivaDelPrecioTotalFarmacia = precioTotalFarmacia * (IVA / 100);
        double precioTotalFarmaciaIVA = precioTotalFarmacia * (1 + (IVA / 100));
        System.out.println("Factura");
        System.out.println("---------------------------");
        System.out.println("Artículo:           " + nombreProducto);
        System.out.printf(
          "Precio:             %.2f / unidad\n",
          precioUnidadProducto
        );
        System.out.printf(
          "Cantidad:           %.0f \u20AC\n",
          cantidadProducto
        );
        System.out.printf(
          "Total:              %.2f \u20AC\n",
          precioTotalFarmacia
        );
        System.out.print("IVA al " + IVA + "%: ");
        System.out.printf("       %.2f\n", ivaDelPrecioTotalFarmacia);
        System.out.println("---------------------------");
        System.out.printf("Total con IVA :     %.2f\n", precioTotalFarmaciaIVA);
        break;
      case 4:
        System.out.println("Introduzca el nombre del producto");
        nombreProducto = System.console().readLine();
        System.out.println("Introduzca la cantidad de productos");
        int cantidadProductoModa = Integer.parseInt(
          System.console().readLine()
        );
        System.out.println("Introduzca el precio por unidad del producto");
        double precioUnidadProductoModa = s.nextDouble();
        double precioTotalModa = (double) cantidadProductoModa *
        precioUnidadProductoModa;
        System.out.println("Factura");
        System.out.println("---------------------------");
        System.out.println("Artículo:            " + nombreProducto);
        System.out.printf(
          "Precio:              %.2f \u20AC / unidad\n",
          precioUnidadProductoModa
        );
        System.out.printf(
          "Cantidad:            %d \u20AC\n",
          cantidadProductoModa
        );
        System.out.printf(
          "Total:               %.2f \u20AC\n",
          precioTotalModa
        );
        int cantidadProductoModaDescuento =
          (cantidadProductoModa - (cantidadProductoModa / 3));
        double precioProductoModaDescuento = (double) cantidadProductoModaDescuento *
        precioUnidadProductoModa;
        double precioTotalProductoModaDescuento =
          precioTotalModa - precioProductoModaDescuento;
        System.out.printf(
          "Descuento (3x2):     - %.2f \u20AC\n",
          precioTotalProductoModaDescuento
        );
        System.out.printf(
          "Total con descuento: %.2f \u20AC\n",
          precioProductoModaDescuento
        );
        IVA = 21;
        double ivaDelPrecioTotalModa =
          precioProductoModaDescuento * (IVA / 100);
        double precioTotalModaIVA =
          precioProductoModaDescuento * (1 + (IVA / 100));
        System.out.print("IVA al " + IVA + "%: ");
        System.out.printf("       %.2f\n", ivaDelPrecioTotalModa);
        System.out.println("---------------------------");
        System.out.printf("Total con IVA :     %.2f\n", precioTotalModaIVA);
        break;
      default:
        System.out.print(
          "Ese valor no está contemplado para ningún tipo de producto"
        );
        break;
    }
    s.close();
  }
}
