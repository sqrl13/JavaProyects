clase pública Cohete {

 // Escribimos el título del programa y llamamos a los métodos que lo estructuran
 public static void principal (String[] args) {
    System.out.println("FIGURA:");
    Sistema.salida.println();
    
    dibuja Triangulo();
    DibujarCuerpo();
    dibuja Triangulo();      
 }
  
 // Metodo que dibuja el triangulo que sirve como punta y cola del cohete
 /* /**\
        //**\\
       ///**\\\
      ////**\\\\
     /////**\\\\\
     
     Se utiliza la siguiente tabla para obtener los patrones:
     
     linea espacios barras
     1 5 1
     2 4 2
     3 3 3
     4 2 4
     5 1 5
 */
 public static void dibujaTriangulo() {
    for(int linea = 1; linea <= 5; linea++) {
    
       // Espacios
       for (int i = 6 - linea; i > 0; i--) {
          Sistema.out.print(" ");
       }
       
       // barra
       for (int i = 0; i < linea; i++) {
          Sistema.out.print("/");
       }
       
       Sistema.out.print("**");
       
       // Contrabarra. Caracter especial
       for (int i = 0; i < linea; i++) {
          Sistema.out.print("\\");
       }
       
       Sistema.salida.println();
    }
 }
 
 // Metodo que agrupa diferentes metodos que constituyen el cuerpo del cohete
 public static void dibujarCuerpo() {
    dibujaLinea();
    dibujaRectanguloArriba();
    dibujaRectanguloAbajo();
    dibujaLinea();
    dibujaRectanguloAbajo();
    dibujaRectanguloArriba();
    dibujaLinea();
 }
 
 // Metodo que dibuja la linea +=*=*=*=*=*=*+
 public static void dibujaLinea() {
    Sistema.out.print("+");
    
    para (int i = 0; i < 6; i++) {
       Sistema.out.print("=*");   
    }
    
    Sistema.out.print("+");
    Sistema.salida.println();
 }
 
 // Metodo que dibuja el rectangulo con triangulos boca arriba.
 // El mismo triangulo se repite 2 veces en horizontal
 /*
 |../\../\..|
 |./\/\../\/\.|
 |/\/\/\/\/\/\|
 
 linea puntos picos puntos
 1 2 1 2
 2 1 2 1
 3 0 3 0        
 */   
 public static void dibujaRectanguloArriba() {
    for(int linea = 1; linea <= 3; linea++) {
    
       Sistema.out.print("|");
       
       // Para repetir 2 veces el mismo triangulo
       para (int i = 0; i < 2; i++) {
       
          // puntos
          para (int j = 0; j < 3 - linea; j++) {
             Sistema.salida.imprimir(".");
          }
          
          // Picos
          for (int j = 0; j < linea; j++) {
             Sistema.out.print("/\\");
          }
          
          // puntos
          para (int j = 0; j < 3 - linea; j++) {
             Sistema.salida.imprimir(".");
          }
          
       }
       
       Sistema.salida.println("|");
    }
 }
 
 // Metodo que dibuja rectangulo con triangulos boca abajo.
 // El mismo triangulo se repite 2 veces en horizontal
 /*
 |\/\/\/\/\/\/|
 |.\/\/..\/\/.|
 |..\/....\/..|
 
 linea puntos picos puntos
 1 0 3 0
 2 1 2 1
 3 2 1 2        
 */   
 public static void dibujaRectanguloAbajo() {
    for(int linea = 1; linea <= 3; linea++) {
    
       Sistema.out.print("|");
       
       para(int i = 1; i <= 2; i++) {
          
          // puntos
          para (int j = 0; j < linea - 1; j++) {
             Sistema.salida.imprimir(".");
          }
          
          // Picos
          for (int j = 0 ; j < 4 - linea; j++) {
             Sistema.out.print("\\/");
          }
          
          //Puntos
          for (int j = 0; j < (línea - 1); j++) {
             Sistema.salida.imprimir(".");
          }
       }
       
       Sistema.out.print("|");
       Sistema.salida.println();
    }
 }
}
