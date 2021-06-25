package ac.id.polman.astra.api.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class Abs_trformmahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fma_id;
	private String mhs_id;
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime fma_tanggal;
    private Integer fma_done_langkah_1;
    private Integer fma_done_langkah_2;
    private Integer fma_done_langkah_3;
    private Integer fma_done_langkah_4;
    private Integer fma_done_download;
    private String fma_status;
    private String fma_created_by;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime fma_created_date;
    private String fma_modif_by;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime fma_modif_date;

    public Integer getFma_id() {
        return fma_id;
    }

    public void setFma_id(Integer fma_id) {
        this.fma_id = fma_id;
    }

    public String getMhs_id() {
        return mhs_id;
    }

    public void setMhs_id(String mhs_id) {
        this.mhs_id = mhs_id;
    }

    public LocalDateTime getFma_tanggal() {
        return fma_tanggal;
    }

    public void setFma_tanggal(LocalDateTime fma_tanggal) {
        this.fma_tanggal = fma_tanggal;
    }

    public Integer getFma_done_langkah_1() {
        return fma_done_langkah_1;
    }

    public void setFma_done_langkah_1(Integer fma_done_langkah_1) {
        this.fma_done_langkah_1 = fma_done_langkah_1;
    }

    public Integer getFma_done_langkah_2() {
        return fma_done_langkah_2;
    }

    public void setFma_done_langkah_2(Integer fma_done_langkah_2) {
        this.fma_done_langkah_2 = fma_done_langkah_2;
    }

    public Integer getFma_done_langkah_3() {
        return fma_done_langkah_3;
    }

    public void setFma_done_langkah_3(Integer fma_done_langkah_3) {
        this.fma_done_langkah_3 = fma_done_langkah_3;
    }

    public Integer getFma_done_langkah_4() {
        return fma_done_langkah_4;
    }

    public void setFma_done_langkah_4(Integer fma_done_langkah_4) {
        this.fma_done_langkah_4 = fma_done_langkah_4;
    }

    public Integer getFma_done_download() {
        return fma_done_download;
    }

    public void setFma_done_download(Integer fma_done_download) {
        this.fma_done_download = fma_done_download;
    }

    public String getFma_status() {
        return fma_status;
    }

    public void setFma_status(String fma_status) {
        this.fma_status = fma_status;
    }

    public String getFma_created_by() {
        return fma_created_by;
    }

    public void setFma_created_by(String fma_created_by) {
        this.fma_created_by = fma_created_by;
    }

    public LocalDateTime getFma_created_date() {
        return fma_created_date;
    }

    public void setFma_created_date(LocalDateTime fma_created_date) {
        this.fma_created_date = fma_created_date;
    }

    public String getFma_modif_by() {
        return fma_modif_by;
    }

    public void setFma_modif_by(String fma_modif_by) {
        this.fma_modif_by = fma_modif_by;
    }

    public LocalDateTime getFma_modif_date() {
        return fma_modif_date;
    }

    public void setFma_modif_date(LocalDateTime fma_modif_date) {
        this.fma_modif_date = fma_modif_date;
    }
}
