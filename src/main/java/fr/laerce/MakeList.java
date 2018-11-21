package fr.laerce;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeList {
List<IndexCarEntity> les256premiers;

    public MakeList() {
        this.les256premiers = new ArrayList<>(256);
        for (int i = 0; i<256; i++){
            IndexCarEntity indexCarEntity = new IndexCarEntity(i, "&#"+i+";");


        }
    }

    public List<IndexCarEntity> getLes256premiers() {
        return les256premiers;
    }
}


