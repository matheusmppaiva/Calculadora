package br.inatel.matheus;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperacoesTeste {

    @Test
    public void Testsoma(){
        double a, b;
        Operacoes op = new Operacoes();
        a = 10;
        b = 5;
        double soma;

        soma = op.soma(a,b);

        assertEquals(15, soma, 0.1);

    }

    @Test
    public void Testsubtrai(){
        double a, b;
        Operacoes op = new Operacoes();
        a = 10;
        b = 5;
        double sub;

        sub = op.subtrai(a,b);

        assertEquals(5, sub, 0.1);

    }

    @Test
    public void Testmultiplica(){
        double a, b;
        Operacoes op = new Operacoes();
        a = 10;
        b = 5;
        double mult;

        mult = op.multiplica(a,b);

        assertEquals(50, mult, 0.1);

    }


}
