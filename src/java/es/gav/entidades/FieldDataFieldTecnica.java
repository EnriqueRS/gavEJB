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
@Table(name = "field_data_field_tecnica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldTecnica.findAll", query = "SELECT f FROM FieldDataFieldTecnica f"),
    @NamedQuery(name = "FieldDataFieldTecnica.findByEntityType", query = "SELECT f FROM FieldDataFieldTecnica f WHERE f.fieldDataFieldTecnicaPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldTecnica.findByBundle", query = "SELECT f FROM FieldDataFieldTecnica f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldTecnica.findByDeleted", query = "SELECT f FROM FieldDataFieldTecnica f WHERE f.fieldDataFieldTecnicaPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldTecnica.findByEntityId", query = "SELECT f FROM FieldDataFieldTecnica f WHERE f.fieldDataFieldTecnicaPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldTecnica.findByRevisionId", query = "SELECT f FROM FieldDataFieldTecnica f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldTecnica.findByLanguage", query = "SELECT f FROM FieldDataFieldTecnica f WHERE f.fieldDataFieldTecnicaPK.language = :language"),
    @NamedQuery(name = "FieldDataFieldTecnica.findByDelta", query = "SELECT f FROM FieldDataFieldTecnica f WHERE f.fieldDataFieldTecnicaPK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldTecnica.findByFieldTecnicaValue", query = "SELECT f FROM FieldDataFieldTecnica f WHERE f.fieldTecnicaValue = :fieldTecnicaValue")})
public class FieldDataFieldTecnica implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldTecnicaPK fieldDataFieldTecnicaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Size(max = 255)
    @Column(name = "field_tecnica_value")
    private String fieldTecnicaValue;

    public FieldDataFieldTecnica() {
    }

    public FieldDataFieldTecnica(FieldDataFieldTecnicaPK fieldDataFieldTecnicaPK) {
        this.fieldDataFieldTecnicaPK = fieldDataFieldTecnicaPK;
    }

    public FieldDataFieldTecnica(FieldDataFieldTecnicaPK fieldDataFieldTecnicaPK, String bundle) {
        this.fieldDataFieldTecnicaPK = fieldDataFieldTecnicaPK;
        this.bundle = bundle;
    }

    public FieldDataFieldTecnica(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldTecnicaPK = new FieldDataFieldTecnicaPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldTecnicaPK getFieldDataFieldTecnicaPK() {
        return fieldDataFieldTecnicaPK;
    }

    public void setFieldDataFieldTecnicaPK(FieldDataFieldTecnicaPK fieldDataFieldTecnicaPK) {
        this.fieldDataFieldTecnicaPK = fieldDataFieldTecnicaPK;
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

    public String getFieldTecnicaValue() {
        return fieldTecnicaValue;
    }

    public void setFieldTecnicaValue(String fieldTecnicaValue) {
        this.fieldTecnicaValue = fieldTecnicaValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldTecnicaPK != null ? fieldDataFieldTecnicaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldTecnica)) {
            return false;
        }
        FieldDataFieldTecnica other = (FieldDataFieldTecnica) object;
        if ((this.fieldDataFieldTecnicaPK == null && other.fieldDataFieldTecnicaPK != null) || (this.fieldDataFieldTecnicaPK != null && !this.fieldDataFieldTecnicaPK.equals(other.fieldDataFieldTecnicaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldTecnica[ fieldDataFieldTecnicaPK=" + fieldDataFieldTecnicaPK + " ]";
    }
    
}
