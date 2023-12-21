/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author Acer
 */
public class Utilities {
    
    public String trimStr(String name, int price, String separator) {
        String res = name;
        int wordLength = name.length();
        if (wordLength < price) {
            for (int i = wordLength; i < price; i++) {
                res += separator;
            }
        }
        return res;
    }
}
