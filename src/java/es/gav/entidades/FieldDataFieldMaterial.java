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
@Table(name = "field_data_field_material")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldMaterial.findAll", query = "SELECT f FROM FieldDataFieldMaterial f"),
    @NamedQuery(name = "FieldDataFieldMaterial.findByEntityType", query = "SELECT f FROM FieldDataFieldMaterial f WHERE f.fieldDataFieldMaterialPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldMaterial.findByBundle", query = "SELECT f FROM FieldDataFieldMaterial f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldMaterial.findByDeleted", query = "SELECT f FROM FieldDataFieldMaterial f WHERE f.fieldDataFieldMaterialPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldMaterial.findByEntityId", query = "SELECT f FROM FieldDataFieldMaterial f WHERE f.fieldDataFieldMaterialPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldMaterial.findByRevisionId", query = "SELECT f FROM FieldDataFieldMaterial f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldMaterial.findByLanguage", query = "SELECT f FROM FieldDataFieldMaterial f WHERE f.fieldDataFieldMaterialPK.language = :language"),
    @NamedQuery(name = "FieldDataFieldMaterial.findByDelta", query = "SELECT f FROM FieldDataFieldMaterial f WHERE f.fieldDataFieldMaterialPK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldMaterial.findByFieldMaterialValue", query = "SELECT f FROM FieldDataFieldMaterial f WHERE f.fieldMaterialValue = :fieldMaterialValue")})
public class FieldDataFieldMaterial implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldMaterialPK fieldDataFieldMaterialPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Size(max = 255)
    @Column(name = "field_material_value")
    private String fieldMaterialValue;

    public FieldDataFieldMaterial() {
    }

    public FieldDataFieldMaterial(FieldDataFieldMaterialPK fieldDataFieldMaterialPK) {
        this.fieldDataFieldMaterialPK = fieldDataFieldMaterialPK;
    }

    public FieldDataFieldMaterial(FieldDataFieldMaterialPK fieldDataFieldMaterialPK, String bundle) {
        this.fieldDataFieldMaterialPK = fieldDataFieldMaterialPK;
        this.bundle = bundle;
    }

    public FieldDataFieldMaterial(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldMaterialPK = new FieldDataFieldMaterialPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldMaterialPK getFieldDataFieldMaterialPK() {
        return fieldDataFieldMaterialPK;
    }

    public void setFieldDataFieldMaterialPK(FieldDataFieldMaterialPK fieldDataFieldMaterialPK) {
        this.fieldDataFieldMaterialPK = fieldDataFieldMaterialPK;
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

    public String getFieldMaterialValue() {
        return fieldMaterialValue;
    }

    public void setFieldMaterialValue(String fieldMaterialValue) {
        this.fieldMaterialValue = fieldMaterialValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldMaterialPK != null ? fieldDataFieldMaterialPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldMaterial)) {
            return false;
        }
        FieldDataFieldMaterial other = (FieldDataFieldMaterial) object;
        if ((this.fieldDataFieldMaterialPK == null && other.fieldDataFieldMaterialPK != null) || (this.fieldDataFieldMaterialPK != null && !this.fieldDataFieldMaterialPK.equals(other.fieldDataFieldMaterialPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldMaterial[ fieldDataFieldMaterialPK=" + fieldDataFieldMaterialPK + " ]";
    }
    
}
