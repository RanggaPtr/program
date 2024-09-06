package p2.percobaan1;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "lalalal";
        mhs1.alamat = "Jl. Vinolla No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        mhs1.nim = 101;
        mhs1.nama = "lilili";
        mhs1.alamat = "Jl. Vinolla No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        mhs1.nim = 101;
        mhs1.nama = "jajajaja";
        mhs1.alamat = "Jl. Vinolla No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
    }
}
