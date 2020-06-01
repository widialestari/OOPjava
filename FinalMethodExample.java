public class FinalMethodEx { 
    final void methodFinal() {
        System.out.println("Tidak bisa dilakukan overriding terhadap method ini");
    } 
    
    public static void main(String[] args) 
    { 
    } 
} 
  
class coba extends FinalMethodEx { 
    // akan terjadi error
    void methodFinal() {} 
}
