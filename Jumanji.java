package desafios;
import java.util.Random;
import java.util.Scanner;

class Jumangi {
    public static void main(String [] args) {
        int respI = 0,resp2=0, total2=0, total3=0, contador = 1, resp1 = 0, resp3=0, total = 0, casilla1 = 0, casilla2 = 0, casilla3 = 0;
        Scanner intro = new Scanner(System.in);
        do{
            System.out.println("Estan listos para iniciar la partida (1.Si/2.No)");
            respI = intro.nextInt();
        }while(respI != 1);
        do{
            do{
              System.out.println("Turno nº"+contador);
              System.out.println("J1: ¿Estas listo?(1.Si/2.No)");
              resp1 = intro.nextInt();
              if((resp1>1)||(resp1<=2)){
                  System.out.println("J1: Tomate tu tiempo.");
              }else if((resp1!=1) || (resp1!=2)){
                  System.out.println("Respuesta no valida, ingresa nuevamente");
                  }
              }while(resp1!=1);
              Random aleatorio = new Random();
              int d1j1 = 1 + aleatorio.nextInt(6);
              Random aleatorio2 = new Random();
              int d2j1 = 1 + aleatorio2.nextInt(6);
              total = d1j1+ d2j1;
              System.out.println("Dado1: "+d1j1+" / Dado2: " + d2j1 + " / Total: " + total);
              casilla1 = casilla1+total;
            switch(casilla1){
                case 1 :System.out.println("Esto no deberia ocurrir... rompiste el juego!!!");break;
                case 2 : System.out.println("J1 : Has caido en una casilla impar, retrocederas a la casilla prima mas cercana, pero por ser 2 el primo mas pequeño concervaras tu lugar");break;
                case 3 : casilla1 = casilla1 - 1;
                    System.out.println("J1 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 4 : casilla1 = casilla1 + 2;
                    System.out.println("J1: Has caido en una casilla par, avanzas 2 casilla");break;
                case 5 : casilla1 = casilla1 - 2;
                    System.out.println("J1 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 6 : casilla1 = casilla1 + 2;
                    System.out.println("J1: Has caido en una casilla par, avanzas 2 casilla");break;
                case 7 : casilla1 = casilla1 - 2;
                    System.out.println("J1 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 8 : casilla1 = casilla1 + 2;
                    System.out.println("J1: Has caido en una casilla par, avanzas 2 casilla");break;
                case 9 : casilla1 = casilla1 - 1;
                    System.out.println("J1 : Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 10 : casilla1 = casilla1 + 5;
                    System.out.println("J1 : Has caido en una multiplo de 10, avanzas 5 casillas");break;
                case 11 : casilla1 = casilla1 - 4;
                    System.out.println("J1 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 12 : casilla1 = casilla1 + 2;
                    System.out.println("J11: Has caido en una casilla par, avanzas 2 casilla");break;
                case 13 : casilla1 = 0;
                    System.out.println("Has caido en el 13, vuelves al inicio...");break;
                case 14 : casilla1 = casilla1 + 2;
                    System.out.println("J1: Has caido en una casilla par, avanzas 2 casilla");break;
                case 15 : casilla1 = casilla1 - 1;
                    System.out.println("J1 : Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 16 : casilla1 = casilla1 + 2;
                    System.out.println("J1: Has caido en una casilla par, avanzas 2 casilla");break;
                case 17 : casilla1 = casilla1 - 6;
                    System.out.println("J1 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 18 : casilla1 = casilla1 + 2;
                    System.out.println("J1: Has caido en una casilla par, avanzas 2 casilla");break;
                case 19 : casilla1 = casilla1 - 2;
                    System.out.println("J1 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 20 : casilla1 = casilla1 + 5;
                    System.out.println("J1 : Has caido en una multiplo de 10, avanzas 5 casillas");break;
                case 21 : casilla1 = casilla1 - 1;
                    System.out.println("J1 : Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 22 : casilla1 = casilla1 + 2;
                    System.out.println("J1: Has caido en una casilla par, avanzas 2 casilla");break;
                case 23 : casilla1 = casilla1 - 4;
                    System.out.println("J1 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 24 : casilla1 = casilla1 + 2;
                    System.out.println("J1: Has caido en una casilla par, avanzas 2 casilla");break;
                case 25 : casilla1 = casilla1 - 1;
                    System.out.println("J1 : Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 26 : casilla1 = casilla1 + 2;
                    System.out.println("J1: Has caido en una casilla par, avanzas 2 casilla");break;
                case 27 : System.out.println("J1: Has ganado, ¡¡¡Felicidades!!!");break;
            }
            System.out.println("J : Has terminado en la casilla numero: "+casilla1);
            
            do{
              System.out.println("Turno nº"+contador);
              System.out.println("J2: ¿Estas listo?(1.Si/2.No)");
              resp2 = intro.nextInt();
              if((resp2>1)||(resp2<=2)){
                  System.out.println("J2: Tomate tu tiempo.");
              }else if((resp2!=1) || (resp2!=2)){
                  System.out.println("Respuesta no valida, ingresa nuevamente");
                  }
              }while(resp2!=1);
              Random aleatorio3 = new Random();
              int d1j2 = 1 + aleatorio3.nextInt(6);
              Random aleatorio4 = new Random();
              int d2j2 = 1 + aleatorio4.nextInt(6);
              total2 = d1j2+ d2j2;
              System.out.println("Dado1: "+d1j2+" / Dado2: " + d2j2 + " / Total: " + total2);
              casilla2 = casilla2+total2;
            switch(casilla2){
                case 1 :System.out.println("Esto no deberia ocurrir... rompiste el juego!!!");break;
                case 2 : System.out.println("J2 : Has caido en una casilla impar, retrocederas a la casilla prima mas cercana, pero por ser 2 el primo mas pequeño concervaras tu lugar");break;
                case 3 : casilla2 = casilla2 - 1;
                    System.out.println("J2 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 4 : casilla2 = casilla2 + 2;
                    System.out.println("J2: Has caido en una casilla par, avanzas 2 casilla");break;
                case 5 : casilla2 = casilla2 - 2;
                    System.out.println("J2 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 6 : casilla2 = casilla2 + 2;
                    System.out.println("J2: Has caido en una casilla par, avanzas 2 casilla");break;
                case 7 : casilla2 = casilla2 - 2;
                    System.out.println("J2 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 8 : casilla2 = casilla2 + 2;
                    System.out.println("J2: Has caido en una casilla par, avanzas 2 casilla");break;
                case 9 : casilla2 = casilla2 - 1;
                    System.out.println("J2 : Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 10 : casilla2 = casilla2 + 5;
                    System.out.println("J2 : Has caido en una multiplo de 10, avanzas 5 casillas");break;
                case 11 : casilla2 = casilla2 - 4;
                    System.out.println("J2 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 12 : casilla2 = casilla2 + 2;
                    System.out.println("J2: Has caido en una casilla par, avanzas 2 casilla");break;
                case 13 : casilla2 = 0;
                    System.out.println("Has caido en el 13, vuelves al inicio...");break;
                case 14 : casilla2 = casilla2 + 2;
                    System.out.println("J2: Has caido en una casilla par, avanzas 2 casilla");break;
                case 15 : casilla2 = casilla2 - 1;
                    System.out.println("J : Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 16 : casilla2 = casilla2 + 2;
                    System.out.println("J2: Has caido en una casilla par, avanzas 2 casilla");break;
                case 17 : casilla2 = casilla2 - 6;
                    System.out.println("J2 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 18 : casilla2 = casilla2 + 2;
                    System.out.println("J2: Has caido en una casilla par, avanzas 2 casilla");break;
                case 19 : casilla2 = casilla2 - 2;
                    System.out.println("J2 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 20 : casilla2 = casilla2 + 5;
                    System.out.println("J2 : Has caido en una multiplo de 10, avanzas 5 casillas");break;
                case 21 : casilla2 = casilla2 - 1;
                    System.out.println("J2 : Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 22 : casilla2 = casilla2 + 2;
                    System.out.println("J2: Has caido en una casilla par, avanzas 2 casilla");break;
                case 23 : casilla2 = casilla2 - 4;
                    System.out.println("J2 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 24 : casilla2 = casilla2 + 2;
                    System.out.println("J2: Has caido en una casilla par, avanzas 2 casilla");break;
                case 25 : casilla2 = casilla2 - 1;
                    System.out.println("J2 : Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 26 : casilla2 = casilla2 + 2;
                    System.out.println("J2: Has caido en una casilla par, avanzas 2 casilla");break;
                case 27 : System.out.println("j: Has ganado, ¡¡¡Felicidades!!!");break;
            }
            System.out.println("J : Has terminado en la casilla numero: "+casilla2);
            
            do{
              System.out.println("Turno nº"+contador);
              System.out.println("J3: ¿Estas listo?(1.Si/2.No)");
              resp3 = intro.nextInt();
              if((resp3>1)||(resp3<=2)){
                  System.out.println("J3: Tomate tu tiempo.");
              }else if((resp3!=1) || (resp3!=2)){
                  System.out.println("Respuesta no valida, ingresa nuevamente");
                  }
              }while(resp3!=1);
              Random aleatorio5 = new Random();
              int d1j3 = 1 + aleatorio5.nextInt(6);
              Random aleatorio6 = new Random();
              int d2j3 = 1 + aleatorio6.nextInt(6);
              total3 = d1j3+ d2j3;
              System.out.println("Dado1: "+d1j3+" / Dado2: " + d2j3 + " / Total: " + total3);
              casilla3 = casilla3+total3;
            switch(casilla3){
                case 1 :System.out.println("Esto no deberia ocurrir... rompiste el juego!!!");break;
                case 2 : System.out.println("J3 : Has caido en una casilla impar, retrocederas a la casilla prima mas cercana, pero por ser 2 el primo mas pequeño concervaras tu lugar");break;
                case 3 : casilla3 = casilla3 - 1;
                    System.out.println("J3 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 4 : casilla3 = casilla3 + 2;
                    System.out.println("J3: Has caido en una casilla par, avanzas 2 casilla");break;
                case 5 : casilla3 = casilla3 - 2;
                    System.out.println("J3 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 6 : casilla3 = casilla3 + 2;
                    System.out.println("J3: Has caido en una casilla par, avanzas 2 casilla");break;
                case 7 : casilla3 = casilla3 - 2;
                    System.out.println("J3 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 8 : casilla3 = casilla3 + 2;
                    System.out.println("J3: Has caido en una casilla par, avanzas 2 casilla");break;
                case 9 : casilla3 = casilla3 - 1;
                    System.out.println("J3 : Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 10 : casilla3 = casilla3 + 5;
                    System.out.println("J3 : Has caido en una multiplo de 10, avanzas 5 casillas");break;
                case 11 : casilla3 = casilla3 - 4;
                    System.out.println("J3 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 12 : casilla3 = casilla3 + 2;
                    System.out.println("J3: Has caido en una casilla par, avanzas 2 casilla");break;
                case 13 : casilla3 = 0;
                    System.out.println("Has caido en el 13, vuelves al inicio...");break;
                case 14 : casilla3 = casilla3 + 2;
                    System.out.println("J3: Has caido en una casilla par, avanzas 2 casilla");break;
                case 15 : casilla3 = casilla3 - 1;
                    System.out.println("J3 : Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 16 : casilla3 = casilla3 + 2;
                    System.out.println("J3: Has caido en una casilla par, avanzas 2 casilla");break;
                case 17 : casilla3 = casilla3 - 6;
                    System.out.println("J3 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 18 : casilla3 = casilla3 + 2;
                    System.out.println("J3: Has caido en una casilla par, avanzas 2 casilla");break;
                case 19 : casilla3 = casilla3 - 2;
                    System.out.println("J3 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 20 : casilla3 = casilla3 + 5;
                    System.out.println("J3 : Has caido en una multiplo de 10, avanzas 5 casillas");break;
                case 21 : casilla3 = casilla3 - 1;
                    System.out.println("J3 : Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 22 : casilla3 = casilla3 + 2;
                    System.out.println("J3: Has caido en una casilla par, avanzas 2 casilla");break;
                case 23 : casilla3 = casilla3 - 4;
                    System.out.println("J3 : Has caido en una casilla de numero primo, retrocederas al numero primo mas cercano");break;
                case 24 : casilla3 = casilla3 + 2;
                    System.out.println("J3: Has caido en una casilla par, avanzas 2 casilla");break;
                case 25 : casilla3 = casilla3 - 1;
                    System.out.println("J3: Has caido en una casilla impar, retrocedes 1 casilla");break;
                case 26 : casilla3 = casilla3 + 2;
                    System.out.println("J3: Has caido en una casilla par, avanzas 2 casilla");break;
                case 27 : System.out.println("J3: Has ganado, ¡¡¡Felicidades!!!");break;
            }
            System.out.println("J3 : Has terminado en la casilla numero: "+casilla3);
            }while((casilla1 < 27)||(casilla2 < 27)||(casilla3 < 27));
        
        }
}