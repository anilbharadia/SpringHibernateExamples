package org.rw.dao;

import java.io.Serializable;

public interface GenericDao <E, PK extends Serializable> {

    /** Persist the newInstance object into database */
    PK create(E newInstance);

    /** Retrieve an object that was previously persisted to the database using the indicated id as primary key */
    E read(PK id);

    /** Save changes made to a persistent object.  */
    void update(E transientObject);

    /** Remove an object from persistent storage in the database */
    void delete(E persistentObject);
}

