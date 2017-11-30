package entidade;

import entidade.Administrador;
import entidade.Pedidodesemente;
import entidade.Sementedousuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T10:22:46")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> cidade;
    public static volatile SingularAttribute<Usuario, String> estado;
    public static volatile SingularAttribute<Usuario, String> numero;
    public static volatile SingularAttribute<Usuario, String> bairro;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, Integer> reputacao;
    public static volatile SingularAttribute<Usuario, Integer> idusuario;
    public static volatile SingularAttribute<Usuario, String> cep;
    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile SingularAttribute<Usuario, String> complemento;
    public static volatile CollectionAttribute<Usuario, Administrador> administradorCollection;
    public static volatile CollectionAttribute<Usuario, Sementedousuario> sementedousuarioCollection;
    public static volatile CollectionAttribute<Usuario, Pedidodesemente> pedidodesementeCollection;
    public static volatile SingularAttribute<Usuario, String> sobrenome;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, String> rua;

}