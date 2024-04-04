create table ingrediente
(
    id   UUID PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

create table ingrediente_sabor
(
    id_sabor       UUID PRIMARY KEY,
    id_ingrediente UUID NOT NULL
);

create table sabor
(
    id   UUID PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

create table tamanho
(
    id    UUID PRIMARY KEY,
    nome  VARCHAR(255)  NOT NULL,
    valor DECIMAL(6, 2) NOT NULL
);

create table pizza
(
    id         UUID PRIMARY KEY,
    id_tamanho UUID NOT NULL,
    quantidade INT  NOT NULL
);

create table item_pedido
(
    id_pizza  UUID          NOT NULL,
    id_pedido UUID          NOT NULL,
    valor     DECIMAL(6, 2) NOT NULL
);

create table pedido
(
    id     UUID PRIMARY KEY,
    codigo VARCHAR(10)  NOT NULL,
    status VARCHAR(255) NOT NULL
);



