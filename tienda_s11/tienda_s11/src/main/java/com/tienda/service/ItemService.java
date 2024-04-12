package com.tienda.service;

import com.tienda.domain.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jojul
 */
public interface ItemService {

    List<Item> listaItems = new ArrayList<>();

    public List<Item> get(); //vamos a obtener todos los items.

    //Recuperar el registro que tiene el IdItem pasado por parametro.    
    //Vamos a obtenerlo por medio del Item = IdItem.
    public Item get(Item item);

    //Aquí eliminamos los Item por medio de su Id
    public void delete(Item item);

    public void save(Item item);

    public void actualiza(Item item);

    public void facturar();

}
