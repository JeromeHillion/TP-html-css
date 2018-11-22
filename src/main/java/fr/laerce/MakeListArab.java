package fr.laerce;

import java.util.ArrayList;
import java.util.List;

public class MakeListArab{
    List<IndexCarEntity> listarab;

    public MakeListArab() {
        this.listarab = new ArrayList<>(1506);
        for (int i = 0; i<256; i++){
            IndexCarEntity indexCarEntity = new IndexCarEntity(i, "&#"+i+";");


        }
    }

    public List<IndexCarEntity> getListarab() {
        return listarab;
    }

}
