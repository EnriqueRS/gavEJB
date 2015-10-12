/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.gav.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kike
 */
@Entity
@Table(name = "field_data_field_fecha_limite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldFechaLimite.findAll", query = "SELECT f FROM FieldDataFieldFechaLimite f"),
    @NamedQuery(name = "FieldDataFieldFechaLimite.findByEntityType", query = "SELECT f FROM FieldDataFieldFechaLimite f WHERE f.fieldDataFieldFechaLimitePK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldFechaLimite.findByBundle", query = "SELECT f FROM FieldDataFieldFechaLimite f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldFechaLimite.findByDeleted", query = "SELECT f FROM FieldDataFieldFechaLimite f WHERE f.fieldDataFieldFechaLimitePK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldFechaLimite.findByEntityId", query = "SELECT f FROM FieldDataFieldFechaLimite f WHERE f.fieldDataFieldFechaLimitePK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldFechaLimite.findByRevisionId", query = "SELECT f FROM FieldDataFieldFechaLimite f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldFechaLimite.findByLanguage", query = "SELECT f FROM FieldDataFieldFechaLimite f WHERE f.fieldDataFieldFechaLimitePK.language = :language"),
    @NamedQuery(name = "FieldDataFieldFechaLimite.findByDelta", query = "SELECT f FROM FieldDataFieldFechaLimite f WHERE f.fieldDataFieldFechaLimitePK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldFechaLimite.findByFieldFechaLimiteValue", query = "SELECT f FROM FieldDataFieldFechaLimite f WHERE f.fieldFechaLimiteValue = :fieldFechaLimiteValue")})
public class FieldDataFieldFechaLimite implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldFechaLimitePK fieldDataFieldFechaLimitePK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Column(name = "field_fecha_limite_value")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fieldFechaLimiteValue;

    public FieldDataFieldFechaLimite() {
    }

    public FieldDataFieldFechaLimite(FieldDataFieldFechaLimitePK fieldDataFieldFechaLimitePK) {
        this.fieldDataFieldFechaLimitePK = fieldDataFieldFechaLimitePK;
    }

    public FieldDataFieldFechaLimite(FieldDataFieldFechaLimitePK fieldDataFieldFechaLimitePK, String bundle) {
        this.fieldDataFieldFechaLimitePK = fieldDataFieldFechaLimitePK;
        this.bundle = bundle;
    }

    public FieldDataFieldFechaLimite(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldFechaLimitePK = new FieldDataFieldFechaLimitePK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldFechaLimitePK getFieldDataFieldFechaLimitePK() {
        return fieldDataFieldFechaLimitePK;
    }

    public void setFieldDataFieldFechaLimitePK(FieldDataFieldFechaLimitePK fieldDataFieldFechaLimitePK) {
        this.fieldDataFieldFechaLimitePK = fieldDataFieldFechaLimitePK;
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

    public Date getFieldFechaLimiteValue() {
        return fieldFechaLimiteValue;
    }

    public void setFieldFechaLimiteValue(Date fieldFechaLimiteValue) {
        this.fieldFechaLimiteValue = fieldFechaLimiteValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldFechaLimitePK != null ? fieldDataFieldFechaLimitePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldFechaLimite)) {
            return false;
        }
        FieldDataFieldFechaLimite other = (FieldDataFieldFechaLimite) object;
        if ((this.fieldDataFieldFechaLimitePK == null && other.fieldDataFieldFechaLimitePK != null) || (this.fieldDataFieldFechaLimitePK != null && !this.fieldDataFieldFechaLimitePK.equals(other.fieldDataFieldFechaLimitePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldFechaLimite[ fieldDataFieldFechaLimitePK=" + fieldDataFieldFechaLimitePK + " ]";
    }
    
}
