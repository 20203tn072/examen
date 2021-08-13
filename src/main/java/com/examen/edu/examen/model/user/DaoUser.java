package com.examen.edu.examen.model.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoUser {
    private Connection con;
    private CallableStatement cstm;
    private ResultSet rs;
    final private Logger CONSOLE = LoggerFactory.getLogger(DaoUser.class);

    public List<BeanUser> findAll(){
        List<BeanUser> listUsers = new ArrayList<>();

                BeanUser beanUser = new BeanUser();

                beanUser.getName();
                beanUser.getPrimer_apellido();
                beanUser.getSegundo_apellido();
                beanUser.getPokemon();

                listUsers.add(beanUser);

        return listUsers;
    }


    public boolean create(BeanUser beanUser){
        boolean flag = false;

            beanUser.setName(beanUser.getName());
            beanUser.setPrimer_apellido(beanUser.getPrimer_apellido());
            beanUser.setSegundo_apellido(beanUser.getSegundo_apellido());
            beanUser.setPokemon(beanUser.getPokemon());

            flag = true;

        return flag;
    }

    public boolean update(BeanUser beanUser){
        boolean flag = false;

            beanUser.setName(beanUser.getName());
            beanUser.setPrimer_apellido(beanUser.getPrimer_apellido());
            beanUser.setSegundo_apellido(beanUser.getSegundo_apellido());
            beanUser.setPokemon(beanUser.getPokemon());

            flag = true;

        return flag;
    }

    public boolean delete(String name) {

        return false;
    }
}
