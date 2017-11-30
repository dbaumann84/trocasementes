package entidade;

import entidade.Pedidodesemente;
import entidade.Usuario;
import entidade.Variedadeplanta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T10:22:46")
@StaticMetamodel(Sementedousuario.class)
public class Sementedousuario_ { 

    public static volatile SingularAttribute<Sementedousuario, Variedadeplanta> variedadePlantaidvariedadePlanta;
    public static volatile SingularAttribute<Sementedousuario, String> observacoes;
    public static volatile SingularAttribute<Sementedousuario, Date> data;
    public static volatile SingularAttribute<Sementedousuario, Usuario> usuarioIdusuario;
    public static volatile CollectionAttribute<Sementedousuario, Pedidodesemente> pedidodesementeCollection;
    public static volatile SingularAttribute<Sementedousuario, Integer> idsementeDoUsuario;
    public static volatile SingularAttribute<Sementedousuario, Integer> quantidadeEmEstoque;

}