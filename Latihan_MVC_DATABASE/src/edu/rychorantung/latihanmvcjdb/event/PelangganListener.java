/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rychorantung.latihanmvcjdb.event;

import edu.rychorantung.latihanmvcjdb.entity.Pelanggan;
import edu.rychorantung.latihanmvcjdb.model.PelangganModel;

/**
 *
 * @author USER
 * NAMA: Rycho Rantung
 * KELAS: IF-1
 * NIM: 10118005
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void oninSert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan model);
    
}
