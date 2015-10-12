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
@Table(name = "field_data_field_foto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldDataFieldFoto.findAll", query = "SELECT f FROM FieldDataFieldFoto f"),
    @NamedQuery(name = "FieldDataFieldFoto.findByEntityType", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.fieldDataFieldFotoPK.entityType = :entityType"),
    @NamedQuery(name = "FieldDataFieldFoto.findByBundle", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.bundle = :bundle"),
    @NamedQuery(name = "FieldDataFieldFoto.findByDeleted", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.fieldDataFieldFotoPK.deleted = :deleted"),
    @NamedQuery(name = "FieldDataFieldFoto.findByEntityId", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.fieldDataFieldFotoPK.entityId = :entityId"),
    @NamedQuery(name = "FieldDataFieldFoto.findByRevisionId", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.revisionId = :revisionId"),
    @NamedQuery(name = "FieldDataFieldFoto.findByLanguage", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.fieldDataFieldFotoPK.language = :language"),
    @NamedQuery(name = "FieldDataFieldFoto.findByDelta", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.fieldDataFieldFotoPK.delta = :delta"),
    @NamedQuery(name = "FieldDataFieldFoto.findByFieldFotoFid", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.fieldFotoFid = :fieldFotoFid"),
    @NamedQuery(name = "FieldDataFieldFoto.findByFieldFotoAlt", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.fieldFotoAlt = :fieldFotoAlt"),
    @NamedQuery(name = "FieldDataFieldFoto.findByFieldFotoTitle", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.fieldFotoTitle = :fieldFotoTitle"),
    @NamedQuery(name = "FieldDataFieldFoto.findByFieldFotoWidth", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.fieldFotoWidth = :fieldFotoWidth"),
    @NamedQuery(name = "FieldDataFieldFoto.findByFieldFotoHeight", query = "SELECT f FROM FieldDataFieldFoto f WHERE f.fieldFotoHeight = :fieldFotoHeight")})
public class FieldDataFieldFoto implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FieldDataFieldFotoPK fieldDataFieldFotoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "bundle")
    private String bundle;
    @Column(name = "revision_id")
    private Integer revisionId;
    @Column(name = "field_foto_fid")
    private Integer fieldFotoFid;
    @Size(max = 512)
    @Column(name = "field_foto_alt")
    private String fieldFotoAlt;
    @Size(max = 1024)
    @Column(name = "field_foto_title")
    private String fieldFotoTitle;
    @Column(name = "field_foto_width")
    private Integer fieldFotoWidth;
    @Column(name = "field_foto_height")
    private Integer fieldFotoHeight;

    public FieldDataFieldFoto() {
    }

    public FieldDataFieldFoto(FieldDataFieldFotoPK fieldDataFieldFotoPK) {
        this.fieldDataFieldFotoPK = fieldDataFieldFotoPK;
    }

    public FieldDataFieldFoto(FieldDataFieldFotoPK fieldDataFieldFotoPK, String bundle) {
        this.fieldDataFieldFotoPK = fieldDataFieldFotoPK;
        this.bundle = bundle;
    }

    public FieldDataFieldFoto(String entityType, short deleted, int entityId, String language, int delta) {
        this.fieldDataFieldFotoPK = new FieldDataFieldFotoPK(entityType, deleted, entityId, language, delta);
    }

    public FieldDataFieldFotoPK getFieldDataFieldFotoPK() {
        return fieldDataFieldFotoPK;
    }

    public void setFieldDataFieldFotoPK(FieldDataFieldFotoPK fieldDataFieldFotoPK) {
        this.fieldDataFieldFotoPK = fieldDataFieldFotoPK;
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

    public Integer getFieldFotoFid() {
        return fieldFotoFid;
    }

    public void setFieldFotoFid(Integer fieldFotoFid) {
        this.fieldFotoFid = fieldFotoFid;
    }

    public String getFieldFotoAlt() {
        return fieldFotoAlt;
    }

    public void setFieldFotoAlt(String fieldFotoAlt) {
        this.fieldFotoAlt = fieldFotoAlt;
    }

    public String getFieldFotoTitle() {
        return fieldFotoTitle;
    }

    public void setFieldFotoTitle(String fieldFotoTitle) {
        this.fieldFotoTitle = fieldFotoTitle;
    }

    public Integer getFieldFotoWidth() {
        return fieldFotoWidth;
    }

    public void setFieldFotoWidth(Integer fieldFotoWidth) {
        this.fieldFotoWidth = fieldFotoWidth;
    }

    public Integer getFieldFotoHeight() {
        return fieldFotoHeight;
    }

    public void setFieldFotoHeight(Integer fieldFotoHeight) {
        this.fieldFotoHeight = fieldFotoHeight;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldDataFieldFotoPK != null ? fieldDataFieldFotoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldDataFieldFoto)) {
            return false;
        }
        FieldDataFieldFoto other = (FieldDataFieldFoto) object;
        if ((this.fieldDataFieldFotoPK == null && other.fieldDataFieldFotoPK != null) || (this.fieldDataFieldFotoPK != null && !this.fieldDataFieldFotoPK.equals(other.fieldDataFieldFotoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.FieldDataFieldFoto[ fieldDataFieldFotoPK=" + fieldDataFieldFotoPK + " ]";
    }
    
}
