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
@Table(name = "field_data_field_en_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldEnVenta.findAll", query = "SELECT f FROM FieldDataFieldEnVenta f"),
    @NamedQuery(name = "FieldDataFieldEnVenta.findByEntityType", query = "SELECT f FROM FieldDataFieldEnVenta f WHERE f.fieldDataFieldEnVentaPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldEnVenta.findByBundle", query = "SELECT f FROM FieldDataFieldEnVenta f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldEnVenta.findByDeleted", query = "SELECT f FROM FieldDataFieldEnVenta f WHERE f.fieldDataFieldEnVentaPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldEnVenta.findByEntityId", query = "SELECT f FROM FieldDataFieldEnVenta f WHERE f.fieldDataFieldEnVentaPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldEnVenta.findByRevisionId", query = "SELECT f FROM FieldDataFieldEnVenta f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldEnVenta.findByLanguage", query = "SELECT f FROM FieldDataFieldEnVenta f WHERE f.fieldDataFieldEnVentaPK.language = :language"),
    @NamedQuery(name = "FieldDataFieldEnVenta.findByDelta", query = "SELECT f FROM FieldDataFieldEnVenta f WHERE f.fieldDataFieldEnVentaPK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldEnVenta.findByFieldEnVentaValue", query = "SELECT f FROM FieldDataFieldEnVenta f WHERE f.fieldEnVentaValue = :fieldEnVentaValue")})
public class FieldDataFieldEnVenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldEnVentaPK fieldDataFieldEnVentaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Column(name = "field_en_venta_value")
    private Integer fieldEnVentaValue;

    public FieldDataFieldEnVenta() {
    }

    public FieldDataFieldEnVenta(FieldDataFieldEnVentaPK fieldDataFieldEnVentaPK) {
        this.fieldDataFieldEnVentaPK = fieldDataFieldEnVentaPK;
    }

    public FieldDataFieldEnVenta(FieldDataFieldEnVentaPK fieldDataFieldEnVentaPK, String bundle) {
        this.fieldDataFieldEnVentaPK = fieldDataFieldEnVentaPK;
        this.bundle = bundle;
    }

    public FieldDataFieldEnVenta(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldEnVentaPK = new FieldDataFieldEnVentaPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldEnVentaPK getFieldDataFieldEnVentaPK() {
        return fieldDataFieldEnVentaPK;
    }

    public void setFieldDataFieldEnVentaPK(FieldDataFieldEnVentaPK fieldDataFieldEnVentaPK) {
        this.fieldDataFieldEnVentaPK = fieldDataFieldEnVentaPK;
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

    public Integer getFieldEnVentaValue() {
        return fieldEnVentaValue;
    }

    public void setFieldEnVentaValue(Integer fieldEnVentaValue) {
        this.fieldEnVentaValue = fieldEnVentaValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldEnVentaPK != null ? fieldDataFieldEnVentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldEnVenta)) {
            return false;
        }
        FieldDataFieldEnVenta other = (FieldDataFieldEnVenta) object;
        if ((this.fieldDataFieldEnVentaPK == null && other.fieldDataFieldEnVentaPK != null) || (this.fieldDataFieldEnVentaPK != null && !this.fieldDataFieldEnVentaPK.equals(other.fieldDataFieldEnVentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldEnVenta[ fieldDataFieldEnVentaPK=" + fieldDataFieldEnVentaPK + " ]";
    }
    
}
