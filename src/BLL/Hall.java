/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 38344
 */
@Entity
@Table(name = "Hall")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hall.findAll", query = "SELECT h FROM Hall h"),
    @NamedQuery(name = "Hall.findByHallID", query = "SELECT h FROM Hall h WHERE h.hallID = :hallID"),
    @NamedQuery(name = "Hall.findByHallName", query = "SELECT h FROM Hall h WHERE h.hallName = :hallName")})
public class Hall implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HallID")
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq", sequenceName="INV_SEQ",allocationSize=1)
    private Integer hallID;
    @Basic(optional = false)
    @Column(name = "HallName")
    private String hallName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hall")
    private Collection<ShowTime> showTimeCollection;
    @OneToMany(mappedBy = "hallID")
    private Collection<HallSeat> hallSeatCollection;

    public Hall() {
    }

    public Hall(Integer hallID) {
        this.hallID = hallID;
    }

    public Hall(Integer hallID, String hallName) {
        this.hallID = hallID;
        this.hallName = hallName;
    }

    public Integer getHallID() {
        return hallID;
    }

    public void setHallID(Integer hallID) {
        this.hallID = hallID;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    @XmlTransient
    public Collection<ShowTime> getShowTimeCollection() {
        return showTimeCollection;
    }

    public void setShowTimeCollection(Collection<ShowTime> showTimeCollection) {
        this.showTimeCollection = showTimeCollection;
    }

    @XmlTransient
    public Collection<HallSeat> getHallSeatCollection() {
        return hallSeatCollection;
    }

    public void setHallSeatCollection(Collection<HallSeat> hallSeatCollection) {
        this.hallSeatCollection = hallSeatCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hallID != null ? hallID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hall)) {
            return false;
        }
        Hall other = (Hall) object;
        if ((this.hallID == null && other.hallID != null) || (this.hallID != null && !this.hallID.equals(other.hallID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hall: " + hallName;
    }
    
}
