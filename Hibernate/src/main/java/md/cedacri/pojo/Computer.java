package md.cedacri.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Represents a computer and hibernate entity
 */

@Entity
@Table(name="computer")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMPUTER", unique = true, nullable = false)
    private int idComputer;
    @Column(name = "SERIE_COMPUTER", nullable = false)
    private int serieComputer;
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
    @Column(name = "ASSEMBLY_DATE", nullable = false)
    private Date assemblyDate;

    public Computer(int serieComputer, String description, Date assemblyDate) {
        this.serieComputer = serieComputer;
        this.description = description;
        this.assemblyDate = assemblyDate;
    }

    public Computer() {
    }

    public int getIdComputer() {
        return idComputer;
    }

    public void setIdComputer(int idComputer) {
        this.idComputer = idComputer;
    }

    public int getSerieComputer() {
        return serieComputer;
    }

    public void setSerieComputer(int serieComputer) {
        this.serieComputer = serieComputer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAssemblyDate() {
        return assemblyDate;
    }

    public void setAssemblyDate(Date assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "idComputer=" + idComputer +
                ", serieComputer=" + serieComputer +
                ", description='" + description + '\'' +
                ", assemblyDate=" + assemblyDate +
                '}';
    }
}
