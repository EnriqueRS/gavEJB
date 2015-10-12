/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.gav.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kike
 */
@Entity
@Table(name = "field_data_field_tags")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldTags.findAll", query = "SELECT f FROM FieldDataFieldTags f"),
    @NamedQuery(name = "FieldDataFieldTags.findByEntityType", query = "SELECT f FROM FieldDataFieldTags f WHERE f.fieldDataFieldTagsPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldTags.findByBundle", query = "SELECT f FROM FieldDataFieldTags f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldTags.findByDeleted", query = "SELECT f FROM FieldDataFieldTags f WHERE f.fieldDataFieldTagsPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldTags.findByEntityId", query = "SELECT f FROM FieldDataFieldTags f WHERE f.fieldDataFieldTagsPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldTags.findByRevisionId", query = "SELECT f FROM FieldDataFieldTags f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldTags.findByLanguage", query = "SELECT f FROM FieldDataFieldTags f WHERE f.fieldDataFieldTagsPK.language = :language"),
    @NamedQuery(name = "FieldDataFieldTags.findByDelta", query = "SELECT f FROM FieldDataFieldTags f WHERE f.fieldDataFieldTagsPK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldTags.findByFieldTagsTid", query = "SELECT f FROM FieldDataFieldTags f WHERE f.fieldTagsTid = :fieldTagsTid")})
public class FieldDataFieldTags implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldTagsPK fieldDataFieldTagsPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Column(name = "field_tags_tid")
    private Integer fieldTagsTid;

    public FieldDataFieldTags() {
    }

    public FieldDataFieldTags(FieldDataFieldTagsPK fieldDataFieldTagsPK) {
        this.fieldDataFieldTagsPK = fieldDataFieldTagsPK;
    }

    public FieldDataFieldTags(FieldDataFieldTagsPK fieldDataFieldTagsPK, String bundle) {
        this.fieldDataFieldTagsPK = fieldDataFieldTagsPK;
        this.bundle = bundle;
    }

    public FieldDataFieldTags(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldTagsPK = new FieldDataFieldTagsPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldTagsPK getFieldDataFieldTagsPK() {
        return fieldDataFieldTagsPK;
    }

    public void setFieldDataFieldTagsPK(FieldDataFieldTagsPK fieldDataFieldTagsPK) {
        this.fieldDataFieldTagsPK = fieldDataFieldTagsPK;
    }

    public String getBundle() {
        return bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    public Integer getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(Integer revisionId) {
        this.revisionId = revisionId;
    }

    public Integer getFieldTagsTid() {
        return fieldTagsTid;
    }

    public void setFieldTagsTid(Integer fieldTagsTid) {
        this.fieldTagsTid = fieldTagsTid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldTagsPK != null ? fieldDataFieldTagsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldTags)) {
            return false;
        }
        FieldDataFieldTags other = (FieldDataFieldTags) object;
        if ((this.fieldDataFieldTagsPK == null && other.fieldDataFieldTagsPK != null) || (this.fieldDataFieldTagsPK != null && !this.fieldDataFieldTagsPK.equals(other.fieldDataFieldTagsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldTags[ fieldDataFieldTagsPK=" + fieldDataFieldTagsPK + " ]";
    }
    
}
