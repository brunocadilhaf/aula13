package pacote2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import pacote3.Acelerador;
import pacote3.Autenticador;
import pacote3.Carro;
import pacote3.ComparadorCpf;
import pacote3.ComparadorSobrenomeNome;
import pacote3.Contem2Predicado;
import pacote3.Motorista;
import pacote3.Passageiro;
import pacote3.Pessoa;
import pacote3.Viagem;

public class App {
    public static void main(String[] args) throws Exception {
        // Carro car = new Carro("ABC1234", 456789);
        // Motorista mot = new Motorista(car);

        // System.out.println("Passageiro: Motorista, acelera o carro até 100km/h");
        // System.out.println("Motorista: Ok! Vamos lá!");

        // mot.acelerar(100);
        // System.out.printf("Velocidade do carro: %s km/h", car.getVelocidadeAtual());

        // Motorista mot = new Motorista("Leandro", 123456);
        // Carro car = new Carro(mot);
        // try {
        //     car.setPlaca(null);
        //     System.out.println("Passageiro: Motorista, acelera o carro até 100km/h");
        //     System.out.println("Motorista: Ok! Vamos lá!");

        //     car.getMotorista().acelerar(100);
        //     System.out.println(car.getPlaca());

        //     System.out.printf("Velocidade do carro: %s km/h", car.getVelocidadeAtual());
        // } catch (InputMismatchException ex) {
        //     System.out.println(ex.getMessage());
        //     System.out.println("Programa encerrado");
        //     return;
        // } catch (NullPointerException ex) {
        //     System.out.println(ex.getMessage());
        //     System.out.println("O programa continuará com a placa ABC1234");
        //     car.setPlaca("ABC1234");
        // }

        //Acelerador[] aceleradores = new Acelerador[3];
       // Motorista mot = new Motorista("João", 12345);

       // aceleradores[0] = new Carro("ABC1234", 3121212, mot);
       // aceleradores[1] = new Carro("DEF5678", 31113, mot);
        //aceleradores[2] = mot;

        //for (Acelerador a: aceleradores) {
        //    System.out.printf("Chamada do método em objeto do tipo %s", a.getClass().getSimpleName());
        //    System.out.printf(" - Velocidade atual: %d\n", a.acelerar());
       // }

            // Autenticador aut = new Autenticador();

            // Motorista mot = new Motorista("João", 12345);

            // if (aut.autenticar(mot)){

            //     System.out.println("Acesso autorizado");

            // }

            // else{

            //     System.out.println("Acesso não autorizado");

            // }

            // Carro car = new Carro("ABC1234", 565656, new Motorista("Maria", 1209));

            // if (aut.autenticar(car)){

            //     System.out.println("Acesso autorizado");
                
            // }

            // else {

            //     System.out.println("Acesso não autorizado");

            // }

        // List <Pessoa> pessoas = new ArrayList<>();
        // pessoas.add(new Passageiro("Passageiro 1" , "1234567890"));
        // pessoas.add(new Passageiro("Passageiro 2" , "9876543210"));
        // pessoas.add(new Motorista("Motorista 1"  , "8976543210"));
    
        // System.out.println("Total de pessoas: " + pessoas.size());

        // if (pessoas.contains(new Motorista("Motorista 2" , "3456789012"))){
        //     System.out.println("Ja existe pessoa com este cpf!!");
        // }

        // else {
        //     System.out.println("Pessoa não localizada!!");
        // }

        // Pessoa p = pessoas.remove(1);
        // System.out.printf("A pessoa %s foi removida! A lista agora possui %d pessoas. \n"
        //     ,  p.getNome(),pessoas.size());

        // System.out.println("Pessoas da lista: ");
        // for(Pessoa pes : pessoas ){
        //     System.out.printf("Nome: %s - Cpf: %s - Tipo: %s \n" 
        //     , pes.getNome() , pes.getCpf() , pes.getClass().getSimpleName());
        // }
        
        // List<Pessoa> pessoas = new ArrayList<>();
        // pessoas.add(new Motorista("Motorista 1", "1234567890", 29));
        // pessoas.add(new Motorista("Motorista 2", "1512425151", 25));
        // pessoas.add(new Passageiro("Passageiro 1", "87519175851", 33));
        // pessoas.add(new Passageiro("Passageiro 2", "25736375853", 40));        
        // pessoas.add(new Motorista("Motorista 3", "78316712467", 36));

        // IntSummaryStatistics resumo = pessoas.stream()
        //     .collect(Collectors.summarizingInt(Pessoa::getIdade));

        // System.out.println(resumo);

        // System.out.println("Ordenação original:");
        // for (Pessoa p : pessoas) {
        //     System.out.printf("%s - %s\n", p.getNome(), p.getCpf());
        // }

        // System.out.println("Lista filtrada:");
        // pessoas.stream()
        //     .filter(p -> p.getCpf().contains("5"))
        //     .forEach(p -> 
        //         System.out.printf("%s - %s\n", p.getNome(), p.getCpf()));

        // pessoas.forEach(p -> 
        //     System.out.printf("%s - %s\n", p.getNome(), p.getCpf()));


        
        //pessoas.sort(new ComparadorCpf());
        //pessoas.sort(new ComparadorSobrenomeNome());

        //pessoas.removeIf(new Contem2Predicado());
        // pessoas.removeIf(p -> p.getNome().contains("2"));

        // pessoas.sort(null);

        // System.out.println("Ordenação por Comparable implementada em pessoa:");
        // for (Pessoa p : pessoas) {
        //     System.out.printf("%s - %s\n", p.getNome(), p.getCpf());
        // }


        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // List<Viagem> viagens = obterDados();

        // Map<LocalDate, List<Viagem>> viagensData = 
        //     viagens.stream().collect(Collectors.groupingBy(Viagem::getData));

        // viagensData.entrySet().forEach(
        //   item -> System.out.printf("Dia %s - Viagens: %s\n",
        //     item.getKey().format(df), item.getValue())  
        // );

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Viagem> viagens = obterDados();

        Map<LocalDate, Double> valoresMedios =
            viagens.stream().collect(Collectors.groupingBy(Viagem::getData, Collectors.averagingDouble(Viagem::getValor)));

        valoresMedios.entrySet().forEach(
          item -> System.out.printf("Data %s - Valor médio do dia: %.2f\n",
            item.getKey().format(df), item.getValue())  
        );

    }

