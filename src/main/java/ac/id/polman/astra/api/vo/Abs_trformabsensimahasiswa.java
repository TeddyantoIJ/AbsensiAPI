package ac.id.polman.astra.api.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Abs_trformabsensimahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fam_id;
    private Integer fma_id;
    private String fam_alamat_tinggal;
    private String fam_alamat_posisi;
    private String fam_is_astra;
    private String fam_is_astra_desc;
    private String fam_no_hp_lain;
    private String fam_profesi_family;
    private String fam_luarnegeri_family;
    private String fam_luarnegeri_desc;
    private String fam_sehat_self;
    private String fam_sehat_self_desc;
    private String fam_sehat_family;
    private String fam_sehat_family_desc;
    private String fam_covid_self;
    private String fam_covid_self_desc;
    private String fam_covid_around;
    private String fam_covid_around_desc;
    private String fam_riwayat_penyakit;
    private String fam_is_ojt;
    private String fam_is_ojt_alamat;
    private String fam_is_ojt_desc;
    private String fam_is_kendaraan_umum;
    private String fam_is_kendaraan_umum_desc;
    private String fam_rumah_sakit;
    private String fam_rumah_sakit_desc;
    private String fam_status;
    private String fam_created_by;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime fam_created_date;
    private String fam_modif_by;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime fam_modif_date;

    public Integer getFam_id() {
        return fam_id;
    }

    public void setFam_id(Integer fam_id) {
        this.fam_id = fam_id;
    }

    public Integer getFma_id() {
        return fma_id;
    }

    public void setFma_id(Integer fma_id) {
        this.fma_id = fma_id;
    }

    public String getFam_alamat_tinggal() {
        return fam_alamat_tinggal;
    }

    public void setFam_alamat_tinggal(String fam_alamat_tinggal) {
        this.fam_alamat_tinggal = fam_alamat_tinggal;
    }

    public String getFam_alamat_posisi() {
        return fam_alamat_posisi;
    }

    public void setFam_alamat_posisi(String fam_alamat_posisi) {
        this.fam_alamat_posisi = fam_alamat_posisi;
    }

    public String getFam_is_astra() {
        return fam_is_astra;
    }

    public void setFam_is_astra(String fam_is_astra) {
        this.fam_is_astra = fam_is_astra;
    }

    public String getFam_is_astra_desc() {
        return fam_is_astra_desc;
    }

    public void setFam_is_astra_desc(String fam_is_astra_desc) {
        this.fam_is_astra_desc = fam_is_astra_desc;
    }

    public String getFam_no_hp_lain() {
        return fam_no_hp_lain;
    }

    public void setFam_no_hp_lain(String fam_no_hp_lain) {
        this.fam_no_hp_lain = fam_no_hp_lain;
    }

    public String getFam_profesi_family() {
        return fam_profesi_family;
    }

    public void setFam_profesi_family(String fam_profesi_family) {
        this.fam_profesi_family = fam_profesi_family;
    }

    public String getFam_luarnegeri_family() {
        return fam_luarnegeri_family;
    }

    public void setFam_luarnegeri_family(String fam_luarnegeri_family) {
        this.fam_luarnegeri_family = fam_luarnegeri_family;
    }

    public String getFam_luarnegeri_desc() {
        return fam_luarnegeri_desc;
    }

    public void setFam_luarnegeri_desc(String fam_luarnegeri_desc) {
        this.fam_luarnegeri_desc = fam_luarnegeri_desc;
    }

    public String getFam_sehat_self() {
        return fam_sehat_self;
    }

    public void setFam_sehat_self(String fam_sehat_self) {
        this.fam_sehat_self = fam_sehat_self;
    }

    public String getFam_sehat_self_desc() {
        return fam_sehat_self_desc;
    }

    public void setFam_sehat_self_desc(String fam_sehat_self_desc) {
        this.fam_sehat_self_desc = fam_sehat_self_desc;
    }

    public String getFam_sehat_family() {
        return fam_sehat_family;
    }

    public void setFam_sehat_family(String fam_sehat_family) {
        this.fam_sehat_family = fam_sehat_family;
    }

    public String getFam_sehat_family_desc() {
        return fam_sehat_family_desc;
    }

    public void setFam_sehat_family_desc(String fam_sehat_family_desc) {
        this.fam_sehat_family_desc = fam_sehat_family_desc;
    }

    public String getFam_covid_self() {
        return fam_covid_self;
    }

    public void setFam_covid_self(String fam_covid_self) {
        this.fam_covid_self = fam_covid_self;
    }

    public String getFam_covid_self_desc() {
        return fam_covid_self_desc;
    }

    public void setFam_covid_self_desc(String fam_covid_self_desc) {
        this.fam_covid_self_desc = fam_covid_self_desc;
    }

    public String getFam_covid_around() {
        return fam_covid_around;
    }

    public void setFam_covid_around(String fam_covid_around) {
        this.fam_covid_around = fam_covid_around;
    }

    public String getFam_covid_around_desc() {
        return fam_covid_around_desc;
    }

    public void setFam_covid_around_desc(String fam_covid_around_desc) {
        this.fam_covid_around_desc = fam_covid_around_desc;
    }

    public String getFam_riwayat_penyakit() {
        return fam_riwayat_penyakit;
    }

    public void setFam_riwayat_penyakit(String fam_riwayat_penyakit) {
        this.fam_riwayat_penyakit = fam_riwayat_penyakit;
    }

    public String getFam_is_ojt() {
        return fam_is_ojt;
    }

    public void setFam_is_ojt(String fam_is_ojt) {
        this.fam_is_ojt = fam_is_ojt;
    }

    public String getFam_is_ojt_alamat() {
        return fam_is_ojt_alamat;
    }

    public void setFam_is_ojt_alamat(String fam_is_ojt_alamat) {
        this.fam_is_ojt_alamat = fam_is_ojt_alamat;
    }

    public String getFam_is_ojt_desc() {
        return fam_is_ojt_desc;
    }

    public void setFam_is_ojt_desc(String fam_is_ojt_desc) {
        this.fam_is_ojt_desc = fam_is_ojt_desc;
    }

    public String getFam_is_kendaraan_umum() {
        return fam_is_kendaraan_umum;
    }

    public void setFam_is_kendaraan_umum(String fam_is_kendaraan_umum) {
        this.fam_is_kendaraan_umum = fam_is_kendaraan_umum;
    }

    public String getFam_is_kendaraan_umum_desc() {
        return fam_is_kendaraan_umum_desc;
    }

    public void setFam_is_kendaraan_umum_desc(String fam_is_kendaraan_umum_desc) {
        this.fam_is_kendaraan_umum_desc = fam_is_kendaraan_umum_desc;
    }

    public String getFam_rumah_sakit() {
        return fam_rumah_sakit;
    }

    public void setFam_rumah_sakit(String fam_rumah_sakit) {
        this.fam_rumah_sakit = fam_rumah_sakit;
    }

    public String getFam_rumah_sakit_desc() {
        return fam_rumah_sakit_desc;
    }

    public void setFam_rumah_sakit_desc(String fam_rumah_sakit_desc) {
        this.fam_rumah_sakit_desc = fam_rumah_sakit_desc;
    }

    public String getFam_status() {
        return fam_status;
    }

    public void setFam_status(String fam_status) {
        this.fam_status = fam_status;
    }

    public String getFam_created_by() {
        return fam_created_by;
    }

    public void setFam_created_by(String fam_created_by) {
        this.fam_created_by = fam_created_by;
    }

    public LocalDateTime getFam_created_date() {
        return fam_created_date;
    }

    public void setFam_created_date(LocalDateTime fam_created_date) {
        this.fam_created_date = fam_created_date;
    }

    public String getFam_modif_by() {
        return fam_modif_by;
    }

    public void setFam_modif_by(String fam_modif_by) {
        this.fam_modif_by = fam_modif_by;
    }

    public LocalDateTime getFam_modif_date() {
        return fam_modif_date;
    }

    public void setFam_modif_date(LocalDateTime fam_modif_date) {
        this.fam_modif_date = fam_modif_date;
    }
}
