package entidade;

import entidade.Sementedousuario;
import entidade.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T10:22:46")
@StaticMetamodel(Pedidodesemente.class)
public class Pedidodesemente_ { 

    public static volatile SingularAttribute<Pedidodesemente, Integer> idPedidoDeSemente;
    public static volatile SingularAttribute<Pedidodesemente, Date> data;
    public static volatile SingularAttribute<Pedidodesemente, Usuario> usuarioIdusuario;
    public static volatile SingularAttribute<Pedidodesemente, Sementedousuario> sementeDoUsuarioidsementeDoUsuario;
    public static volatile SingularAttribute<Pedidodesemente, Integer> quantidade;
    public static volatile SingularAttribute<Pedidodesemente, String> status;

}