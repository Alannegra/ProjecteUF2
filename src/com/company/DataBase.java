package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static final String url = "jdbc:sqlite:database.db";

    static DataBase instance;
    static Connection connection;

    public static DataBase get(){
        if(instance == null){
            instance = new DataBase();

            try {
                connection = DriverManager.getConnection(url);
                instance.createTables();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return instance;
    }

    void deleteTables(){
        try (Statement statement = connection.createStatement()) {
            statement.execute("DROP TABLE IF EXISTS estudiantes");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void createTables(){
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS estudiantes (name text, telefon real)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertContact(String name, String telefon) {
        String sql = "INSERT INTO estudiantes(name,telefon) VALUES(?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, telefon);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean deletethings(String name, String telefon){
        String sql = "DELETE from estudiantes where name = ? and telefon = ?";

        try {

            PreparedStatement preparedStmt = connection.prepareStatement(sql);
            preparedStmt.setString(1, name);
            preparedStmt.setString(2, telefon);
            preparedStmt.execute();
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
            return true;
    }







    

    public List<Contact> selectContacts(){
        String sql = "SELECT name, telefon FROM estudiantes";

        List<Contact> contacts = new ArrayList<>();
        try (PreparedStatement preparedStatement  = connection.prepareStatement(sql)){

            ResultSet resultSet  = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String telefon = resultSet.getString("telefon");

                contacts.add(new Contact(name, telefon));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return contacts;
    }

    public List<Contact> selectContactsConNombre(String nameABuscar){
        String sql = "SELECT name, telefon FROM estudiantes WHERE name LIKE ?";

        List<Contact> Contacts = new ArrayList<>();
        try (PreparedStatement preparedStatement  = connection.prepareStatement(sql)){

            preparedStatement.setString(1, nameABuscar);
            ResultSet resultSet  = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String telefon = resultSet.getString("telefon");

                Contacts.add(new Contact(name, telefon));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return Contacts ;
    }
}