/* (a)
Implemente uma classe `Quadrado`, que possui um atributo 
`lado` de tipo `double`. Implemente um construtor que preenche 
o atributo `lado`. Faça com que essa classe __implemente__ a 
interface `Geometria`.
*/
public abstract class Quadrado implements Geometria {

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return this.lado;
    }

    public double setLado(){
        return this.lado;
    }


}
