/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOUser;
import mvc.Model.User;
import mvc.Model.TabelModelUser;
import mvc.View.FormAdmin;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAOInterface.IUser;

/**
 *
 * @author acer
 */
public class ControllerAdmin {
    FormAdmin frame;
    IUser implUser;
    List<User> lb;
    
    public ControllerAdmin(FormAdmin frame) {
        this.frame = frame;
        implUser = new DAOUser();
        lb = implUser.getAll();
    }
    
    // mengosongkan semua field
    public void reset() {
        frame.getTxtNik().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
    }
    
    // menampilkan data ke dalam tabel
    public  void isiTable() {
        lb = implUser.getAll();
        TabelModelUser tmb = new TabelModelUser(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row) {
        frame.getTxtNik().setText(lb.get(row).getNik().toString());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frame.getTxtAlamat().setText(lb.get(row).getAlamat());
        frame.getTxtUsia().setText(lb.get(row).getUsia().toString());
        frame.getTxtAlasan().setText(lb.get(row).getAlasan());
    }
    
    public void update() {
        if (!frame.getTxtNik().getText().trim().isEmpty()) {
            User b = new User();
            b.setNik(Integer.parseInt(frame.getTxtNik().getText()));
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setUsia(Integer.parseInt(frame.getTxtUsia().getText()));
            b.setAlasan(frame.getTxtAlasan().getText());
            implUser.update(b);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan diubah");
        }
    }
    
    public void delete() {
        if (!frame.getTxtNik().getText().trim().isEmpty()) {
            int nik = Integer.parseInt(frame.getTxtNik().getText());
            implUser.delete(nik);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan dihapus");
        }
    }
    
    public  void isiTableCariNama() {
        lb = implUser.getCariNama(frame.getTxtSearchName().getText());
        TabelModelUser tmb = new TabelModelUser(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void carinama() {
        if (!frame.getTxtSearchName().getText().trim().isEmpty()) {
            implUser.getCariNama(frame.getTxtSearchName().getText());
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(frame, "Silahkan Pilih Data");
        }
    }
}
