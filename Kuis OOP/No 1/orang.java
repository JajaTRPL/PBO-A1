public abstract class orang {
    private String nama;
    private String tanggalLahir;

    public static enum JENIS_KELAMIN {
        LAKI_LAKI,
        PEREMPUAN
    }

    private JENIS_KELAMIN jenisKelamin;

    protected orang(String nama, String tanggalLahir, JENIS_KELAMIN jenisKelamin) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public JENIS_KELAMIN getJenisKelamin() {
        return jenisKelamin;
    }
}


