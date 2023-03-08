package aula07032023.Modelo;

public class Controle
{
    public Double num1 = 0.0;
    public Double num2 = 0.0;
    public Double res = 0.0;
    public String numero1;
    public String numero2;
    public String resultado;
    
    public void executar()
    {
        Validacao validacao = new Validacao();
        validacao.numero1 = numero1;
        validacao.numero2 = numero2;
        validacao.validar();
        if(validacao.mensagem.equals(""))
        {
            Calculos calculos = new Calculos();
            calculos.num1 = validacao.num1;
            calculos.num2 = validacao.num2;
            calculos.somar();
            resultado = calculos.res.toString();
        }
        else
        {
            resultado = validacao.mensagem;
        }
    }
}
