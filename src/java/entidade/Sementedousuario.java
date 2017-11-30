/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author profe
 */
@Entity
@Table(name = "sementedousuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sementedousuario.findAll", query = "SELECT s FROM Sementedousuario s")
    , @NamedQuery(name = "Sementedousuario.findByIdsementeDoUsuario", query = "SELECT s FROM Sementedousuario s WHERE s.idsementeDoUsuario = :idsementeDoUsuario")
    , @NamedQuery(name = "Sementedousuario.findByQuantidadeEmEstoque", query = "SELECT s FROM Sementedousuario s WHERE s.quantidadeEmEstoque = :quantidadeEmEstoque")
    , @NamedQuery(name = "Sementedousuario.findByObservacoes", query = "SELECT s FROM Sementedousuario s WHERE s.observacoes = :observacoes")
    , @NamedQuery(name = "Sementedousuario.findByData", query = "SELECT s FROM Sementedousuario s WHERE s.data = :data")})
public class Sementedousuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsementeDoUsuario")
    private Integer idsementeDoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantidadeEmEstoque")
    private int quantidadeEmEstoque;
    @Size(max = 45)
    @Column(name = "Observacoes")
    private String observacoes;
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuario;
    @JoinColumn(name = "variedadePlanta_idvariedadePlanta", referencedColumnName = "idvariedadePlanta")
    @ManyToOne(optional = false)
    private Variedadeplanta variedadePlantaidvariedadePlanta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sementeDoUsuarioidsementeDoUsuario")
    private Collection<Pedidodesemente> pedidodesementeCollection;

    public Sementedousuario() {
    }

    public Sementedousuario(Integer idsementeDoUsuario) {
        this.idsementeDoUsuario = idsementeDoUsuario;
    }

    public Sementedousuario(Integer idsementeDoUsuario, int quantidadeEmEstoque) {
        this.idsementeDoUsuario = idsementeDoUsuario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Integer getIdsementeDoUsuario() {
        return idsementeDoUsuario;
    }

    public void setIdsementeDoUsuario(Integer idsementeDoUsuario) {
        this.idsementeDoUsuario = idsementeDoUsuario;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Usuario getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(Usuario usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public Variedadeplanta getVariedadePlantaidvariedadePlanta() {
        return variedadePlantaidvariedadePlanta;
    }

    public void setVariedadePlantaidvariedadePlanta(Variedadeplanta variedadePlantaidvariedadePlanta) {
        this.variedadePlantaidvariedadePlanta = variedadePlantaidvariedadePlanta;
    }

    @XmlTransient
    public Collection<Pedidodesemente> getPedidodesementeCollection() {
        return pedidodesementeCollection;
    }

    public void setPedidodesementeCollection(Collection<Pedidodesemente> pedidodesementeCollection) {
        this.pedidodesementeCollection = pedidodesementeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsementeDoUsuario != null ? idsementeDoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sementedousuario)) {
            return false;
        }
        Sementedousuario other = (Sementedousuario) object;
        if ((this.idsementeDoUsuario == null && other.idsementeDoUsuario != null) || (this.idsementeDoUsuario != null && !this.idsementeDoUsuario.equals(other.idsementeDoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Sementedousuario[ idsementeDoUsuario=" + idsementeDoUsuario + " ]";
    }
    
}
