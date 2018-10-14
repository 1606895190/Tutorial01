
public class Mahasiswa {
	public String nama;
	public char NPM;
	public int kelas;
	
	public Mahasiswa(String nama, char nPM, int kelas) {
		super();
		this.nama = nama;
		NPM = nPM;
		this.kelas = kelas;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public char getNPM() {
		return NPM;
	}

	public void setNPM(char nPM) {
		NPM = nPM;
	}

	public int getKelas() {
		return kelas;
	}

	public void setKelas(int kelas) {
		this.kelas = kelas;
	}

}
