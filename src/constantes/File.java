/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constantes;

/**
 *
 * @author watel
 */
import java.io.*; 


public class File
{

    private char caracter; 
    private FileReader file;//vai ler cada caracter do ficheiro;
    PalavrasChaveJava keywords = new PalavrasChaveJava();
    private int nextChar;
    public File(String filename) throws FileNotFoundException, IOException
    {
        file = new FileReader(filename);
        caracter = (char) file.read();
    }

    public int proximoSimbolo() throws IOException
    {
        int proximo = file.read();
        return proximo;
    }

    public Constantes leitor()
    {
        try
        {

            int estado = 0;
             
            StringBuilder lexema = new StringBuilder();
            
            while (caracter != ' ')
            {
                switch (estado)
                {
                    case 0:
                        if (caracter == ' ' || caracter == '\n')
                        {
                            estado = 0;
                        }
                        else if (caracter == '(')
                        {
                            lexema.append(caracter);
                            estado = 1;
                        }
                        else if (caracter == ')')
                        {
                            lexema.append(caracter);
                            estado = 2;
                        }
                        else if (caracter == ';')
                        {
                            lexema.append(caracter);
                            estado = 3;
                        }
                        else if (caracter == '{')
                        {
                            lexema.append(caracter);
                            estado = 4;
                        }
                        else if (caracter == '}')
                        {
                            lexema.append(caracter);
                            estado = 5;
                        }

                        else if (caracter == '.')
                        {
                            estado = 6;
                        }

                        else if (caracter == '^')
                        {
                            estado = 7;

                        }

                        else if (caracter == ',')
                        {
                            lexema.append(caracter);
                            estado = 8;
                        }

                        else if (caracter == '«')
                        {
                            estado = 9;
                        }

                        else if (caracter == '+')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == '=')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 10;
                            }
                            else if (nextChar == '+')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 11;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 12;
                            }

                        }

                        else if (caracter == '-')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == '=')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 13;
                            }
                            else if (nextChar == '-')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 14;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 15;
                            }
                        }
                        else if (caracter == '*')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == '=')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 16;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 17;
                            }

                        }
                        else if (caracter == '/')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == '=')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 18;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 19;
                            }

                        }
                        else if (caracter == '<')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == '=')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 20;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 21;
                            }

                        }
                        else if (caracter == '>')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == '=')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 22;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 23;
                            }
                        }
                        else if (caracter == '=')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == '=')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 24;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 25;
                            }

                        }

                        else if (caracter == '%')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == '=')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 26;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 27;
                            }
                        }

                        else if (caracter == '&')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == '&')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 28;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 29;
                            }
                        }

                        else if (caracter == '|')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == '|')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 30;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 31;
                            }
                        }

                        else if (caracter == '!')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == '=')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 32;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 33;
                            }
                        }

                        else if (caracter == '?')
                        {
                            nextChar = (char) proximoSimbolo();
                            if (nextChar == ':')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 34;
                            }
                            else
                            {
                                System.out.println("token inexistente");
                            }
                        }

                        else if (caracter == ':')
                        {

                            nextChar = (char) proximoSimbolo();
                            if (nextChar == ':')
                            {
                                lexema.append(caracter);
                                lexema.append(nextChar);
                                estado = 35;
                            }
                            else
                            {
                                lexema.append(caracter);
                                estado = 36;
                            }
                        }

                        else if (Character.isDigit(caracter))
                        {
                            lexema.append(caracter);
                            nextChar = (char) proximoSimbolo();
                            while (Character.isDigit(nextChar))
                            {
                                lexema.append(nextChar); 
                                nextChar = (char) proximoSimbolo();
                            }
                            if (nextChar == '.')
                            {
                                lexema.append(nextChar);
                                nextChar = (char) proximoSimbolo();
                                while (Character.isDigit(nextChar))
                                {
                                    lexema.append(nextChar); 
                                    nextChar = (char) proximoSimbolo();
                                }
                            }
                            estado = 37;
                        }

                        else if (Character.isAlphabetic(caracter))
                        {

                            lexema.append(caracter);
                            caracter = '\0';
                            nextChar = (char) proximoSimbolo();
                            while ((Character.isAlphabetic(nextChar) || Character.isDigit(nextChar) || nextChar == '_') && nextChar != ' ')
                            {
                                lexema.append(nextChar);
                                nextChar = (char) proximoSimbolo();
                            }

                            
                            for (String word : keywords.palavrasChaveJava)
                            {
                                if (lexema.toString().equals(word))
                                {
                                    return new Constantes(lexema.toString(), TOKEN.TOKEN_KW);
                                }
                            }
                            
                            estado = 38;

                        }
                        break;

                    case 1:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_AP);
                    case 2:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_FP);
                    case 3:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_PVG);
                    case 4:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_AC);
                    case 5:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_FC);
                    case 6:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_P);
                    case 7:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_CIR);
                    case 8:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_VG);
                    case 9:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_BESQ);
                    case 10:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_AMAIS);
                    case 11:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_INCRE);
                    case 12:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_MAIS);
                    case 13:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_AMENOS);
                    case 14:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_DECRE);
                    case 15:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_MENOS);
                    case 16:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_AVEZES);
                    case 17:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_AST);
                    case 18:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_ADIV);
                    case 19:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_BARRA);
                    case 20:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_MAIORI);
                    case 21:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_MAIOR);
                    case 22:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_MENORI);
                    case 23:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_MENOR);
                    case 24:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_IGUALI);
                    case 25:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_IGUAL);
                    case 26:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_MODI);
                    case 27:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_MOD);
                    case 28:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_AND);
                    case 29:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_ANDb);
                    case 30:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_OR);
                    case 31:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_ORb);
                    case 32:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_DIF);
                    case 33:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_NEG);
                    case 34:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_OPTER);
                    case 35:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_OPREF);
                    case 36:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_DP);
                    case 37:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_NUMERO);

                    case 38:
                        return new Constantes(lexema.toString(), TOKEN.TOKEN_ID);

                }

                caracter = (char) file.read();
            }

        }
        catch (IOException ex)
        {

            System.out.println("Erro ao ler os simbolos!" + ex.getMessage());
        }
        return new Constantes( "", TOKEN.TOKEN_END);
    }
    
    public void close() throws IOException {
        file.close();
    }
}
 