package entidade;

import entidade.Especiedeplanta;
import entidade.Sementedousuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T10:22:46")
@StaticMetamodel(Variedadeplanta.class)
public class Variedadeplanta_ { 

    public static volatile SingularAttribute<Variedadeplanta, Integer> idvariedadePlanta;
    public static volatile SingularAttribute<Variedadeplanta, Especiedeplanta> especieDePlantaidespecieDePlanta;
    public static volatile CollectionAttribute<Variedadeplanta, Sementedousuario> sementedousuarioCollection;
    public static volatile SingularAttribute<Variedadeplanta, String> nome;

}