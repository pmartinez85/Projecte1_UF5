package capses;


import java.util.*;


/**
 *
 * @author pedro
 * @param <A>
 */
public class Box<A>
{
//    
//    
//    private ArrayList llista;
//    
//    public Box <A>()
//    {
//        
//        this.llista = new ArrayList<A>();
//    
//    
//        public void add(A item)
//    {
//        this.llista.add(item);
//    }
  
     public static void main(String arg[]) {
         
         
        Scanner ent1 = new Scanner(System.in);
        String text;
        int marca = 0;
        List<Object> llista = new ArrayList<>(); 
        
        
        do{
        System.out.println("Per favor introdueixi l'objecte que vol usar: ");
        text = ent1.nextLine().trim();
        
        if (marca == 0){
        llista.add(text);
        marca = 1;
        System.out.println("La llista conté: " + llista);
        
        }else{System.out.println("Llista Plena");
        break;
        }
        
    
     }while (true);}
    
    
 
    public void esPlena(){
        
//        if (marca == 0){
//            return true;
//            
//        }else{
//            
//        }
            
        
    }
    
    public void obtenir(){
        
    }
    
    public void buidar(){
        
    }
    

    
    
    
    
    
    
    
    
    
    
    
}
