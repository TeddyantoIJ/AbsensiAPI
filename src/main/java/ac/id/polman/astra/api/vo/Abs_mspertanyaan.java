package ac.id.polman.astra.api.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Abs_mspertanyaan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer per_id;
	private String per_deskripsi;
    private Integer per_bobot;
    private Integer per_urutan;
    private String per_status;
    private String per_created_by;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime per_created_date;
    private String per_modif_by;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime per_modif_date;

    public Integer getPer_id() {
        return per_id;
    }

    public void setPer_id(Integer per_id) {
        this.per_id = per_id;
    }

    public String getPer_deskripsi() {
        return per_deskripsi;
    }

    public void setPer_deskripsi(String per_deskripsi) {
        this.per_deskripsi = per_deskripsi;
    }

    public Integer getPer_bobot() {
        return per_bobot;
    }

    public void setPer_bobot(Integer per_bobot) {
        this.per_bobot = per_bobot;
    }

    public Integer getPer_urutan() {
        return per_urutan;
    }

    public void setPer_urutan(Integer per_urutan) {
        this.per_urutan = per_urutan;
    }

    public String getPer_status() {
        return per_status;
    }

    public void setPer_status(String per_status) {
        this.per_status = per_status;
    }

    public String getPer_created_by() {
        return per_created_by;
    }

    public void setPer_created_by(String per_created_by) {
        this.per_created_by = per_created_by;
    }

    public LocalDateTime getPer_created_date() {
        return per_created_date;
    }

    public void setPer_created_date(LocalDateTime per_created_date) {
        this.per_created_date = per_created_date;
    }

    public String getPer_modif_by() {
        return per_modif_by;
    }

    public void setPer_modif_by(String per_modif_by) {
        this.per_modif_by = per_modif_by;
    }

    public LocalDateTime getPer_modif_date() {
        return per_modif_date;
    }

    public void setPer_modif_date(LocalDateTime per_modif_date) {
        this.per_modif_date = per_modif_date;
    }
}
