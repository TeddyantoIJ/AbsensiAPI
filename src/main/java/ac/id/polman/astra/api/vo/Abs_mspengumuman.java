package ac.id.polman.astra.api.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Abs_mspengumuman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pen_id;
    private String pen_subyek;
    private String pen_untuk;
    private String pen_isi;
    private String pen_status;
    private String pen_created_by;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime pen_created_date;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private String pen_modif_by;
    private LocalDateTime pen_modif_date;

    public int getPen_id() {
        return pen_id;
    }

    public void setPen_id(int pen_id) {
        this.pen_id = pen_id;
    }

    public String getPen_subyek() {
        return pen_subyek;
    }

    public void setPen_subyek(String pen_subyek) {
        this.pen_subyek = pen_subyek;
    }

    public String getPen_untuk() {
        return pen_untuk;
    }

    public void setPen_untuk(String pen_untuk) {
        this.pen_untuk = pen_untuk;
    }

    public String getPen_isi() {
//        String[] isi = pen_isi.split("src='");
//        pen_isi = isi[1].replace("' /></p>","");
//        pen_isi = "https://satgas-covid19.polman.astra.ac.id/"+pen_isi;
        try {
            return "https://satgas-covid19.polman.astra.ac.id/"+pen_isi.split("src='")[1].split(".jpg")[0]+".jpg";
        }catch (Exception ex){

        }
        return pen_isi;
    }

    public void setPen_isi(String pen_isi) {
        this.pen_isi = pen_isi;
    }

    public String getPen_status() {
        return pen_status;
    }

    public void setPen_status(String pen_status) {
        this.pen_status = pen_status;
    }

    public String getPen_created_by() {
        return pen_created_by;
    }

    public void setPen_created_by(String pen_created_by) {
        this.pen_created_by = pen_created_by;
    }

    public LocalDateTime getPen_created_date() {
        return pen_created_date;
    }

    public void setPen_created_date(LocalDateTime pen_created_date) {
        this.pen_created_date = pen_created_date;
    }

    public String getPen_modif_by() {
        return pen_modif_by;
    }

    public void setPen_modif_by(String pen_modif_by) {
        this.pen_modif_by = pen_modif_by;
    }

    public LocalDateTime getPen_modif_date() {
        return pen_modif_date;
    }

    public void setPen_modif_date(LocalDateTime pen_modif_date) {
        this.pen_modif_date = pen_modif_date;
    }
}
