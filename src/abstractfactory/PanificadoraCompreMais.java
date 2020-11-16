package abstractfactory;
/**
 *
 * @author Leocassio
 */
public class PanificadoraCompreMais implements PanificadoraAbstrata{

    @Override
    public BoloChocolate criarBoloChocolate() {
        return new Chocolate();
    }

    @Override
    public BoloMilho criarBoloMilho() {
        return new Milho();
    }
    
}
