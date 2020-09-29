/* (b)
Implemente uma classe `Truco` que contém como atributos dois 
`Jogador`es, um `Baralho`, uma `cartaVirada` do tipo `Carta`. 
Sua classe deve ter um construtor padrão que inicializa cada um 
desses atributos (basicamente faz `new` neles). 
Deve ter um método privado `embaralharCartas()` que chama o método 
`embaralha()` do `Baralho`, um método privado `distribuirMaos()`, 
que deve distribuir três cartas do baralho para cada jogador 
(lembre-se do método `receberCarta` de `Jogador`). 
Você também deve implementar um método `inicializaManilha()`, 
que põe uma carta na meso (distribui uma carta do baralho e atribui a 
`cartaVirada`). Esses métodos que você implementar, 
vão complementar a classe truco. 
Para sua referência, segue o método `jogar()`, 
que implementa a lógica básica do início do jogo:
*/
public class Truco {

    public static final int MAO = 3;

    private Baralho baralhoTruco;
    private Carta cartaVirada;
    private Jogador primeiroJogador;
    private Jogador segundoJogador;

    public Truco(Baralho baralho, Carta cartaVirada, Jogador primeiroJogador, Jogador segundoJogador){
        this.baralhoTruco = baralho;
        this.cartaVirada = cartaVirada;
        this.primeiroJogador = primeiroJogador;
        this.segundoJogador = segundoJogador;
    }

    private void imprimeMesa() {
        System.out.println("Apenas um placeholder para a impressão de mesa.");
        System.out.println("Você não precisa implementar esse método.");
    }

    public void jogar() {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        imprimeMesa();
    }

    private void inicializaManilha() {
        cartaVirada = baralhoTruco.distribuir();
    }

    private void distribuiMaos() {
        for(int cartas = 0; cartas < MAO; cartas++) {
            primeiroJogador.recebeCarta(this.baralhoTruco.distribuir());
            segundoJogador.recebeCarta(this.baralhoTruco.distribuir());
        }
    }

    private void embaralhaCartas() {
        baralhoTruco.embaralhar();

    }
}
