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
 * @author Enrique Ríos Santos
 */
@Entity
@Table(name = "field_data_field_maximo_pujador_id")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldMaximoPujadorId.findAll", query = "SELECT f FROM FieldDataFieldMaximoPujadorId f"),
    @NamedQuery(name = "FieldDataFieldMaximoPujadorId.findByEntityType", query = "SELECT f FROM FieldDataFieldMaximoPujadorId f WHERE f.fieldDataFieldMaximoPujadorIdPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldMaximoPujadorId.findByBundle", query = "SELECT f FROM FieldDataFieldMaximoPujadorId f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldMaximoPujadorId.findByDeleted", query = "SELECT f FROM FieldDataFieldMaximoPujadorId f WHERE f.fieldDataFieldMaximoPujadorIdPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldMaximoPujadorId.findByEntityId", query = "SELECT f FROM FieldDataFieldMaximoPujadorId f WHERE f.fieldDataFieldMaximoPujadorIdPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldMaximoPujadorId.findByRevisionId", query = "SELECT f FROM FieldDataFieldMaximoPujadorId f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldMaximoPujadorId.findByLanguage", query = "SELECT f FROM FieldDataFieldMaximoPujadorId f WHERE f.fieldDataFieldMaximoPujadorIdPK.language = :language"),
    @NamedQuery(name = "FieldDataFieldMaximoPujadorId.findByDelta", query = "SELECT f FROM FieldDataFieldMaximoPujadorId f WHERE f.fieldDataFieldMaximoPujadorIdPK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldMaximoPujadorId.findByFieldMaximoPujadorIdValue", query = "SELECT f FROM FieldDataFieldMaximoPujadorId f WHERE f.fieldMaximoPujadorIdValue = :fieldMaximoPujadorIdValue")})
public class FieldDataFieldMaximoPujadorId implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldMaximoPujadorIdPK fieldDataFieldMaximoPujadorIdPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Column(name = "field_maximo_pujador_id_value")
    private Integer fieldMaximoPujadorIdValue;

    public FieldDataFieldMaximoPujadorId() {
    }

    public FieldDataFieldMaximoPujadorId(FieldDataFieldMaximoPujadorIdPK fieldDataFieldMaximoPujadorIdPK) {
        this.fieldDataFieldMaximoPujadorIdPK = fieldDataFieldMaximoPujadorIdPK;
    }

    public FieldDataFieldMaximoPujadorId(FieldDataFieldMaximoPujadorIdPK fieldDataFieldMaximoPujadorIdPK, String bundle) {
        this.fieldDataFieldMaximoPujadorIdPK = fieldDataFieldMaximoPujadorIdPK;
        this.bundle = bundle;
    }

    public FieldDataFieldMaximoPujadorId(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldMaximoPujadorIdPK = new FieldDataFieldMaximoPujadorIdPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldMaximoPujadorIdPK getFieldDataFieldMaximoPujadorIdPK() {
        return fieldDataFieldMaximoPujadorIdPK;
    }

    public void setFieldDataFieldMaximoPujadorIdPK(FieldDataFieldMaximoPujadorIdPK fieldDataFieldMaximoPujadorIdPK) {
        this.fieldDataFieldMaximoPujadorIdPK = fieldDataFieldMaximoPujadorIdPK;
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

    public Integer getFieldMaximoPujadorIdValue() {
        return fieldMaximoPujadorIdValue;
    }

    public void setFieldMaximoPujadorIdValue(Integer fieldMaximoPujadorIdValue) {
        this.fieldMaximoPujadorIdValue = fieldMaximoPujadorIdValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldMaximoPujadorIdPK != null ? fieldDataFieldMaximoPujadorIdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldMaximoPujadorId)) {
            return false;
        }
        FieldDataFieldMaximoPujadorId other = (FieldDataFieldMaximoPujadorId) object;
        if ((this.fieldDataFieldMaximoPujadorIdPK == null && other.fieldDataFieldMaximoPujadorIdPK != null) || (this.fieldDataFieldMaximoPujadorIdPK != null && !this.fieldDataFieldMaximoPujadorIdPK.equals(other.fieldDataFieldMaximoPujadorIdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entidades.FieldDataFieldMaximoPujadorId[ fieldDataFieldMaximoPujadorIdPK=" + fieldDataFieldMaximoPujadorIdPK + " ]";
    }
    
}
