package com.example.karatsubfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.example.karatsubfx.Karatsuba;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


public class HelloController {
    @FXML
    private Label welcomeText;


    @FXML
    TextField number1;

    @FXML
    TextField number2;

    long n1;
    long n2;

    @FXML
    protected void onCalculateButtonClick() throws IOException {
        Karatsuba kts = new Karatsuba();
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();
//        try{
//            n1 = BigInteger.parseBigInteger(number1.getText());
//            n2 = Long.parseLong(number2.getText());

            String product = String.valueOf(kts.multiply(A,B));
//            if(product.length()>19 || kts.multiply(n1,n2)<0){
//                welcomeText.setText ("inputted numbers or value is very big ");
//            }else{
                welcomeText.setText (product);
//            }
//
//        }catch(NumberFormatException e){
//            welcomeText.setText ("please input only Integer type numbers ");
//        }catch(NullPointerException e){
//            welcomeText.setText ("this inputs cant be null ");
//        }


    }
}