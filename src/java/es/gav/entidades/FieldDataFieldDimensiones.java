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
@Table(name = "field_data_field_dimensiones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldDimensiones.findAll", query = "SELECT f FROM FieldDataFieldDimensiones f"),
    @NamedQuery(name = "FieldDataFieldDimensiones.findByEntityType", query = "SELECT f FROM FieldDataFieldDimensiones f WHERE f.fieldDataFieldDimensionesPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldDimensiones.findByBundle", query = "SELECT f FROM FieldDataFieldDimensiones f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldDimensiones.findByDeleted", query = "SELECT f FROM FieldDataFieldDimensiones f WHERE f.fieldDataFieldDimensionesPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldDimensiones.findByEntityId", query = "SELECT f FROM FieldDataFieldDimensiones f WHERE f.fieldDataFieldDimensionesPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldDimensiones.findByRevisionId", query = "SELECT f FROM FieldDataFieldDimensiones f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldDimensiones.findByLanguage", query = "SELECT f FROM FieldDataFieldDimensiones f WHERE f.fieldDataFieldDimensionesPK.language = :language"),
    @NamedQuery(name = "FieldDataFieldDimensiones.findByDelta", query = "SELECT f FROM FieldDataFieldDimensiones f WHERE f.fieldDataFieldDimensionesPK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldDimensiones.findByFieldDimensionesValue", query = "SELECT f FROM FieldDataFieldDimensiones f WHERE f.fieldDimensionesValue = :fieldDimensionesValue")})
public class FieldDataFieldDimensiones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldDimensionesPK fieldDataFieldDimensionesPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Column(name = "field_dimensiones_value")
    private Integer fieldDimensionesValue;

    public FieldDataFieldDimensiones() {
    }

    public FieldDataFieldDimensiones(FieldDataFieldDimensionesPK fieldDataFieldDimensionesPK) {
        this.fieldDataFieldDimensionesPK = fieldDataFieldDimensionesPK;
    }

    public FieldDataFieldDimensiones(FieldDataFieldDimensionesPK fieldDataFieldDimensionesPK, String bundle) {
        this.fieldDataFieldDimensionesPK = fieldDataFieldDimensionesPK;
        this.bundle = bundle;
    }

    public FieldDataFieldDimensiones(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldDimensionesPK = new FieldDataFieldDimensionesPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldDimensionesPK getFieldDataFieldDimensionesPK() {
        return fieldDataFieldDimensionesPK;
    }

    public void setFieldDataFieldDimensionesPK(FieldDataFieldDimensionesPK fieldDataFieldDimensionesPK) {
        this.fieldDataFieldDimensionesPK = fieldDataFieldDimensionesPK;
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

    public Integer getFieldDimensionesValue() {
        return fieldDimensionesValue;
    }

    public void setFieldDimensionesValue(Integer fieldDimensionesValue) {
        this.fieldDimensionesValue = fieldDimensionesValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldDimensionesPK != null ? fieldDataFieldDimensionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldDimensiones)) {
            return false;
        }
        FieldDataFieldDimensiones other = (FieldDataFieldDimensiones) object;
        if ((this.fieldDataFieldDimensionesPK == null && other.fieldDataFieldDimensionesPK != null) || (this.fieldDataFieldDimensionesPK != null && !this.fieldDataFieldDimensionesPK.equals(other.fieldDataFieldDimensionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldDimensiones[ fieldDataFieldDimensionesPK=" + fieldDataFieldDimensionesPK + " ]";
    }
    
}
