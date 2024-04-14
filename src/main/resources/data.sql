insert into livro (id, titulo, autor, anoPublicacao)
values  (1, 'Harry Potter e a Pedra Filosofal', 'J.K. Rowling', 1999),
        (2, 'Harry Potter e a Câmara Secreta', 'J.K. Rowling', 2000),
        (3, 'Harry Potter e o Prisioneiro de Azkaban', 'J.K. Rowling', 2001);

insert into membro (id, nome, endereco, telefone)
values  (1, 'Mario', 'Rua Dom Jaime, 95', '+111222333'),
        (2, 'Luiz', 'Rua dos Ipes, 53', '+111222333'),
        (3, 'Romeu', 'Rua das Bandeiras, 44', '+111222333');

insert into bibliotecario (id, nome, email, senha)
values  (1, 'Ana Paula', 'ana.paula@email.com', '11223344')

insert into visitante (id, nome, telefone)
    values  (1, 'Jorge de Jesus', '+111222333'),
        (2, 'Marcos Silveira', '+111222333'),
        (3, 'Joaquim Nascimento', '+111222333');

insert into emprestimos (id, livro_id, membro_id, dataEmprestimo, dataDevolucao)
values  (1, 1, 1, '2023-10-05', '2023-11-04'),
        (2, 2, 2, '2023-12-01', '2024-01-02'),
        (3, 3, 3, '2024-01-10', '2024-02-09');

insert into emprestimos (id, livro_id, membro_id, dataEmprestimo)
values  (1, 1, 1, '2023-10-05'),
        (2, 2, 2, '2023-12-01')