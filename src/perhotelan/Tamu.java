/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhotelan;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author samsi
 */
@Entity
public class Tamu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Nama_Tamu;
    private String Alamat_Tamu;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tamu)) {
            return false;
        }
        Tamu other = (Tamu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perhotelan.Tamu[ id=" + id + " ]";
    }
     public String getNama_Tamu() {
        return Nama_Tamu;
    }

    /**
     * @param Nama_Tamu the NTtamu to set
     */
    public void setNama_Tamu(String Nama_Tamu) {
        this.Nama_Tamu = Nama_Tamu;
    }

    /**
     * @return the Alamat_Tamu
     */
    public String getAlamat_Tamu() {
        return Alamat_Tamu;
    }

    /**
     * @param Alamat_Tamu the Alamat_Tamu to set
     */
    public void setAlamat_Tamu(String Alamat_Tamu) {
        this.Alamat_Tamu = Alamat_Tamu;

}

}
