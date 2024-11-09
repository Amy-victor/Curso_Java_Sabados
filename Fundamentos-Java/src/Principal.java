public class Principal {
    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro();
        c1.nome = "Bidu";
        c1.idade = 10;
        c1.sexo = 'M';
        c1.filhos = 1;
        c1.fazerBarulho();
        c1.comer();

        Cachorro c2 = new Cachorro();
        c2.nome = "Mila";
        c2.idade = 2;
        c2.sexo = 'F';
        c2.fazerBarulho();
        c2.comer();

        Gato g1 = new Gato();
        g1.nome = "Yakisoba";
        g1.idade = 4;
        g1.sexo = 'F';
        g1.filhos = 3;
        g1.fazerBarulho();
        g1.comer();


    }
}
