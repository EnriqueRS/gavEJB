/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.gav.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "node")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Node.findAll", query = "SELECT n FROM Node n"),
    @NamedQuery(name = "Node.findByNid", query = "SELECT n FROM Node n WHERE n.nid = :nid"),
    @NamedQuery(name = "Node.findByVid", query = "SELECT n FROM Node n WHERE n.vid = :vid"),
    @NamedQuery(name = "Node.findByType", query = "SELECT n FROM Node n WHERE n.type = :type"),
    @NamedQuery(name = "Node.findByLanguage", query = "SELECT n FROM Node n WHERE n.language = :language"),
    @NamedQuery(name = "Node.findByTitle", query = "SELECT n FROM Node n WHERE n.title = :title"),
    @NamedQuery(name = "Node.findByUid", query = "SELECT n FROM Node n WHERE n.uid = :uid"),
    @NamedQuery(name = "Node.findByStatus", query = "SELECT n FROM Node n WHERE n.status = :status"),
    @NamedQuery(name = "Node.findByCreated", query = "SELECT n FROM Node n WHERE n.created = :created"),
    @NamedQuery(name = "Node.findByChanged", query = "SELECT n FROM Node n WHERE n.changed = :changed"),
    @NamedQuery(name = "Node.findByComment", query = "SELECT n FROM Node n WHERE n.comment = :comment"),
    @NamedQuery(name = "Node.findByPromote", query = "SELECT n FROM Node n WHERE n.promote = :promote"),
    @NamedQuery(name = "Node.findBySticky", query = "SELECT n FROM Node n WHERE n.sticky = :sticky"),
    @NamedQuery(name = "Node.findByTnid", query = "SELECT n FROM Node n WHERE n.tnid = :tnid"),
    @NamedQuery(name = "Node.findByTranslate", query = "SELECT n FROM Node n WHERE n.translate = :translate")})
public class Node implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nid")
    private Integer nid;
    @Column(name = "vid")
    private Integer vid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "language")
    private String language;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uid")
    private int uid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created")
    private int created;
    @Basic(optional = false)
    @NotNull
    @Column(name = "changed")
    private int changed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "comment")
    private int comment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "promote")
    private int promote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sticky")
    private int sticky;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tnid")
    private int tnid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "translate")
    private int translate;

    public Node() {
    }

    public Node(Integer nid) {
        this.nid = nid;
    }

    public Node(Integer nid, String type, String language, String title, int uid, int status, int created, int changed, int comment, int promote, int sticky, int tnid, int translate) {
        this.nid = nid;
        this.type = type;
        this.language = language;
        this.title = title;
        this.uid = uid;
        this.status = status;
        this.created = created;
        this.changed = changed;
        this.comment = comment;
        this.promote = promote;
        this.sticky = sticky;
        this.tnid = tnid;
        this.translate = translate;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getChanged() {
        return changed;
    }

    public void setChanged(int changed) {
        this.changed = changed;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getPromote() {
        return promote;
    }

    public void setPromote(int promote) {
        this.promote = promote;
    }

    public int getSticky() {
        return sticky;
    }

    public void setSticky(int sticky) {
        this.sticky = sticky;
    }

    public int getTnid() {
        return tnid;
    }

    public void setTnid(int tnid) {
        this.tnid = tnid;
    }

    public int getTranslate() {
        return translate;
    }

    public void setTranslate(int translate) {
        this.translate = translate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nid != null ? nid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Node)) {
            return false;
        }
        Node other = (Node) object;
        if ((this.nid == null && other.nid != null) || (this.nid != null && !this.nid.equals(other.nid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.gav.entities.Node[ nid=" + nid + " ]";
    }
    
}
