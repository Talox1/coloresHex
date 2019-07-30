import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] colores = new String [2];

      for (int i = 0; i < 2; i++){//obtencion de valores rgb
         do{
            System.out.println("Introduzca valor hexadecimal (6 digitos): ");
            colores[i] = sc.next();
            if(colores[i].length() < 6){
               System.out.println("Digitos insuficientes, intente de nuevo por favor...");
            }else if(colores[i].length() > 6){
               System.out.println("Digitos excedidos, intente de nuevo por favor...");
            }
         }while(colores[i].length() != 6);
      }
      System.out.println("RGB: "+getPromColor(colores[0], colores[1]));//llamada a metodo
   }



   public static String getPromColor(String color1, String color2){//obtencion de parametros
      String valueColor = "#";
      String R1,R2,G1,G2,B1,B2;
      int valueR,valueG,valueB;
                                          //descomposicion en binas para sus operaciones
      R1 = color1.substring(0, 2);        //valor en R color1
      G1 = color1.substring(2, 4);        //valor en G color1
      B1 = color1.substring(4, 6);        //valor en B color1
      
      R2 = color2.substring(0, 2);        //valor en R color2  
      G2 = color2.substring(2, 4);        //valor en G color2
      B2 = color2.substring(4, 6);        //valor en B color2
      
      valueR = (Integer.parseInt(R1,16) + Integer.parseInt(R2,16))/2;  //suma y promedio para R
      valueG = (Integer.parseInt(G1,16) + Integer.parseInt(G2,16))/2;  //suma y promedio para G
      valueB = (Integer.parseInt(B1,16) + Integer.parseInt(B2,16))/2;  //suma y promedio para B


      

      System.out.println("R: "+Integer.toHexString(valueR)+"\nG: "+Integer.toHexString(valueG)+"\nB: "+Integer.toHexString(valueB));//conversion a hexadecimal
      return valueColor+""+Integer.toHexString(valueR)+""+Integer.toHexString(valueG)+""+Integer.toHexString(valueB);   //retorno de informacio en hexadecimal
   }
}