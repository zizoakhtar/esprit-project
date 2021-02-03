package com.bezkoder.springjwt.models;

import java.io.Serializable;

public interface HasID<ID> extends Serializable {
    /**
     * ID getter
     * @return ID
     */
    ID getID();

    /**
     * ID setter
     * @param id: id to be set
     */
    void setID(ID id);
}