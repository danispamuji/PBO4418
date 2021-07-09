/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.*;
/**
 *
 * @author acer
 */
public interface IUser {
    public void insert(User b);
    public void update(User b);
    public void delete(int id);
    public List<User> getAll();
    public List<User> getCariNama(String nama);    
}
