/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalechera;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class principal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto pro = new Producto();
        PersonaNatural per = new PersonaNatural();
        PersonaJuridica person= new PersonaJuridica();
        int op;
        Date fecha = new Date();
        int opproducto;
        int opc;
        int oppcioproducto;
        double costotota;
        System.out.println("BIENVENIDO  A LA LECHERA");
        System.out.println(fecha);
        do {
            System.out.println("opcion 1: ingresar producto");
            System.out.println("opcion 2: atender al publico");
            System.out.println("opcion 3: salir");
            op = sc.nextInt();
            if (op == 1) {
                do {
                    System.out.println("seleccione una opcion");
                    System.out.println("opcion 1: leche");
                    System.out.println("opcion 2: queso");
                    System.out.println("opcion 3: mantequilla");
                    System.out.println("opcion 4: volver");
                    opproducto = sc.nextInt();
                    switch (opproducto) {
                        case 1:
                            pro.llenarleche();
                            break;
                        case 2:
                            pro.llenarqueso();
                            break;
                        case 3:
                            pro.llenarmantequilla();
                            break;
                        case 4:
                            break;
                    }
                } while (opproducto != 4);
            } else if (op == 2) {
                do{
                    System.out.println("selecciona que tipo de cliente se va a atender:");
                    System.out.println("OPCION 1: cliente natural");
                    System.out.println("OPCION 2: cliente juridica");
                    System.out.println("OPCION 3: volver");
                    opc = sc.nextInt();
                    if (opc == 1) {
                        per.llenar();
                        do{
                        System.out.println("opcion 1: leche");
                        System.out.println("opcion 2: queso");
                        System.out.println("opcion 3: mantequilla");
                        System.out.println("opcion 4: volver");
                        oppcioproducto = sc.nextInt();
                        switch (oppcioproducto){
                            case 1:
                                System.out.println(pro.mostrarDatosdeLeche());
                                pro.venderleche();
                                break;
                            case 2:
                                System.out.println(pro.mostrarDatosdeQueso());
                                pro.venderqueso();
                                break;
                            case 3:
                                System.out.println(pro.mostrarDatosdeMantequilla());
                                pro.vendermantequilla();
                                break;
                            case 4:
                                break;
                        }
                        }while (oppcioproducto!=4);
//                        per.llenar();
//                        System.out.println(per.mostrar());
                        pro.venderleche();
                    } else if (opc == 2) {
                        person.llenar();
                        do{
                        System.out.println("opcion 1: leche");
                        System.out.println("opcion 2: queso");
                        System.out.println("opcion 3: mantequilla");
                        System.out.println("opcion 4: volver");
                        oppcioproducto = sc.nextInt();
                        switch (oppcioproducto){
                            case 1:
                                System.out.println(pro.mostrarDatosdeLeche());
                                pro.venderleche();
                                break;
                            case 2:
                                System.out.println(pro.mostrarDatosdeQueso());
                                pro.venderqueso();
                                break;
                            case 3:
                                System.out.println(pro.mostrarDatosdeMantequilla());
                                pro.vendermantequilla();
                                break;
                            case 4:
                                break;
                        }
                        }while (oppcioproducto!=4);
                        
                    } else {
                        System.out.println("opcion incorrecta");
                        
                    }
                }while (opc!=3);
            } else {
                System.out.println("muchas gracias, vuelva pronto =)");
            }
        } while (op!=3);
    }
}


