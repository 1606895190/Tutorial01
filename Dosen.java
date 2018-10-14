
public class Dosen {
	public String nama;
	public char mapel;
	public int kelas;
	public Dosen(String nama, char mapel, int kelas) {
		super();
		this.nama = nama;
		this.mapel = mapel;
		this.kelas = kelas;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public char getMapel() {
		return mapel;
	}
	public void setMapel(char mapel) {
		this.mapel = mapel;
	}
	public int getKelas() {
		return kelas;
	}
	public void setKelas(int kelas) {
		this.kelas = kelas;
	}

}
