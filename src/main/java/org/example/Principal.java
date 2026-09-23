package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {

        //inserir fucnionarios
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario(
                "Maria",
                LocalDate.of(2000, 10, 15),
                new BigDecimal("2000.00"),
                "Operador"
        ));

        funcionarios.add(new Funcionario(
                "João",
                LocalDate.of(1995, 5, 20),
                new BigDecimal("2500.00"),
                "Gerente"
        ));

        funcionarios.add(new Funcionario(
                "Caio",
                LocalDate.of(2001, 12, 10),
                new BigDecimal("1800.00"),
                "Operador"
        ));

        // 3.2 - Remover João
        funcionarios.removeIf(f -> f.getNome().equals("João"));

       
        }
    }
}

