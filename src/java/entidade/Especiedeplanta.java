/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author profe
 */
@Entity
@Table(name = "especiedeplanta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Especiedeplanta.findAll", query = "SELECT e FROM Especiedeplanta e")
    , @NamedQuery(name = "Especiedeplanta.findByIdespecieDePlanta", query = "SELECT e FROM Especiedeplanta e WHERE e.idespecieDePlanta = :idespecieDePlanta")
    , @NamedQuery(name = "Especiedeplanta.findByNome", query = "SELECT e FROM Especiedeplanta e WHERE e.nome = :nome")})
public class Especiedeplanta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idespecieDePlanta")
    private Integer idespecieDePlanta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "especieDePlantaidespecieDePlanta")
    private Collection<Variedadeplanta> variedadeplantaCollection;

    public Especiedeplanta() {
    }

    public Especiedeplanta(Integer idespecieDePlanta) {
        this.idespecieDePlanta = idespecieDePlanta;
    }

    public Especiedeplanta(Integer idespecieDePlanta, String nome) {
        this.idespecieDePlanta = idespecieDePlanta;
        this.nome = nome;
    }

    public Integer getIdespecieDePlanta() {
        return idespecieDePlanta;
    }

    public void setIdespecieDePlanta(Integer idespecieDePlanta) {
        this.idespecieDePlanta = idespecieDePlanta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public Collection<Variedadeplanta> getVariedadeplantaCollection() {
        return variedadeplantaCollection;
    }

    public void setVariedadeplantaCollection(Collection<Variedadeplanta> variedadeplantaCollection) {
        this.variedadeplantaCollection = variedadeplantaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idespecieDePlanta != null ? idespecieDePlanta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especiedeplanta)) {
            return false;
        }
        Especiedeplanta other = (Especiedeplanta) object;
        if ((this.idespecieDePlanta == null && other.idespecieDePlanta != null) || (this.idespecieDePlanta != null && !this.idespecieDePlanta.equals(other.idespecieDePlanta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
