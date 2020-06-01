public final class siswa{
	private String nama;

	private String getNama(){
		return nama;
	}
	
	public void setNama(String nama){
		this.nama=nama;
	}
}

Melakukan inheritance :

public class perempuan extends siswa{
	public static void main(String[] args){
	
	}
}

akan menyebabkan error :
java.lang.VerifyError: Cannot inherit from final class
