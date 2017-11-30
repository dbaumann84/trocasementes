package entidade;

import entidade.Variedadeplanta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T10:22:46")
@StaticMetamodel(Especiedeplanta.class)
public class Especiedeplanta_ { 

    public static volatile SingularAttribute<Especiedeplanta, Integer> idespecieDePlanta;
    public static volatile CollectionAttribute<Especiedeplanta, Variedadeplanta> variedadeplantaCollection;
    public static volatile SingularAttribute<Especiedeplanta, String> nome;

}