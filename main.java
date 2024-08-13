import java.util.Scanner;;
public class main{


public static void main(String[] args) {
    int edad;
    double precio=1000000;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su edad");
    edad = scanner.nextInt();

    if (edad < 2){
        System.out.println("Esta persona no podra viajar debido a que es menor de 2 años");

    } if (edad >=2 && edad <5 ){
        precio=precio-precio;
        System.out.println("El valor de su tiquete es de "+ precio);

    } if(edad >=5 && edad <11){
        precio=(precio/2);
        System.out.println("El valor de su tiquete es de "+ precio);

    }if(edad >=11 && edad <15){
        precio=(precio*0.75);
        System.out.println("El valor de su tiquete es de "+ precio);

} if(edad>=15){
    System.out.println("El valor de su tiquete es de "+ precio);

}
}
}