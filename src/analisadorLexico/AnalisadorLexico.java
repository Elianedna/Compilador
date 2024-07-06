/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisadorLexico;

/**
 *
 * @author watel
 */
import constantes.Constantes;
import constantes.PalavrasChaveJava;
import constantes.TOKEN;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import main.Main;

public class AnalisadorLexico
{

    private int posicao = 1;
    private char simbolo;
    private String conteudo;
    public int linha = 1;
    public ArrayList<Constantes> lexemas = new ArrayList();
    PalavrasChaveJava palavraChave = new PalavrasChaveJava();
    char nextSimbolo;

    public AnalisadorLexico(String conteudo) throws FileNotFoundException, IOException
    {
        this.conteudo = conteudo;
        
        
    }
    

    public ArrayList<Constantes> lerSimbolos() throws IOException
    {  
        char [] conjunto = Main.ler().toCharArray();
   
        try{
            int estado = 0;
            int i=0;
            StringBuilder lexema = new StringBuilder();
            while ( i < conjunto.length)
            { 
                simbolo = ' ';
                simbolo = conjunto[i];
           
                switch (estado)
                {
                    case 0:
                      
                       if (Pattern.matches("[a-zA-Z]|_", Character.toString(simbolo)))
                       {
                           lexema.append(simbolo);
                           
                           lexemas.add(new Constantes("[a-zA-Z]|_", TOKEN.TOKEN_ID, linha));
                       }
                       else if (Pattern.matches("//d+", Character.toString(simbolo)))
                       {
                           lexema.append(simbolo);
                           
                           lexemas.add(new Constantes("//d+", TOKEN.TOKEN_NUMERO, linha));
                       }
                       else  if(simbolo == '/'){
                          lexema.append(simbolo);
                          
                          lexemas.add(new Constantes("/", TOKEN.TOKEN_BARRA, linha));
                       }
                       
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }

                 if (simbolo == '\n')
                        {
                           
                            linha++;
                            estado = 0;
                        }
                 i++;
            }

        }
        catch (Exception e)
        {
        }

        return lexemas;
    }

    public ArrayList<Constantes> getLexemas()
    {
        return lexemas;
    }

}
