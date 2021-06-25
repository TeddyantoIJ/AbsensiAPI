package ac.id.polman.astra.api.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Abs_trformdeklarasimahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fdm_id;
    private Integer fma_id;
    private Integer per_id;
    private String fdm_jawaban;
    private String fdm_status;
    private String fdm_created_by;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime fdm_created_date;
    private String fdm_modif_by;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime fdm_modif_date;

    public Integer getFdm_id() {
        return fdm_id;
    }

    public void setFdm_id(Integer fdm_id) {
        this.fdm_id = fdm_id;
    }

    public Integer getFma_id() {
        return fma_id;
    }

    public void setFma_id(Integer fma_id) {
        this.fma_id = fma_id;
    }

    public Integer getPer_id() {
        return per_id;
    }

    public void setPer_id(Integer per_id) {
        this.per_id = per_id;
    }

    public String getFdm_jawaban() {
        return fdm_jawaban;
    }

    public void setFdm_jawaban(String fdm_jawaban) {
        this.fdm_jawaban = fdm_jawaban;
    }

    public String getFdm_status() {
        return fdm_status;
    }

    public void setFdm_status(String fdm_status) {
        this.fdm_status = fdm_status;
    }

    public String getFdm_created_by() {
        return fdm_created_by;
    }

    public void setFdm_created_by(String fdm_created_by) {
        this.fdm_created_by = fdm_created_by;
    }

    public LocalDateTime getFdm_created_date() {
        return fdm_created_date;
    }

    public void setFdm_created_date(LocalDateTime fdm_created_date) {
        this.fdm_created_date = fdm_created_date;
    }

    public String getFdm_modif_by() {
        return fdm_modif_by;
    }

    public void setFdm_modif_by(String fdm_modif_by) {
        this.fdm_modif_by = fdm_modif_by;
    }

    public LocalDateTime getFdm_modif_date() {
        return fdm_modif_date;
    }

    public void setFdm_modif_date(LocalDateTime fdm_modif_date) {
        this.fdm_modif_date = fdm_modif_date;
    }
}
