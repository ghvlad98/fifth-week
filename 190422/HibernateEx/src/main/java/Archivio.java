import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="Archivio")
public class Archivio {

    @Id
    private Integer id;
    private Set<CD> cds;
    private Set<String> genres;

    public Archivio() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<CD> getCds() {
        return cds;
    }

    public void setCds(Set<CD> cds) {
        this.cds = cds;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }
}
