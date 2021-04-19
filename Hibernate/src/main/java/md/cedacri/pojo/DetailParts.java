package md.cedacri.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents a  piece detail and hibernate entity.
 */

@Entity
@Table(name = "detail_parts")
public class DetailParts {

    @Id
    @Column(name = "ID_PIECE_DETAIL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPieceDetail;
    @Column(name = "ID_PIECE")
    private int idPiece;
    @Column(name = "ID_COMPUTER")
    private int idComputer;
    @Column(name = "PIECE")
    private String pieceDetail;
    @Column(name = "COST")
    private int cost;

    public DetailParts() {
    }

    public DetailParts(String pieceDetail, int cost) {
        super();
        this.pieceDetail = pieceDetail;
        this.cost = cost;
    }

    public int getIdPieceDetail() {
        return idPieceDetail;
    }

    public void setIdPieceDetail(int idPieceDetail) {
        this.idPieceDetail = idPieceDetail;
    }

    public int getIdPiece() {
        return idPiece;
    }

    public void setIdPiece(int idPiece) {
        this.idPiece = idPiece;
    }

    public int getIdComputer() {
        return idComputer;
    }

    public void setIdComputer(int idComputer) {
        this.idComputer = idComputer;
    }

    public String getPieceDetail() {
        return pieceDetail;
    }

    public void setPieceDetail(String pieceDetail) {
        this.pieceDetail = pieceDetail;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
