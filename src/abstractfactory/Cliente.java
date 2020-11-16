package abstractfactory;

/**
 *
 * @author Leocassio
 */
public class Cliente {
    public static void main(String[] args) {
        PanificadoraAbstrata panificadora = new PanificadoraCompreMais();
        BoloChocolate chocolate = panificadora.criarBoloChocolate();
        BoloMilho milho = panificadora.criarBoloMilho();
        
        chocolate.informacoesBolocChocolate();
        milho.informacoesBoloMilho();
    }
}
