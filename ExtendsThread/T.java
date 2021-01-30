public class T extends Thread {

  private String name;  
  private static int max;
  private static int tiempo; 

  public T( String name){
    this.name=name; 
  }
 public void run () {
   if (name.equals("Impar")){
      for (int i = 1; i <=max; i+=2){ 
      System.out.println ("Impar: " + i) ;
      try{
        Thread.sleep(tiempo);
      }catch(Exception e){
      }
    }
   }
   if (name.equals("Par")){
    for (int i = 0; i <=max; i+=2){
     if(i!=0){
      System.out.println ("Par: " + i) ;  
      }
     try{
        Thread.sleep(tiempo);
      }catch(Exception e){
        }
   }
   

   }

 }
 public static void main(String[] args) {
     {
      max = Integer.parseInt(System.console().readLine("Digite el numero maximo"));
      tiempo = Integer.parseInt(System.console().readLine("Digite el tiempo de espera"));
      
      
      T t1= new T("Impar"); 
      T t2= new T("Par"); 

      t1.start(); 
      t2.start();
    }
 }
 

}
