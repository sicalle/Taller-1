public class T implements Runnable {

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
      
      
      Thread t1= new Thread(new T("Impar")); 
      t1.start(); 

      Thread t2= new Thread(new T("Par"));
      t2.start();
      
      
    }
 }

}