    private static List<Viagem> obterDados() {
        List<Viagem> viagens = new ArrayList<>();
        viagens.add(new Viagem(
            LocalDate.parse("2022-10-09"),
            new Motorista("Motorista 1", "812791496128", 29),
            new Passageiro("Passageiro 1", "221412412412", 20),
            122));
        
        viagens.add(new Viagem(
            LocalDate.parse("2022-10-09"),
            new Motorista("Motorista 2", "812791496128", 29),
            new Passageiro("Passageiro 2", "221412412412", 20),
            28.20));

        viagens.add(new Viagem(
            LocalDate.parse("2022-10-10"),
            new Motorista("Motorista 3", "812791496128", 29),
            new Passageiro("Passageiro 3", "221412412412", 20),
            98.23));
        
        viagens.add(new Viagem(
            LocalDate.parse("2022-10-10"),
            new Motorista("Motorista 4", "812791496128", 29),
            new Passageiro("Passageiro 4", "221412412412", 20),
            19.98));

        viagens.add(new Viagem(
            LocalDate.parse("2022-10-10"),
            new Motorista("Motorista 5", "812791496128", 32),
            new Passageiro("Passageiro 5", "221412412412", 20),
            34.20));
        
        viagens.add(new Viagem(
            LocalDate.parse("2022-10-10"),
            new Motorista("Motorista 6", "812791496128", 25),
            new Passageiro("Passageiro 6", "221412412412", 20),
            115.40));

        return viagens;
    }
}   