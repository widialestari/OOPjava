import javax.swing.JOptionPane;

public class FinallyExample {
    public static void main(String[] args) {
        try{
        int panjang1 = Integer.parseInt
        (JOptionPane.showInputDialog("Masukkan nilai panjang 1"));
        int lebar1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai lebar 1"));
        int panjang2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai panjang 2"));
        int lebar2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai lebar 2"));
        
        int luas1 = panjang1*lebar1;
        int luas2 = panjang2*lebar2;
        
        }
        catch(Exception ex){
            System.err.println("Input harus berupa angka");
        }
        finally{
            System.out.println("Terimakasih telah menjalankan program");
        }
    }
}
