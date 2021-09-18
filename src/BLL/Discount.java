/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "Discount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Discount.findAll", query = "SELECT d FROM Discount d"),
    @NamedQuery(name = "Discount.findByDiscountID", query = "SELECT d FROM Discount d WHERE d.discountID = :discountID"),
    @NamedQuery(name = "Discount.findByDisName", query = "SELECT d FROM Discount d WHERE d.disName = :disName"),
    @NamedQuery(name = "Discount.findByDisPerc", query = "SELECT d FROM Discount d WHERE d.disPerc = :disPerc")})
public class Discount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DiscountID")
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq", sequenceName="INV_SEQ",allocationSize=1)
    private Integer discountID;
    @Basic(optional = false)
    @Column(name = "DisName")
    private String disName;
    @Basic(optional = false)
    @Column(name = "DisPerc")
    private long disPerc;
    @OneToMany(mappedBy = "discount")
    private Collection<Ticket> ticketCollection;

    public Discount() {
    }

    public Discount(Integer discountID) {
        this.discountID = discountID;
    }

    public Discount(Integer discountID, String disName, long disPerc) {
        this.discountID = discountID;
        this.disName = disName;
        this.disPerc = disPerc;
    }

    public Integer getDiscountID() {
        return discountID;
    }

    public void setDiscountID(Integer discountID) {
        this.discountID = discountID;
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }

    public long getDisPerc() {
        return disPerc;
    }

    public void setDisPerc(long disPerc) {
        this.disPerc = disPerc;
    }

    @XmlTransient
    public Collection<Ticket> getTicketCollection() {
        return ticketCollection;
    }

    public void setTicketCollection(Collection<Ticket> ticketCollection) {
        this.ticketCollection = ticketCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (discountID != null ? discountID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Discount)) {
            return false;
        }
        Discount other = (Discount) object;
        if ((this.discountID == null && other.discountID != null) || (this.discountID != null && !this.discountID.equals(other.discountID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Discount[ discountID=" + discountID + " ]";
    }
    
}
