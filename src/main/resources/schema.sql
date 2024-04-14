create database if not exists biblioteca;

CREATE TABLE public.bibliotecario (
                                      id bigserial NOT NULL,
                                      email varchar(255) NOT NULL,
                                      nome varchar(255) NOT NULL,
                                      senha varchar(255) NOT NULL,
                                      CONSTRAINT bibliotecario_pkey null
);

CREATE TABLE public.livro (
                              id bigserial NOT NULL,
                              ano_publicacao int4 NOT NULL,
                              autor varchar(255) NOT NULL,
                              titulo varchar(255) NOT NULL,
                              CONSTRAINT livro_pkey null
);

CREATE TABLE public.membro (
                               id bigserial NOT NULL,
                               endereco varchar(255) NOT NULL,
                               nome varchar(255) NOT NULL,
                               telefone varchar(255) NOT NULL,
                               CONSTRAINT membro_pkey null
);

CREATE TABLE public.visitante (
                                  id bigserial NOT NULL,
                                  nome varchar(255) NOT NULL,
                                  telefone varchar(255) NOT NULL,
                                  CONSTRAINT visitante_pkey null
);

CREATE TABLE public.emprestimo (
                                   id bigserial NOT NULL,
                                   data_devolucao timestamp(6) NULL,
                                   data_emprestimo timestamp(6) NOT NULL,
                                   livro_id int8 NOT NULL,
                                   membro_id int8 NOT NULL,
                                   CONSTRAINT emprestimo_pkey null,
                                   CONSTRAINT fklraqo5mkov260qr5h3es93sgr FOREIGN KEY (livro_id) REFERENCES public.livro(id),
                                   CONSTRAINT fkphy0kpewrd59eiwuam1mb47xo FOREIGN KEY (membro_id) REFERENCES public.membro(id)
);