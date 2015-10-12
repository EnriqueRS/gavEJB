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
@Table(name = "field_data_field_estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldEstado.findAll", query = "SELECT f FROM FieldDataFieldEstado f"),
    @NamedQuery(name = "FieldDataFieldEstado.findByEntityType", query = "SELECT f FROM FieldDataFieldEstado f WHERE f.fieldDataFieldEstadoPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldEstado.findByBundle", query = "SELECT f FROM FieldDataFieldEstado f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldEstado.findByDeleted", query = "SELECT f FROM FieldDataFieldEstado f WHERE f.fieldDataFieldEstadoPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldEstado.findByEntityId", query = "SELECT f FROM FieldDataFieldEstado f WHERE f.fieldDataFieldEstadoPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldEstado.findByRevisionId", query = "SELECT f FROM FieldDataFieldEstado f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldEstado.findByLanguage", query = "SELECT f FROM FieldDataFieldEstado f WHERE f.fieldDataFieldEstadoPK.language = :language"),
    @NamedQuery(name = "FieldDataFieldEstado.findByDelta", query = "SELECT f FROM FieldDataFieldEstado f WHERE f.fieldDataFieldEstadoPK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldEstado.findByFieldEstadoValue", query = "SELECT f FROM FieldDataFieldEstado f WHERE f.fieldEstadoValue = :fieldEstadoValue")})
public class FieldDataFieldEstado implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldEstadoPK fieldDataFieldEstadoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Size(max = 255)
    @Column(name = "field_estado_value")
    private String fieldEstadoValue;

    public FieldDataFieldEstado() {
    }

    public FieldDataFieldEstado(FieldDataFieldEstadoPK fieldDataFieldEstadoPK) {
        this.fieldDataFieldEstadoPK = fieldDataFieldEstadoPK;
    }

    public FieldDataFieldEstado(FieldDataFieldEstadoPK fieldDataFieldEstadoPK, String bundle) {
        this.fieldDataFieldEstadoPK = fieldDataFieldEstadoPK;
        this.bundle = bundle;
    }

    public FieldDataFieldEstado(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldEstadoPK = new FieldDataFieldEstadoPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldEstadoPK getFieldDataFieldEstadoPK() {
        return fieldDataFieldEstadoPK;
    }

    public void setFieldDataFieldEstadoPK(FieldDataFieldEstadoPK fieldDataFieldEstadoPK) {
        this.fieldDataFieldEstadoPK = fieldDataFieldEstadoPK;
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

    public String getFieldEstadoValue() {
        return fieldEstadoValue;
    }

    public void setFieldEstadoValue(String fieldEstadoValue) {
        this.fieldEstadoValue = fieldEstadoValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldEstadoPK != null ? fieldDataFieldEstadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldEstado)) {
            return false;
        }
        FieldDataFieldEstado other = (FieldDataFieldEstado) object;
        if ((this.fieldDataFieldEstadoPK == null && other.fieldDataFieldEstadoPK != null) || (this.fieldDataFieldEstadoPK != null && !this.fieldDataFieldEstadoPK.equals(other.fieldDataFieldEstadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldEstado[ fieldDataFieldEstadoPK=" + fieldDataFieldEstadoPK + " ]";
    }
    
}
