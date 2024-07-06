/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import analisadorLexico.AnalisadorLexico;
import constantes.Constantes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author watel
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    
    public static String ler() throws FileNotFoundException, IOException{
    String conteudo =""; 
    File ficheiro = new File("input.txt");
            if (!ficheiro.exists())
            {
                System.out.println("O arquivo n existe ");
                return conteudo;
            }
            
            FileInputStream fis = new FileInputStream(ficheiro);
            int letra;
            while ((letra = fis.read())!=-1)
            {            
            conteudo += (char) letra;
            }
            fis.close();
            
            return conteudo;
    }
        
    public static void main(String[] args)
    {
        try
        {

            System.out.println("Lexema\t\t\tToken\t\t\tLinha");
//           
        AnalisadorLexico analisador = new AnalisadorLexico(Main.ler());
        
 
        for( Constantes a : analisador.lerSimbolos()){
            
            System.out.println(a.lexema + "\t\t\t" + a.token + "\t\t\t" + a.linha);
            
         
        }
        }
        catch (IOException ex)
        {
            System.out.println("Impossivel Abrir o Ficheiro!!!");
        }
    }
}
