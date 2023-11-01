package com.example.alco;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.List;

public class AlcoController {


    @FXML
    protected void click() {
        System.out.println("test");
        SQLconnect ex = new SQLconnect();
        ex.testConnection();
    }

    @FXML
    private TableView<Drinks> table;


    @FXML
    void reLoadDB(ActionEvent event) {
        try {
            Object DrinksProcess;
            List<Drinks> lst = DrinksProcess.readDrinks();
            List<Object> alcohol;
            alcohol.clear();
            alcohol.addAll(lst);

        } catch (Exception e) {
            System.out.println("ошибка чтения " + e.getMessage());
        }
    }

    @FXML
    void dell(ActionEvent event) {

    }

    @FXML
    void saveToDB(ActionEvent event) {

    }

    @FXML
    void tf1(ActionEvent event) {

    }

    @FXML
    void tf2(ActionEvent event) {

    }

    @FXML
    void tf3(ActionEvent event) {

    }

    @FXML
    void tf4(ActionEvent event) {

    }

    @FXML
    void tf5(ActionEvent event) {

    }

    @FXML
    void tf6(ActionEvent event) {

    }

    @FXML
    void tf7(ActionEvent event) {

    }

    @FXML
    void tf8(ActionEvent event) {


        ObservableList<Drinks> alcohol = FXCollections.observableArrayList();

        public void initialize() {
            {
            table.setItems(alcohol);
            TableColumn<Drinks, String> col1 = new TableColumn<>("label");
            col1.setCellValueFactory(new PropertyValueFactory<>("label"));
            table.getColumns().add(col1);
            TableColumn<Drinks, Integer> col2 = new TableColumn<>("id");
            col2.setCellValueFactory(new PropertyValueFactory<>("id"));
            table.getColumns().add(col2);
            TableColumn<Drinks, AlcoCategory> col3 = new TableColumn<>("category");
            col3.setCellValueFactory(new PropertyValueFactory<>("category"));
            table.getColumns().add(col3);
            TableColumn<Drinks, String> col4 = new TableColumn<>("subcategory");
            col4.setCellValueFactory(new PropertyValueFactory<>("subcategory"));
            table.getColumns().add(col4);
            TableColumn<Drinks, String> col5 = new TableColumn<>("country");
            col5.setCellValueFactory(new PropertyValueFactory<>("country"));
            table.getColumns().add(col5);
            TableColumn<Drinks, Integer> col6 = new TableColumn<>("level");
            col6.setCellValueFactory(new PropertyValueFactory<>("level"));
            table.getColumns().add(col6);
            TableColumn<Drinks, Integer> col7 = new TableColumn<>("sugar");
            col7.setCellValueFactory(new PropertyValueFactory<>("sugar"));
            table.getColumns().add(col7);
            TableColumn<Drinks, Integer> col8 = new TableColumn<>("yearproduction");
            col8.setCellValueFactory(new PropertyValueFactory<>("yearproduction"));
            table.getColumns().add(col8);
            TableColumn<Drinks, Integer> col9 = new TableColumn<>("cask");
            col9.setCellValueFactory(new PropertyValueFactory<>("cask"));
            table.getColumns().add(col9);

            //дорисовать столбец с кнопкой
            TableColumn buttonCol = new TableColumn("Button");
            buttonCol.setCellValueFactory(new PropertyValueFactory<>("id"));
            Callback<TableColumn<Drinks, Integer>, TableCell<Drinks, Integer>> cellFactory =
                    new Callback<>() {
                        @Override
                        public TableCell call(final TableColumn<Drinks, Integer> param) {
                            final TableCell<Drinks, Integer> cell = new TableCell<>() {

                                final Button btn = new Button("dell");

                                @Override
                                public void updateItem(Integer item, boolean empty) {
                                    super.updateItem(item, empty);
                                    if (empty) {
                                        setGraphic(null);
                                        setText(null);
                                    } else {
                                        setGraphic(btn);
                                        btn.setOnAction(event -> {
                                            // System.out.println("надо удалять что-то");
                                            // System.out.println(item);
                                            try {
                                                Object DrinkProcess;
                                                DrinkProcess.dellDrinks(item);
                                                //КАК узнать ссылку на данный Liquer ??
                                            } catch (SQLException e) {
                                                System.out.println("опять ошибка удаления");
                                            }
                                        });
                                        setText(null);
                                    }
                                }
                            };
                            return cell;
                        }
                    };

            buttonCol.setCellFactory(cellFactory);
            table.getColumns().add(buttonCol);

        }
        @FXML
        void saveToDB (ActionEvent event)Object 
                DrinksProcess = new Object();
        {
            try {
                int id = 2;
                String l = String.valueOf(label.getText());
                AlcoCategory c = AlcoCategory.valueOf(category.getText());
                String s = String.valueOf(subcategory.getText());
                String cn = String.valueOf(country.getText());
                Float st = Integer.parseInt(strength.getText());
                Float sg = Integer.parseInt(sugar.getText());
                Integer y = Integer.parseInt(yearproduction.getText());
                Integer a = Integer.parseInt(cask.getText());

                Drinks t = new Drinks(id, l, c, s, cn, st, sg, y, a);
                DrinksProcess.toString(t);

            } catch (Exception e) {
                System.out.println("ошибка записи " + e.getMessage() + " " + e.getStackTrace());
            }
        }

        @FXML
        void reloadFromBD () {
            try {
                List<Drinks> lst = DrinksProcess.readDrinks();
                alcohol.clear();
                alcohol.addAll(lst);

            } catch (Exception e) {
                System.out.println("ошибка чтения " + e.getMessage());
            }
        }

        @FXML
        void onKeyPressed (KeyEvent event){
            if (event.getCode().toString().equals("DELETE")) {
                System.out.println("надо удалять");
                int i = table.getSelectionModel().getSelectedItem().getId();
                System.out.println("удалять объект с номером " + i);
                try {
                    DrinksProcess.delDrinks(i);
                } catch (SQLException ex) {
                    System.out.println("ошибка при удалении " + ex);
                }
                alcohol.remove(table.getSelectionModel().getSelectedItem());
            }
        }
    }
}
