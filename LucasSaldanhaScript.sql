
CREATE SEQUENCE voo_id_seq_1;

CREATE TABLE voo (
                id_voo INTEGER NOT NULL DEFAULT nextval('voo_id_seq_1'),
		id_aeronave INTEGER NOT NULL,
                rota VARCHAR NOT NULL,
                data_voo DATE NOT NULL,
                destino VARCHAR NOT NULL,
                CONSTRAINT voo_pk PRIMARY KEY (id_voo)
);


ALTER SEQUENCE voo_id_seq_1 OWNED BY voo.id_voo;

CREATE SEQUENCE aeronave_id_seq;

CREATE TABLE aeronave (
                id_aeronave INTEGER NOT NULL DEFAULT nextval('aeronave_id_seq'),
           
                nome_aeronave VARCHAR NOT NULL,
                tipo_aeronave VARCHAR NOT NULL,
                companhia VARCHAR NOT NULL,
                CONSTRAINT aeronave_pk PRIMARY KEY (id_aeronave)
);


ALTER SEQUENCE aeronave_id_seq OWNED BY aeronave.id_aeronave;

ALTER TABLE voo ADD CONSTRAINT voo_aeronave_fk
FOREIGN KEY (id_aeronave)
REFERENCES aeronave (id_aeronave)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
