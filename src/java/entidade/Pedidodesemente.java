/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author profe
 */
@Entity
@Table(name = "pedidodesemente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidodesemente.findAll", query = "SELECT p FROM Pedidodesemente p")
    , @NamedQuery(name = "Pedidodesemente.findByIdPedidoDeSemente", query = "SELECT p FROM Pedidodesemente p WHERE p.idPedidoDeSemente = :idPedidoDeSemente")
    , @NamedQuery(name = "Pedidodesemente.findByQuantidade", query = "SELECT p FROM Pedidodesemente p WHERE p.quantidade = :quantidade")
    , @NamedQuery(name = "Pedidodesemente.findByStatus", query = "SELECT p FROM Pedidodesemente p WHERE p.status = :status")
    , @NamedQuery(name = "Pedidodesemente.findByData", query = "SELECT p FROM Pedidodesemente p WHERE p.data = :data")})
public class Pedidodesemente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPedidoDeSemente")
    private Integer idPedidoDeSemente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantidade")
    private int quantidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "status")
    private String status;
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @JoinColumn(name = "sementeDoUsuario_idsementeDoUsuario", referencedColumnName = "idsementeDoUsuario")
    @ManyToOne(optional = false)
    private Sementedousuario sementeDoUsuarioidsementeDoUsuario;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuario;

    public Pedidodesemente() {
    }

    public Pedidodesemente(Integer idPedidoDeSemente) {
        this.idPedidoDeSemente = idPedidoDeSemente;
    }

    public Pedidodesemente(Integer idPedidoDeSemente, int quantidade, String status) {
        this.idPedidoDeSemente = idPedidoDeSemente;
        this.quantidade = quantidade;
        this.status = status;
    }

    public Integer getIdPedidoDeSemente() {
        return idPedidoDeSemente;
    }

    public void setIdPedidoDeSemente(Integer idPedidoDeSemente) {
        this.idPedidoDeSemente = idPedidoDeSemente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Sementedousuario getSementeDoUsuarioidsementeDoUsuario() {
        return sementeDoUsuarioidsementeDoUsuario;
    }

    public void setSementeDoUsuarioidsementeDoUsuario(Sementedousuario sementeDoUsuarioidsementeDoUsuario) {
        this.sementeDoUsuarioidsementeDoUsuario = sementeDoUsuarioidsementeDoUsuario;
    }

    public Usuario getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(Usuario usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedidoDeSemente != null ? idPedidoDeSemente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidodesemente)) {
            return false;
        }
        Pedidodesemente other = (Pedidodesemente) object;
        if ((this.idPedidoDeSemente == null && other.idPedidoDeSemente != null) || (this.idPedidoDeSemente != null && !this.idPedidoDeSemente.equals(other.idPedidoDeSemente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Pedidodesemente[ idPedidoDeSemente=" + idPedidoDeSemente + " ]";
    }
    
}
