package entity;

import entity.Person;
import entity.Subject;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-24T12:44:59")
@StaticMetamodel(Journal.class)
public class Journal_ { 

    public static volatile SingularAttribute<Journal, Person> person;
    public static volatile SingularAttribute<Journal, Subject> subject;
    public static volatile SingularAttribute<Journal, Integer> grade;
    public static volatile SingularAttribute<Journal, Long> id;

}