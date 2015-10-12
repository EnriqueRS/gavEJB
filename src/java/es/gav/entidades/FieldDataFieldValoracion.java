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
@Table(name = "field_data_field_valoracion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldValoracion.findAll", query = "SELECT f FROM FieldDataFieldValoracion f"),
    @NamedQuery(name = "FieldDataFieldValoracion.findByEntityType", query = "SELECT f FROM FieldDataFieldValoracion f WHERE f.fieldDataFieldValoracionPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldValoracion.findByBundle", query = "SELECT f FROM FieldDataFieldValoracion f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldValoracion.findByDeleted", query = "SELECT f FROM FieldDataFieldValoracion f WHERE f.fieldDataFieldValoracionPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldValoracion.findByEntityId", query = "SELECT f FROM FieldDataFieldValoracion f WHERE f.fieldDataFieldValoracionPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldValoracion.findByRevisionId", query = "SELECT f FROM FieldDataFieldValoracion f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldValoracion.findByLanguage", query = "SELECT f FROM FieldDataFieldValoracion f WHERE f.fieldDataFieldValoracionPK.language = :language"),
    @NamedQuery(name = "FieldDataFieldValoracion.findByDelta", query = "SELECT f FROM FieldDataFieldValoracion f WHERE f.fieldDataFieldValoracionPK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldValoracion.findByFieldValoracionRating", query = "SELECT f FROM FieldDataFieldValoracion f WHERE f.fieldValoracionRating = :fieldValoracionRating"),
    @NamedQuery(name = "FieldDataFieldValoracion.findByFieldValoracionTarget", query = "SELECT f FROM FieldDataFieldValoracion f WHERE f.fieldValoracionTarget = :fieldValoracionTarget")})
public class FieldDataFieldValoracion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldValoracionPK fieldDataFieldValoracionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Column(name = "field_valoracion_rating")
    private Integer fieldValoracionRating;
    @Column(name = "field_valoracion_target")
    private Integer fieldValoracionTarget;

    public FieldDataFieldValoracion() {
    }

    public FieldDataFieldValoracion(FieldDataFieldValoracionPK fieldDataFieldValoracionPK) {
        this.fieldDataFieldValoracionPK = fieldDataFieldValoracionPK;
    }

    public FieldDataFieldValoracion(FieldDataFieldValoracionPK fieldDataFieldValoracionPK, String bundle) {
        this.fieldDataFieldValoracionPK = fieldDataFieldValoracionPK;
        this.bundle = bundle;
    }

    public FieldDataFieldValoracion(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldValoracionPK = new FieldDataFieldValoracionPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldValoracionPK getFieldDataFieldValoracionPK() {
        return fieldDataFieldValoracionPK;
    }

    public void setFieldDataFieldValoracionPK(FieldDataFieldValoracionPK fieldDataFieldValoracionPK) {
        this.fieldDataFieldValoracionPK = fieldDataFieldValoracionPK;
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

    public Integer getFieldValoracionRating() {
        return fieldValoracionRating;
    }

    public void setFieldValoracionRating(Integer fieldValoracionRating) {
        this.fieldValoracionRating = fieldValoracionRating;
    }

    public Integer getFieldValoracionTarget() {
        return fieldValoracionTarget;
    }

    public void setFieldValoracionTarget(Integer fieldValoracionTarget) {
        this.fieldValoracionTarget = fieldValoracionTarget;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldValoracionPK != null ? fieldDataFieldValoracionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldValoracion)) {
            return false;
        }
        FieldDataFieldValoracion other = (FieldDataFieldValoracion) object;
        if ((this.fieldDataFieldValoracionPK == null && other.fieldDataFieldValoracionPK != null) || (this.fieldDataFieldValoracionPK != null && !this.fieldDataFieldValoracionPK.equals(other.fieldDataFieldValoracionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldValoracion[ fieldDataFieldValoracionPK=" + fieldDataFieldValoracionPK + " ]";
    }
    
}
