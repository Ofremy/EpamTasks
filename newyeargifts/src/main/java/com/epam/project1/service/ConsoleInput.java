package com.epam.project1.service;


import com.epam.project1.service.myexception.WrongNumberInputException;
import com.epam.project1.view.ConsoleView;
import com.epam.project1.view.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Orest
 * 24.11.2017
 * Java Version 1.8.
 */
public class ConsoleInput {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public double getDouble(ConsoleView view,String message){
        while (true){
            try {
                view.printMessage(message);
                return Double.parseDouble(reader.readLine());
            }catch (NumberFormatException e){
                view.printMessage(ResourceManager.INSTANCE.getString(Constants.WrongInput.WRONG_NUMBER_INPUT));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public String getInputString(ConsoleView view,String message) {
        while (true) {
            try {
                view.printMessage(message);
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int getNumberCase(ConsoleView consoleView,int from,int to) {
        while (true) {
            try {
                int number = Integer.parseInt(reader.readLine());
                if (number >= from && number <= to) {
                    return number;
                } else throw new WrongNumberInputException();
            } catch (IOException e) {
                consoleView.printMessage(Arrays.toString(e.getStackTrace()));
            }catch (NumberFormatException e){
                consoleView.printMessage(ResourceManager.INSTANCE.getString(Constants.WrongInput.WRONG_NUMBER_INPUT));
            }
            catch (WrongNumberInputException e) {
                consoleView.printMessage(e.getMessage());
            }
        }
    }
}
