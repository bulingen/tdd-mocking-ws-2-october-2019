import java.util.List;

public class PokemonService implements IPokemonService {
    private IExternalPaymentService paymentService;

    public PokemonService() {
        this.paymentService = new ExternalPaymentService();
    }

    @Override
    public List<Pokemon> getByUser(User user) {
        return null;
    }

    @Override
    public Pokemon purchasePokemonToUser(User user) {
        return null;
    }
}
