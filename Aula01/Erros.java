public class Erros {
  public static void main() {
  System.out.println("\"Erros.java:1: error: class, interface, annotation type, enum, record, method or field expected public Class erros\"");
  System.out.println("Erro acusado acima, se refere ao \"Class\" colocado com letra maíuscula \n");
  
  System.out.println("\"Erros.java:3: error: ';' expected    System.out.println()\"");
  System.out.println("Erro acusado acima, se refere a ausência do ponto e virgula; \n");
  
  System.out.println("\"Erros.java:1: error: class erros is public, should be declared in a file named erros.java public class erros {  ^1 error\"");
  System.out.println("Erro acusado acima, se refere ao arquivo está nomeado de Erros.java e na class estar erros; \n");
  
  }
}