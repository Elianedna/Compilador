/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import constantes.Const;
import constantes.File;
import java.io.IOException;
import lexico.TOKEN;

/**
 *
 * @author watel
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {

            File ficheiro = new File("input.txt");
            Const token;

            System.out.println("Lexema\t\t\tToken");
            do
            {
                token = ficheiro.leitor();
                System.out.println(token.lexema + "\t\t\t" + token.token);

            }
            while (!token.token.equals(TOKEN.TOKEN_END));
            ficheiro.close();
        }
        catch (IOException ex)
        {
            System.out.println("Impossivel Abrir o Ficheiro!!!");
        }
    }
}
