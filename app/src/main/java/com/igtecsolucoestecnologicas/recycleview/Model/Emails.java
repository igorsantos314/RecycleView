package com.igtecsolucoestecnologicas.recycleview.Model;

import java.util.Arrays;
import java.util.List;

public class Emails {

    public static List<Email> fakeEmails(){

        return Arrays.asList(
                Email.EmailBuilder.builder()
                        .setUser("Irineu Silva")
                        .setSubject("Novas funções estão disponiveis na nossa plataforma")
                        .setPreview("Venha nos conhecer")
                        .setDate("02 fev").build(),

                Email.EmailBuilder.builder()
                        .setUser("Igor Santos")
                        .setSubject("Novas funções estão disponiveis na nossa plataforma")
                        .setPreview("Inovamos a cada dia")
                        .setUnread(true)
                        .setDate("05 mar").build(),

                Email.EmailBuilder.builder()
                        .setUser("Maria Aparecida")
                        .setSubject("Novas funções estão disponiveis na nossa plataforma")
                        .setPreview("Parabéns por completar 10 anos em novassa plataforma")
                        .setDate("20 jun").build(),

                Email.EmailBuilder.builder()
                        .setUser("Ellen Alta Nascimento")
                        .setSubject("Novas funções estão disponiveis na nossa plataforma")
                        .setPreview("Temos novidades")
                        .setStared(true)
                        .setDate("21 dez").build()
        );

    }

}
