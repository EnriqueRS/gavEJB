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
@Table(name = "field_data_field_maximo_pujador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldMaximoPujador.findAll", query = "SELECT f FROM FieldDataFieldMaximoPujador f"),
    @NamedQuery(name = "FieldDataFieldMaximoPujador.findByEntityType", query = "SELECT f FROM FieldDataFieldMaximoPujador f WHERE f.fieldDataFieldMaximoPujadorPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldMaximoPujador.findByBundle", query = "SELECT f FROM FieldDataFieldMaximoPujador f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldMaximoPujador.findByDeleted", query = "SELECT f FROM FieldDataFieldMaximoPujador f WHERE f.fieldDataFieldMaximoPujadorPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldMaximoPujador.findByEntityId", query = "SELECT f FROM FieldDataFieldMaximoPujador f WHERE f.fieldDataFieldMaximoPujadorPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldMaximoPujador.findByRevisionId", query = "SELECT f FROM FieldDataFieldMaximoPujador f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldMaximoPujador.findByLanguage", query = "SELECT f FROM FieldDataFieldMaximoPujador f WHERE f.fieldDataFieldMaximoPujadorPK.language = :language"),
    @NamedQuery(name = "FieldDataFieldMaximoPujador.findByDelta", query = "SELECT f FROM FieldDataFieldMaximoPujador f WHERE f.fieldDataFieldMaximoPujadorPK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldMaximoPujador.findByFieldMaximoPujadorValue", query = "SELECT f FROM FieldDataFieldMaximoPujador f WHERE f.fieldMaximoPujadorValue = :fieldMaximoPujadorValue"),
    @NamedQuery(name = "FieldDataFieldMaximoPujador.findByFieldMaximoPujadorFormat", query = "SELECT f FROM FieldDataFieldMaximoPujador f WHERE f.fieldMaximoPujadorFormat = :fieldMaximoPujadorFormat")})
public class FieldDataFieldMaximoPujador implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldMaximoPujadorPK fieldDataFieldMaximoPujadorPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Size(max = 255)
    @Column(name = "field_maximo_pujador_value")
    private String fieldMaximoPujadorValue;
    @Size(max = 255)
    @Column(name = "field_maximo_pujador_format")
    private String fieldMaximoPujadorFormat;

    public FieldDataFieldMaximoPujador() {
    }

    public FieldDataFieldMaximoPujador(FieldDataFieldMaximoPujadorPK fieldDataFieldMaximoPujadorPK) {
        this.fieldDataFieldMaximoPujadorPK = fieldDataFieldMaximoPujadorPK;
    }

    public FieldDataFieldMaximoPujador(FieldDataFieldMaximoPujadorPK fieldDataFieldMaximoPujadorPK, String bundle) {
        this.fieldDataFieldMaximoPujadorPK = fieldDataFieldMaximoPujadorPK;
        this.bundle = bundle;
    }

    public FieldDataFieldMaximoPujador(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldMaximoPujadorPK = new FieldDataFieldMaximoPujadorPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldMaximoPujadorPK getFieldDataFieldMaximoPujadorPK() {
        return fieldDataFieldMaximoPujadorPK;
    }

    public void setFieldDataFieldMaximoPujadorPK(FieldDataFieldMaximoPujadorPK fieldDataFieldMaximoPujadorPK) {
        this.fieldDataFieldMaximoPujadorPK = fieldDataFieldMaximoPujadorPK;
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

    public String getFieldMaximoPujadorValue() {
        return fieldMaximoPujadorValue;
    }

    public void setFieldMaximoPujadorValue(String fieldMaximoPujadorValue) {
        this.fieldMaximoPujadorValue = fieldMaximoPujadorValue;
    }

    public String getFieldMaximoPujadorFormat() {
        return fieldMaximoPujadorFormat;
    }

    public void setFieldMaximoPujadorFormat(String fieldMaximoPujadorFormat) {
        this.fieldMaximoPujadorFormat = fieldMaximoPujadorFormat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldMaximoPujadorPK != null ? fieldDataFieldMaximoPujadorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldMaximoPujador)) {
            return false;
        }
        FieldDataFieldMaximoPujador other = (FieldDataFieldMaximoPujador) object;
        if ((this.fieldDataFieldMaximoPujadorPK == null && other.fieldDataFieldMaximoPujadorPK != null) || (this.fieldDataFieldMaximoPujadorPK != null && !this.fieldDataFieldMaximoPujadorPK.equals(other.fieldDataFieldMaximoPujadorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldMaximoPujador[ fieldDataFieldMaximoPujadorPK=" + fieldDataFieldMaximoPujadorPK + " ]";
    }
    
}
