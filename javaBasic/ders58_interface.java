package javaNormal;

interface ogrenci1{
	public void ogrenciNumarasý();
	public void ogrenciAdres();
}

class ogrenciSinif implements ogrenci1{
	public void ogrenciNumarasý() {
		// yapýlacak iþler
	}

	@Override
	public void ogrenciAdres() {
		// TODO Auto-generated method stub
		
	}	
}

public class ders58_interface {

	public static void main(String[] args) {
		// interface normal sýnýf gibi tanýmlanýr
		ogrenciSinif os = new ogrenciSinif();
		os.ogrenciNumarasý();
	}

}
