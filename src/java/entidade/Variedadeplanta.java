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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * 
 *SELECT especiedeplanta.nome,variedadeplanta.nome from variedadeplanta inner join especiedeplanta on especiedeplanta.`idespecieDePlanta`=variedadeplanta.`especieDePlanta_idespecieDePlanta`
 * 
 */
@Entity
@Table(name = "variedadeplanta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Variedadeplanta.findAll", query = "SELECT v FROM Variedadeplanta v")
    , @NamedQuery(name = "Variedadeplanta.findByIdvariedadePlanta", query = "SELECT v FROM Variedadeplanta v WHERE v.idvariedadePlanta = :idvariedadePlanta")
    , @NamedQuery(name = "Variedadeplanta.findByNome", query = "SELECT v FROM Variedadeplanta v WHERE v.nome = :nome")})
public class Variedadeplanta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvariedadePlanta")
    private Integer idvariedadePlanta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nome")
    private String nome;
    @JoinColumn(name = "especieDePlanta_idespecieDePlanta", referencedColumnName = "idespecieDePlanta")
    @ManyToOne(optional = false)
    private Especiedeplanta especieDePlantaidespecieDePlanta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "variedadePlantaidvariedadePlanta")
    private Collection<Sementedousuario> sementedousuarioCollection;

    public Variedadeplanta() {
    }

    public Variedadeplanta(Integer idvariedadePlanta) {
        this.idvariedadePlanta = idvariedadePlanta;
    }

    public Variedadeplanta(Integer idvariedadePlanta, String nome) {
        this.idvariedadePlanta = idvariedadePlanta;
        this.nome = nome;
    }

    public Integer getIdvariedadePlanta() {
        return idvariedadePlanta;
    }

    public void setIdvariedadePlanta(Integer idvariedadePlanta) {
        this.idvariedadePlanta = idvariedadePlanta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especiedeplanta getEspecieDePlantaidespecieDePlanta() {
        return especieDePlantaidespecieDePlanta;
    }

    public void setEspecieDePlantaidespecieDePlanta(Especiedeplanta especieDePlantaidespecieDePlanta) {
        this.especieDePlantaidespecieDePlanta = especieDePlantaidespecieDePlanta;
    }

    @XmlTransient
    public Collection<Sementedousuario> getSementedousuarioCollection() {
        return sementedousuarioCollection;
    }

    public void setSementedousuarioCollection(Collection<Sementedousuario> sementedousuarioCollection) {
        this.sementedousuarioCollection = sementedousuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvariedadePlanta != null ? idvariedadePlanta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Variedadeplanta)) {
            return false;
        }
        Variedadeplanta other = (Variedadeplanta) object;
        if ((this.idvariedadePlanta == null && other.idvariedadePlanta != null) || (this.idvariedadePlanta != null && !this.idvariedadePlanta.equals(other.idvariedadePlanta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
