/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rychorantung.latihanmvcjdb.main;

import edu.rychorantung.latihanmvcjdb.database.KingsbarbershopDatabase;
import edu.rychorantung.latihanmvcjdb.entity.Pelanggan;
import edu.rychorantung.latihanmvcjdb.error.PelangganException;
import edu.rychorantung.latihanmvcjdb.service.PelangganDao;
import edu.rychorantung.latihanmvcjdb.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author USER
 * NAMA: Rycho Rantung
 * KELAS: IF-1
 * NIM: 10118005
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainViewPelanggan pelanggan = new MainViewPelanggan();
                try {
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
}
