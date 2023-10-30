package exercicio_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

abstract class Premiacao {
    public abstract void calcularPremio();
}

class PremiacaoAmador extends Premiacao {
    private List<Amador> atletasAmadores;

    public PremiacaoAmador(List<Amador> atletasAmadores) {
        this.atletasAmadores = atletasAmadores;
    }

    @Override
    public void calcularPremio() {
        for (Amador amador : atletasAmadores) {
            
        }
    }
}

class PremiacaoProfissional extends Premiacao {
    private List<Profissional> atletasProfissionais;

    public PremiacaoProfissional(List<Profissional> atletasProfissionais) {
        this.atletasProfissionais = atletasProfissionais;
    }

    @Override
    public void calcularPremio() {
        for (Profissional profissional : atletasProfissionais) {
            
        }
    }
}

class PremiacaoDeficiente extends Premiacao {
    private List<Deficiente> atletasDeficientes;

    public PremiacaoDeficiente(List<Deficiente> atletasDeficientes) {
        this.atletasDeficientes = atletasDeficientes;
    }

    @Override
    public void calcularPremio() {
        for (Deficiente deficiente : atletasDeficientes) {
      
        }
    }
}