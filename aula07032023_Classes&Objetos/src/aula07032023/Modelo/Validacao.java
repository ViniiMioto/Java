package aula07032023.Modelo;

import javax.swing.tree.ExpandVetoException;

public class Validacao
{
    public String numero1;
    public String numero2;
    public String mensagem;
    public Double num1;
    public Double num2;
    
    public void validar()
    {
        mensagem = "";
        try
        {
            num1 = Double.valueOf(numero1);
            num2 = Double.valueOf(numero2);
        }
        catch(Exception e)
        {
            mensagem = "Erro na validação";
        }
    }
         
    
}
