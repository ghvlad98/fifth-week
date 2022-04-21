import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="CD")
public class CD {
    @Id
    private int id;
    private String genre;
    private Archivio archive;
    private Set<Song> songs;

    public CD() {
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Archivio getArchive() {
        return archive;
    }

    public void setArchive(Archivio archive) {
        this.archive = archive;
    }
}
