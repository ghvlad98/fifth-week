import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Song")
public class Song {

    @Id
    private int id;
    private CD album;

    public Song() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CD getAlbum() {
        return album;
    }

    public void setAlbum(CD album) {
        this.album = album;
    }
}
