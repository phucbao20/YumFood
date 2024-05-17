/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;

/**
 *
 * @author space
 */
public interface YumFoodDAO <Entity, Key>{
    abstract public void insert(Entity entity);
    abstract public void update(Entity entity);
    abstract public void delete(Key k);
    abstract public List <Entity> selectAll();
    abstract public Entity SelectByID(Key id);
    abstract public List<Entity> selectBySQL(String sql, Object...args);
}
