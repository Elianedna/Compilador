/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constantes;

/**
 *
 * @author watel
 */
public class Constantes
{
    public String lexema;
    public String token;
    public int linha = 0;

    public Constantes(String lexema, String token, int linha) 
    {
        this.lexema = lexema;
        this.token = token;
        this.linha = linha;
    }
    
}
