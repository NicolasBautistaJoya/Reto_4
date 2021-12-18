package com.example.reto_3.casos_uso;

import android.database.Cursor;

import com.example.reto_3.modelo.Productos;
import com.example.reto_3.modelo.Sucursales;
import com.example.reto_3.modelo.Productos;

import java.util.ArrayList;

public class CasoUsoProducto {
    public ArrayList<Productos> llenarListaProductos(Cursor cursor){
        ArrayList<Productos> list = new ArrayList<>();
        if(cursor.getCount() == 0){
            return list;
        }else{
            while (cursor.moveToNext()){
                Productos producto = new Productos(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getBlob(4)
                );
                list.add(producto);
            }
            return list;
        }
    }
}
