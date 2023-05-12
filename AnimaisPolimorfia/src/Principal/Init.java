package Principal;

import Secundario.Animal;
import Secundario.Cachorro;
import Secundario.Gato;
import Secundario.Pato;

public class Init {
    public static void main(String[] args) {
        Animal[] animais = new Animal[4];
        animais[0] = new Animal("Animal", 1);
        animais[1] = new Cachorro("Totó", 3);
        animais[2] = new Gato("Frajola", 2);
        animais[3] = new Pato("Donald", 4);
        
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}







