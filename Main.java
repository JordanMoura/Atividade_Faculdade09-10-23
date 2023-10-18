import java.util.Scanner; 
  class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int tamanho;


    /////
    System.out.println("---------Quadrado---------\n");
    System.out.println("Digite o tamanho do quadrado desejado:");

    tamanho = ler.nextInt();


    for(int laco2 =1 ; laco2 <= tamanho && laco2 <= 10; laco2++ ){

      System.out.println("");

    for(int laco =1; laco <= tamanho && laco <= 10; laco++){
      System.out.print("* ");
    }}

    /////
    System.out.println("\n\n------Escada Decrescente-------\n");

    System.out.println("Digite o tamanho da escada crescente desejado:");

    tamanho = ler.nextInt();


    for(int laco2 =1 ; laco2 <= tamanho && laco2 <= 10; laco2++ ){

      System.out.println("");

    for(int laco =1; laco <= laco2; laco++){
      System.out.print("* ");
    }}

    /////
    System.out.println("\n\n-------Escada Crescente-----\n");

    System.out.println("Digite o tamanho da escada decrescente desejado:");

    tamanho = ler.nextInt();


    for(int laco2 = tamanho ; laco2 <= tamanho && laco2 >= 1; laco2-- ){

      System.out.println("");



    for(int laco =1; laco <= laco2 && laco <= 10; laco++){
      System.out.print("* ");
    }}




    

    

    

    






















  
  }}