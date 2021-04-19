package md.cedacri.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents a computer piece and hibernate entity
 */
@Entity
@Table(name = "pieces")
public class Pieces {

    @Id
    @Column(name = "ID_PIECE", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPiece;
    @Column(name = "SERIE", nullable = false)
    private int seriePiece;
    @Column(name = "PIECES_NAME", nullable = false)
    private String name;
    @Column(name = "CHARACTERISTIC", nullable = false)
    private String characteristic;

    public Pieces() {
    }

    public Pieces(int seriePiece, String name, String characteristic) {
        super();
        this.seriePiece = seriePiece;
        this.name = name;
        this.characteristic = characteristic;
    }

    public int getIdPiece() {
        return idPiece;
    }

    public void setIdPiece(int idPiece) {
        this.idPiece = idPiece;
    }

    public int getSeriePiece() {
        return seriePiece;
    }

    public void setSeriePiece(int seriePiece) {
        this.seriePiece = seriePiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

}
