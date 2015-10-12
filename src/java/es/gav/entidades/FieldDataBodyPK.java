/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.gav.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author kike
 */
@Embeddable
public class FieldDataBodyPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "entity_type")
    private String entityType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "deleted")
    private short deleted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "entity_id")
    private int entityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "language")
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "delta")
    private int delta;

    public FieldDataBodyPK() {
    }

    public FieldDataBodyPK(String entityType, short deleted, int entityId, String language, int delta) {
        this.entityType = entityType;
        this.deleted = deleted;
        this.entityId = entityId;
        this.language = language;
        this.delta = delta;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public short getDeleted() {
        return deleted;
    }

    public void setDeleted(short deleted) {
        this.deleted = deleted;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityType != null ? entityType.hashCode() : 0);
        hash += (int) deleted;
        hash += (int) entityId;
        hash += (language != null ? language.hashCode() : 0);
        hash += (int) delta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataBodyPK)) {
            return false;
        }
        FieldDataBodyPK other = (FieldDataBodyPK) object;
        if ((this.entityType == null && other.entityType != null) || (this.entityType != null && !this.entityType.equals(other.entityType))) {
            return false;
        }
        if (this.deleted != other.deleted) {
            return false;
        }
        if (this.entityId != other.entityId) {
            return false;
        }
        if ((this.language == null && other.language != null) || (this.language != null && !this.language.equals(other.language))) {
            return false;
        }
        if (this.delta != other.delta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataBodyPK[ entityType=" + entityType + ", deleted=" + deleted + ", entityId=" + entityId + ", language=" + language + ", delta=" + delta + " ]";
    }
    
}
