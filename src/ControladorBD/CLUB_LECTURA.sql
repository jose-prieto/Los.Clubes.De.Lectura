PGDMP     /    "                w            club_lectura    11.5    11.5 �    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            �           1262    16413    club_lectura    DATABASE     �   CREATE DATABASE club_lectura WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE club_lectura;
             postgres    false            �            1259    16515    actor    TABLE     �   CREATE TABLE public.actor (
    fechai_mie date NOT NULL,
    club_id numeric(3,0) NOT NULL,
    doc_id numeric(10,0) NOT NULL,
    obra_id numeric(3,0) NOT NULL,
    perso_id numeric(5,0) NOT NULL,
    func_fecha date NOT NULL
);
    DROP TABLE public.actor;
       public         postgres    false            �            1259    16574 
   asociacion    TABLE     e   CREATE TABLE public.asociacion (
    club1 numeric(3,0) NOT NULL,
    club2 numeric(3,0) NOT NULL
);
    DROP TABLE public.asociacion;
       public         postgres    false            �            1259    16539 	   auditorio    TABLE     �   CREATE TABLE public.auditorio (
    audi_id numeric(3,0) NOT NULL,
    audi_capacidad numeric(4,0) NOT NULL,
    audi_nombre character varying(30) NOT NULL,
    dir_id numeric(4,0) NOT NULL,
    club_id numeric(3,0) NOT NULL
);
    DROP TABLE public.auditorio;
       public         postgres    false            �            1259    16614    autor    TABLE     	  CREATE TABLE public.autor (
    aut_id numeric(3,0) NOT NULL,
    aut_nombre1 character varying(15) NOT NULL,
    aut_nombre2 character varying(15),
    aut_ape1 character varying(15) NOT NULL,
    aut_ape2 character varying(15),
    isbn numeric(15,0) NOT NULL
);
    DROP TABLE public.autor;
       public         postgres    false            �            1259    16599    capitulo_otro    TABLE     �   CREATE TABLE public.capitulo_otro (
    cap_id numeric(4,0) NOT NULL,
    isbn numeric(15,0) NOT NULL,
    cap_nombre character varying(30) NOT NULL,
    cap_titulo character varying(30)
);
 !   DROP TABLE public.capitulo_otro;
       public         postgres    false            �            1259    16624    clasificacion    TABLE     �   CREATE TABLE public.clasificacion (
    clasi_id numeric(3,0) NOT NULL,
    clasi_nombre character varying(30) NOT NULL,
    clasi_tipo character varying(1) NOT NULL,
    clasi_padre numeric(3,0)
);
 !   DROP TABLE public.clasificacion;
       public         postgres    false            �            1259    16589    club    TABLE     \  CREATE TABLE public.club (
    club_id numeric(3,0) NOT NULL,
    club_nombre character varying(30) NOT NULL,
    club_fecha_inicio date NOT NULL,
    direccion character varying(50) NOT NULL,
    cod_postal numeric(10,0) NOT NULL,
    cuota boolean,
    idio_id numeric(2,0) NOT NULL,
    dir_id numeric(4,0) NOT NULL,
    inst_id numeric(3,0)
);
    DROP TABLE public.club;
       public         postgres    false            �            1259    16569 	   club_obra    TABLE     h   CREATE TABLE public.club_obra (
    obra_id numeric(3,0) NOT NULL,
    club_id numeric(3,0) NOT NULL
);
    DROP TABLE public.club_obra;
       public         postgres    false            �            1259    16544    direccion_lugar    TABLE       CREATE TABLE public.direccion_lugar (
    dir_id numeric(4,0) NOT NULL,
    dir_tipo character varying(10) NOT NULL,
    dir_nombre character varying(20) NOT NULL,
    "moneda " money,
    nacionalidad character varying(20),
    dir_id_padre numeric(4,0)
);
 #   DROP TABLE public.direccion_lugar;
       public         postgres    false            �            1259    16619 	   editorial    TABLE     �   CREATE TABLE public.editorial (
    edit_id numeric(3,0) NOT NULL,
    edit_nombre character varying(50) NOT NULL,
    dir_id numeric(4,0) NOT NULL
);
    DROP TABLE public.editorial;
       public         postgres    false            �            1259    16510    elenco    TABLE     �   CREATE TABLE public.elenco (
    fechai_mie date NOT NULL,
    club_id numeric(3,0) NOT NULL,
    doc_id numeric(10,0) NOT NULL,
    obra_id numeric(3,0) NOT NULL,
    perso_id numeric(5,0) NOT NULL
);
    DROP TABLE public.elenco;
       public         postgres    false            �            1259    16529    funcion    TABLE     �   CREATE TABLE public.funcion (
    func_fecha date NOT NULL,
    obra_id numeric(3,0) NOT NULL,
    func_hora numeric(2,0) NOT NULL,
    estatus_realizado boolean NOT NULL,
    func_valoracion numeric(1,0),
    func_entradas_vend numeric(4,0)
);
    DROP TABLE public.funcion;
       public         postgres    false            �            1259    16584    g_lector    TABLE     �   CREATE TABLE public.g_lector (
    grup_id numeric(3,0) NOT NULL,
    club_id numeric(3,0) NOT NULL,
    fechai_mie date NOT NULL,
    doc_id numeric(10,0) NOT NULL,
    fechai_gru date NOT NULL,
    fechaf_gru date
);
    DROP TABLE public.g_lector;
       public         postgres    false            �            1259    16594    grupo    TABLE     �   CREATE TABLE public.grupo (
    grup_id numeric(3,0) NOT NULL,
    club_id numeric(3,0) NOT NULL,
    grup_tipo character varying(30) NOT NULL,
    dia date NOT NULL,
    horai numeric(2,0) NOT NULL,
    horaf numeric(2,0) NOT NULL
);
    DROP TABLE public.grupo;
       public         postgres    false            �            1259    16485    hist_miembro    TABLE     �   CREATE TABLE public.hist_miembro (
    fechai_mie date NOT NULL,
    club_id numeric(3,0) NOT NULL,
    doc_id numeric(10,0) NOT NULL,
    estatus_mie character varying(20) NOT NULL,
    fechaf_mie date,
    motivo_retiro character varying(20)
);
     DROP TABLE public.hist_miembro;
       public         postgres    false            �            1259    16549    idioma    TABLE     r   CREATE TABLE public.idioma (
    idio_id numeric(2,0) NOT NULL,
    idio_nombre character varying(20) NOT NULL
);
    DROP TABLE public.idioma;
       public         postgres    false            �            1259    16500    idioma_miembro    TABLE     m   CREATE TABLE public.idioma_miembro (
    doc_id numeric(10,0) NOT NULL,
    idio_id numeric(2,0) NOT NULL
);
 "   DROP TABLE public.idioma_miembro;
       public         postgres    false            �            1259    16554    inasistencia    TABLE     �   CREATE TABLE public.inasistencia (
    reu_fecha date NOT NULL,
    grup_id numeric(3,0) NOT NULL,
    club_id numeric(3,0) NOT NULL,
    fechai_mie date NOT NULL,
    doc_id numeric(10,0) NOT NULL
);
     DROP TABLE public.inasistencia;
       public         postgres    false            �            1259    16579    institucion    TABLE     �   CREATE TABLE public.institucion (
    inst_id numeric(3,0) NOT NULL,
    inst_nombre character varying(30) NOT NULL,
    inst_desc character varying(50) NOT NULL,
    dir_id numeric(4,0) NOT NULL
);
    DROP TABLE public.institucion;
       public         postgres    false            �            1259    16629    libro    TABLE     �  CREATE TABLE public.libro (
    isbn numeric(15,0) NOT NULL,
    lib_tit_original character varying(50) NOT NULL,
    sinopsis character varying(500) NOT NULL,
    lib_ano_publi date NOT NULL,
    lib_pag numeric(4,0) NOT NULL,
    titulo_esp character varying(50),
    tema_princ character varying(100),
    clasi_id numeric(3,0) NOT NULL,
    edit_id numeric(3,0) NOT NULL,
    isbn_padre numeric(15,0)
);
    DROP TABLE public.libro;
       public         postgres    false            �            1259    16490    libro_miembro    TABLE     j   CREATE TABLE public.libro_miembro (
    doc_id numeric(10,0) NOT NULL,
    isbn numeric(15,0) NOT NULL
);
 !   DROP TABLE public.libro_miembro;
       public         postgres    false            �            1259    16564 
   libro_obra    TABLE     g   CREATE TABLE public.libro_obra (
    isbn numeric(15,0) NOT NULL,
    obra_id numeric(3,0) NOT NULL
);
    DROP TABLE public.libro_obra;
       public         postgres    false            �            1259    16495    libros_preferidos    TABLE     �   CREATE TABLE public.libros_preferidos (
    doc_id numeric(10,0) NOT NULL,
    isbn numeric(15,0) NOT NULL,
    posicion numeric(1,0) NOT NULL
);
 %   DROP TABLE public.libros_preferidos;
       public         postgres    false            �            1259    16447    miembro    TABLE     �  CREATE TABLE public.miembro (
    doc_id numeric(10,0) NOT NULL,
    miemb_nombre1 character varying(15) NOT NULL,
    miemb_nombre2 character varying(15),
    miemb_ape1 character varying(15) NOT NULL,
    miemb_ape2 character varying(15),
    miemb_genero character varying(10) NOT NULL,
    miemb_fecha_nac date NOT NULL,
    representante1 numeric(10,0),
    representante2 numeric(10,0)
);
    DROP TABLE public.miembro;
       public         postgres    false            �            1259    16559    obra    TABLE       CREATE TABLE public.obra (
    obra_id numeric(3,0) NOT NULL,
    obra_duracion numeric(1,0) NOT NULL,
    obra_estatus character varying(20) NOT NULL,
    obra_titulo character varying(50) NOT NULL,
    costo_entrada numeric(5,0) NOT NULL,
    audi_id numeric(3,0) NOT NULL
);
    DROP TABLE public.obra;
       public         postgres    false            �            1259    16520    pago    TABLE     �   CREATE TABLE public.pago (
    pago_id numeric(3,0) NOT NULL,
    fechai_mie date NOT NULL,
    club_id numeric(3,0) NOT NULL,
    doc_id numeric(10,0) NOT NULL,
    pago_fecha date NOT NULL
);
    DROP TABLE public.pago;
       public         postgres    false            �            1259    16534 	   personaje    TABLE     �   CREATE TABLE public.personaje (
    perso_id numeric(5,0) NOT NULL,
    obra_id numeric(3,0) NOT NULL,
    perso_nombre character varying(20) NOT NULL,
    perso_desc character varying(100) NOT NULL
);
    DROP TABLE public.personaje;
       public         postgres    false            �            1259    16452    representante    TABLE     #  CREATE TABLE public.representante (
    doc_ident numeric(10,0) NOT NULL,
    rep_nombre1 character varying(15) NOT NULL,
    rep_nombre2 character varying(15),
    rep_ape1 character varying(15) NOT NULL,
    rep_ape2 character varying(15),
    rep_genero character varying(10) NOT NULL
);
 !   DROP TABLE public.representante;
       public         postgres    false            �            1259    16609 	   reuniones    TABLE     5  CREATE TABLE public.reuniones (
    reu_fecha date NOT NULL,
    grup_id numeric(3,0) NOT NULL,
    club_id numeric(3,0) NOT NULL,
    reu_conclusiones character varying(400),
    reu_valoracion numeric(1,0),
    isbn numeric(15,0) NOT NULL,
    fechai_mie date NOT NULL,
    doc_id numeric(10,0) NOT NULL
);
    DROP TABLE public.reuniones;
       public         postgres    false            �            1259    16604    seccion    TABLE     �   CREATE TABLE public.seccion (
    secc_id numeric(4,0) NOT NULL,
    cap_id numeric(4,0) NOT NULL,
    isbn numeric(15,0) NOT NULL,
    secc_nombre character varying(30) NOT NULL,
    secc_titulo character varying(30)
);
    DROP TABLE public.seccion;
       public         postgres    false            �            1259    16460    telefono    TABLE     �   CREATE TABLE public.telefono (
    tel_cod numeric(3,0) NOT NULL,
    tel_num numeric(7,0) NOT NULL,
    representante numeric(10,0),
    miembro numeric(10,0)
);
    DROP TABLE public.telefono;
       public         postgres    false            �          0    16515    actor 
   TABLE DATA               [   COPY public.actor (fechai_mie, club_id, doc_id, obra_id, perso_id, func_fecha) FROM stdin;
    public       postgres    false    204   e�       �          0    16574 
   asociacion 
   TABLE DATA               2   COPY public.asociacion (club1, club2) FROM stdin;
    public       postgres    false    215   ��       �          0    16539 	   auditorio 
   TABLE DATA               Z   COPY public.auditorio (audi_id, audi_capacidad, audi_nombre, dir_id, club_id) FROM stdin;
    public       postgres    false    208   ��       �          0    16614    autor 
   TABLE DATA               [   COPY public.autor (aut_id, aut_nombre1, aut_nombre2, aut_ape1, aut_ape2, isbn) FROM stdin;
    public       postgres    false    223   ��       �          0    16599    capitulo_otro 
   TABLE DATA               M   COPY public.capitulo_otro (cap_id, isbn, cap_nombre, cap_titulo) FROM stdin;
    public       postgres    false    220   ٸ       �          0    16624    clasificacion 
   TABLE DATA               X   COPY public.clasificacion (clasi_id, clasi_nombre, clasi_tipo, clasi_padre) FROM stdin;
    public       postgres    false    225   ��       �          0    16589    club 
   TABLE DATA                  COPY public.club (club_id, club_nombre, club_fecha_inicio, direccion, cod_postal, cuota, idio_id, dir_id, inst_id) FROM stdin;
    public       postgres    false    218   �       �          0    16569 	   club_obra 
   TABLE DATA               5   COPY public.club_obra (obra_id, club_id) FROM stdin;
    public       postgres    false    214   0�       �          0    16544    direccion_lugar 
   TABLE DATA               n   COPY public.direccion_lugar (dir_id, dir_tipo, dir_nombre, "moneda ", nacionalidad, dir_id_padre) FROM stdin;
    public       postgres    false    209   M�       �          0    16619 	   editorial 
   TABLE DATA               A   COPY public.editorial (edit_id, edit_nombre, dir_id) FROM stdin;
    public       postgres    false    224   j�       �          0    16510    elenco 
   TABLE DATA               P   COPY public.elenco (fechai_mie, club_id, doc_id, obra_id, perso_id) FROM stdin;
    public       postgres    false    203   ��       �          0    16529    funcion 
   TABLE DATA               y   COPY public.funcion (func_fecha, obra_id, func_hora, estatus_realizado, func_valoracion, func_entradas_vend) FROM stdin;
    public       postgres    false    206   ��       �          0    16584    g_lector 
   TABLE DATA               `   COPY public.g_lector (grup_id, club_id, fechai_mie, doc_id, fechai_gru, fechaf_gru) FROM stdin;
    public       postgres    false    217   ��       �          0    16594    grupo 
   TABLE DATA               O   COPY public.grupo (grup_id, club_id, grup_tipo, dia, horai, horaf) FROM stdin;
    public       postgres    false    219   ޹       �          0    16485    hist_miembro 
   TABLE DATA               k   COPY public.hist_miembro (fechai_mie, club_id, doc_id, estatus_mie, fechaf_mie, motivo_retiro) FROM stdin;
    public       postgres    false    199   ��       �          0    16549    idioma 
   TABLE DATA               6   COPY public.idioma (idio_id, idio_nombre) FROM stdin;
    public       postgres    false    210   �       �          0    16500    idioma_miembro 
   TABLE DATA               9   COPY public.idioma_miembro (doc_id, idio_id) FROM stdin;
    public       postgres    false    202   5�       �          0    16554    inasistencia 
   TABLE DATA               W   COPY public.inasistencia (reu_fecha, grup_id, club_id, fechai_mie, doc_id) FROM stdin;
    public       postgres    false    211   R�       �          0    16579    institucion 
   TABLE DATA               N   COPY public.institucion (inst_id, inst_nombre, inst_desc, dir_id) FROM stdin;
    public       postgres    false    216   o�       �          0    16629    libro 
   TABLE DATA               �   COPY public.libro (isbn, lib_tit_original, sinopsis, lib_ano_publi, lib_pag, titulo_esp, tema_princ, clasi_id, edit_id, isbn_padre) FROM stdin;
    public       postgres    false    226   ��       �          0    16490    libro_miembro 
   TABLE DATA               5   COPY public.libro_miembro (doc_id, isbn) FROM stdin;
    public       postgres    false    200   ��       �          0    16564 
   libro_obra 
   TABLE DATA               3   COPY public.libro_obra (isbn, obra_id) FROM stdin;
    public       postgres    false    213   ƺ       �          0    16495    libros_preferidos 
   TABLE DATA               C   COPY public.libros_preferidos (doc_id, isbn, posicion) FROM stdin;
    public       postgres    false    201   �       �          0    16447    miembro 
   TABLE DATA               �   COPY public.miembro (doc_id, miemb_nombre1, miemb_nombre2, miemb_ape1, miemb_ape2, miemb_genero, miemb_fecha_nac, representante1, representante2) FROM stdin;
    public       postgres    false    196    �       �          0    16559    obra 
   TABLE DATA               i   COPY public.obra (obra_id, obra_duracion, obra_estatus, obra_titulo, costo_entrada, audi_id) FROM stdin;
    public       postgres    false    212   �       �          0    16520    pago 
   TABLE DATA               P   COPY public.pago (pago_id, fechai_mie, club_id, doc_id, pago_fecha) FROM stdin;
    public       postgres    false    205   :�       �          0    16534 	   personaje 
   TABLE DATA               P   COPY public.personaje (perso_id, obra_id, perso_nombre, perso_desc) FROM stdin;
    public       postgres    false    207   W�       �          0    16452    representante 
   TABLE DATA               l   COPY public.representante (doc_ident, rep_nombre1, rep_nombre2, rep_ape1, rep_ape2, rep_genero) FROM stdin;
    public       postgres    false    197   t�       �          0    16609 	   reuniones 
   TABLE DATA               |   COPY public.reuniones (reu_fecha, grup_id, club_id, reu_conclusiones, reu_valoracion, isbn, fechai_mie, doc_id) FROM stdin;
    public       postgres    false    222   ��       �          0    16604    seccion 
   TABLE DATA               R   COPY public.seccion (secc_id, cap_id, isbn, secc_nombre, secc_titulo) FROM stdin;
    public       postgres    false    221   ��       �          0    16460    telefono 
   TABLE DATA               L   COPY public.telefono (tel_cod, tel_num, representante, miembro) FROM stdin;
    public       postgres    false    198   ˻                  2606    16519    actor pk_actor 
   CONSTRAINT     �   ALTER TABLE ONLY public.actor
    ADD CONSTRAINT pk_actor PRIMARY KEY (fechai_mie, club_id, doc_id, obra_id, perso_id, func_fecha);
 8   ALTER TABLE ONLY public.actor DROP CONSTRAINT pk_actor;
       public         postgres    false    204    204    204    204    204    204                       2606    16578    asociacion pk_asociacion 
   CONSTRAINT     `   ALTER TABLE ONLY public.asociacion
    ADD CONSTRAINT pk_asociacion PRIMARY KEY (club2, club1);
 B   ALTER TABLE ONLY public.asociacion DROP CONSTRAINT pk_asociacion;
       public         postgres    false    215    215                       2606    16543    auditorio pk_auditorio 
   CONSTRAINT     Y   ALTER TABLE ONLY public.auditorio
    ADD CONSTRAINT pk_auditorio PRIMARY KEY (audi_id);
 @   ALTER TABLE ONLY public.auditorio DROP CONSTRAINT pk_auditorio;
       public         postgres    false    208            +           2606    16618    autor pk_autor 
   CONSTRAINT     P   ALTER TABLE ONLY public.autor
    ADD CONSTRAINT pk_autor PRIMARY KEY (aut_id);
 8   ALTER TABLE ONLY public.autor DROP CONSTRAINT pk_autor;
       public         postgres    false    223            %           2606    16603    capitulo_otro pk_capitulo_otro 
   CONSTRAINT     f   ALTER TABLE ONLY public.capitulo_otro
    ADD CONSTRAINT pk_capitulo_otro PRIMARY KEY (isbn, cap_id);
 H   ALTER TABLE ONLY public.capitulo_otro DROP CONSTRAINT pk_capitulo_otro;
       public         postgres    false    220    220            /           2606    16628    clasificacion pk_clasificacion 
   CONSTRAINT     b   ALTER TABLE ONLY public.clasificacion
    ADD CONSTRAINT pk_clasificacion PRIMARY KEY (clasi_id);
 H   ALTER TABLE ONLY public.clasificacion DROP CONSTRAINT pk_clasificacion;
       public         postgres    false    225            !           2606    16593    club pk_club 
   CONSTRAINT     O   ALTER TABLE ONLY public.club
    ADD CONSTRAINT pk_club PRIMARY KEY (club_id);
 6   ALTER TABLE ONLY public.club DROP CONSTRAINT pk_club;
       public         postgres    false    218                       2606    16573    club_obra pk_club_obra 
   CONSTRAINT     b   ALTER TABLE ONLY public.club_obra
    ADD CONSTRAINT pk_club_obra PRIMARY KEY (club_id, obra_id);
 @   ALTER TABLE ONLY public.club_obra DROP CONSTRAINT pk_club_obra;
       public         postgres    false    214    214                       2606    16548    direccion_lugar pk_direccion 
   CONSTRAINT     ^   ALTER TABLE ONLY public.direccion_lugar
    ADD CONSTRAINT pk_direccion PRIMARY KEY (dir_id);
 F   ALTER TABLE ONLY public.direccion_lugar DROP CONSTRAINT pk_direccion;
       public         postgres    false    209            -           2606    16623    editorial pk_editorial 
   CONSTRAINT     Y   ALTER TABLE ONLY public.editorial
    ADD CONSTRAINT pk_editorial PRIMARY KEY (edit_id);
 @   ALTER TABLE ONLY public.editorial DROP CONSTRAINT pk_editorial;
       public         postgres    false    224                       2606    16514    elenco pk_elenco 
   CONSTRAINT     z   ALTER TABLE ONLY public.elenco
    ADD CONSTRAINT pk_elenco PRIMARY KEY (fechai_mie, club_id, doc_id, obra_id, perso_id);
 :   ALTER TABLE ONLY public.elenco DROP CONSTRAINT pk_elenco;
       public         postgres    false    203    203    203    203    203            	           2606    16533    funcion pk_funcion 
   CONSTRAINT     a   ALTER TABLE ONLY public.funcion
    ADD CONSTRAINT pk_funcion PRIMARY KEY (func_fecha, obra_id);
 <   ALTER TABLE ONLY public.funcion DROP CONSTRAINT pk_funcion;
       public         postgres    false    206    206                       2606    16588    g_lector pk_g_lector 
   CONSTRAINT     t   ALTER TABLE ONLY public.g_lector
    ADD CONSTRAINT pk_g_lector PRIMARY KEY (doc_id, fechai_mie, club_id, grup_id);
 >   ALTER TABLE ONLY public.g_lector DROP CONSTRAINT pk_g_lector;
       public         postgres    false    217    217    217    217            #           2606    16598    grupo pk_grupo 
   CONSTRAINT     Z   ALTER TABLE ONLY public.grupo
    ADD CONSTRAINT pk_grupo PRIMARY KEY (club_id, grup_id);
 8   ALTER TABLE ONLY public.grupo DROP CONSTRAINT pk_grupo;
       public         postgres    false    219    219            �
           2606    16703    hist_miembro pk_hist_miembro 
   CONSTRAINT     s   ALTER TABLE ONLY public.hist_miembro
    ADD CONSTRAINT pk_hist_miembro PRIMARY KEY (fechai_mie, club_id, doc_id);
 F   ALTER TABLE ONLY public.hist_miembro DROP CONSTRAINT pk_hist_miembro;
       public         postgres    false    199    199    199                       2606    16553    idioma pk_idioma 
   CONSTRAINT     S   ALTER TABLE ONLY public.idioma
    ADD CONSTRAINT pk_idioma PRIMARY KEY (idio_id);
 :   ALTER TABLE ONLY public.idioma DROP CONSTRAINT pk_idioma;
       public         postgres    false    210                       2606    16504     idioma_miembro pk_idioma_miembro 
   CONSTRAINT     k   ALTER TABLE ONLY public.idioma_miembro
    ADD CONSTRAINT pk_idioma_miembro PRIMARY KEY (doc_id, idio_id);
 J   ALTER TABLE ONLY public.idioma_miembro DROP CONSTRAINT pk_idioma_miembro;
       public         postgres    false    202    202                       2606    16558    inasistencia pk_inasistencia 
   CONSTRAINT     �   ALTER TABLE ONLY public.inasistencia
    ADD CONSTRAINT pk_inasistencia PRIMARY KEY (reu_fecha, grup_id, club_id, fechai_mie, doc_id);
 F   ALTER TABLE ONLY public.inasistencia DROP CONSTRAINT pk_inasistencia;
       public         postgres    false    211    211    211    211    211                       2606    16583    institucion pk_institucion 
   CONSTRAINT     ]   ALTER TABLE ONLY public.institucion
    ADD CONSTRAINT pk_institucion PRIMARY KEY (inst_id);
 D   ALTER TABLE ONLY public.institucion DROP CONSTRAINT pk_institucion;
       public         postgres    false    216            1           2606    16636    libro pk_libro 
   CONSTRAINT     N   ALTER TABLE ONLY public.libro
    ADD CONSTRAINT pk_libro PRIMARY KEY (isbn);
 8   ALTER TABLE ONLY public.libro DROP CONSTRAINT pk_libro;
       public         postgres    false    226            �
           2606    16494    libro_miembro pk_libro_miembro 
   CONSTRAINT     f   ALTER TABLE ONLY public.libro_miembro
    ADD CONSTRAINT pk_libro_miembro PRIMARY KEY (doc_id, isbn);
 H   ALTER TABLE ONLY public.libro_miembro DROP CONSTRAINT pk_libro_miembro;
       public         postgres    false    200    200                       2606    16568    libro_obra pk_libro_obra 
   CONSTRAINT     a   ALTER TABLE ONLY public.libro_obra
    ADD CONSTRAINT pk_libro_obra PRIMARY KEY (isbn, obra_id);
 B   ALTER TABLE ONLY public.libro_obra DROP CONSTRAINT pk_libro_obra;
       public         postgres    false    213    213            �
           2606    16499 $   libros_preferidos pk_libro_preferido 
   CONSTRAINT     l   ALTER TABLE ONLY public.libros_preferidos
    ADD CONSTRAINT pk_libro_preferido PRIMARY KEY (doc_id, isbn);
 N   ALTER TABLE ONLY public.libros_preferidos DROP CONSTRAINT pk_libro_preferido;
       public         postgres    false    201    201            �
           2606    16451    miembro pk_miembro 
   CONSTRAINT     T   ALTER TABLE ONLY public.miembro
    ADD CONSTRAINT pk_miembro PRIMARY KEY (doc_id);
 <   ALTER TABLE ONLY public.miembro DROP CONSTRAINT pk_miembro;
       public         postgres    false    196                       2606    16563    obra pk_obra 
   CONSTRAINT     O   ALTER TABLE ONLY public.obra
    ADD CONSTRAINT pk_obra PRIMARY KEY (obra_id);
 6   ALTER TABLE ONLY public.obra DROP CONSTRAINT pk_obra;
       public         postgres    false    212                       2606    16735    pago pk_pago 
   CONSTRAINT     l   ALTER TABLE ONLY public.pago
    ADD CONSTRAINT pk_pago PRIMARY KEY (pago_id, fechai_mie, club_id, doc_id);
 6   ALTER TABLE ONLY public.pago DROP CONSTRAINT pk_pago;
       public         postgres    false    205    205    205    205                       2606    16538    personaje pk_personaje 
   CONSTRAINT     c   ALTER TABLE ONLY public.personaje
    ADD CONSTRAINT pk_personaje PRIMARY KEY (perso_id, obra_id);
 @   ALTER TABLE ONLY public.personaje DROP CONSTRAINT pk_personaje;
       public         postgres    false    207    207            �
           2606    16638    representante pk_representante 
   CONSTRAINT     c   ALTER TABLE ONLY public.representante
    ADD CONSTRAINT pk_representante PRIMARY KEY (doc_ident);
 H   ALTER TABLE ONLY public.representante DROP CONSTRAINT pk_representante;
       public         postgres    false    197            )           2606    16613    reuniones pk_reuniones 
   CONSTRAINT     m   ALTER TABLE ONLY public.reuniones
    ADD CONSTRAINT pk_reuniones PRIMARY KEY (reu_fecha, grup_id, club_id);
 @   ALTER TABLE ONLY public.reuniones DROP CONSTRAINT pk_reuniones;
       public         postgres    false    222    222    222            '           2606    16608    seccion pk_seccion 
   CONSTRAINT     c   ALTER TABLE ONLY public.seccion
    ADD CONSTRAINT pk_seccion PRIMARY KEY (secc_id, cap_id, isbn);
 <   ALTER TABLE ONLY public.seccion DROP CONSTRAINT pk_seccion;
       public         postgres    false    221    221    221            �
           2606    16464    telefono pk_tlf 
   CONSTRAINT     [   ALTER TABLE ONLY public.telefono
    ADD CONSTRAINT pk_tlf PRIMARY KEY (tel_cod, tel_num);
 9   ALTER TABLE ONLY public.telefono DROP CONSTRAINT pk_tlf;
       public         postgres    false    198    198            @           2606    16922    actor fk_actor_elenco    FK CONSTRAINT     �   ALTER TABLE ONLY public.actor
    ADD CONSTRAINT fk_actor_elenco FOREIGN KEY (fechai_mie, club_id, doc_id, obra_id, perso_id) REFERENCES public.elenco(fechai_mie, club_id, doc_id, obra_id, perso_id) NOT VALID;
 ?   ALTER TABLE ONLY public.actor DROP CONSTRAINT fk_actor_elenco;
       public       postgres    false    203    204    203    2819    203    203    203    204    204    204    204            A           2606    16927    actor fk_actor_funcion    FK CONSTRAINT     �   ALTER TABLE ONLY public.actor
    ADD CONSTRAINT fk_actor_funcion FOREIGN KEY (func_fecha, obra_id) REFERENCES public.funcion(func_fecha, obra_id) NOT VALID;
 @   ALTER TABLE ONLY public.actor DROP CONSTRAINT fk_actor_funcion;
       public       postgres    false    204    204    206    206    2825            M           2606    16862    asociacion fk_aso_club1    FK CONSTRAINT     �   ALTER TABLE ONLY public.asociacion
    ADD CONSTRAINT fk_aso_club1 FOREIGN KEY (club1) REFERENCES public.club(club_id) NOT VALID;
 A   ALTER TABLE ONLY public.asociacion DROP CONSTRAINT fk_aso_club1;
       public       postgres    false    215    218    2849            N           2606    16867    asociacion fk_aso_club2    FK CONSTRAINT     �   ALTER TABLE ONLY public.asociacion
    ADD CONSTRAINT fk_aso_club2 FOREIGN KEY (club2) REFERENCES public.club(club_id) NOT VALID;
 A   ALTER TABLE ONLY public.asociacion DROP CONSTRAINT fk_aso_club2;
       public       postgres    false    215    218    2849            F           2606    16812    auditorio fk_aud_club    FK CONSTRAINT     �   ALTER TABLE ONLY public.auditorio
    ADD CONSTRAINT fk_aud_club FOREIGN KEY (club_id) REFERENCES public.club(club_id) NOT VALID;
 ?   ALTER TABLE ONLY public.auditorio DROP CONSTRAINT fk_aud_club;
       public       postgres    false    2849    218    208            E           2606    16807    auditorio fk_aud_dir    FK CONSTRAINT     �   ALTER TABLE ONLY public.auditorio
    ADD CONSTRAINT fk_aud_dir FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar(dir_id) NOT VALID;
 >   ALTER TABLE ONLY public.auditorio DROP CONSTRAINT fk_aud_dir;
       public       postgres    false    208    209    2831            H           2606    16872    obra fk_auditorio    FK CONSTRAINT     �   ALTER TABLE ONLY public.obra
    ADD CONSTRAINT fk_auditorio FOREIGN KEY (audi_id) REFERENCES public.auditorio(audi_id) NOT VALID;
 ;   ALTER TABLE ONLY public.obra DROP CONSTRAINT fk_auditorio;
       public       postgres    false    212    208    2829            [           2606    16857    autor fk_autor    FK CONSTRAINT     v   ALTER TABLE ONLY public.autor
    ADD CONSTRAINT fk_autor FOREIGN KEY (isbn) REFERENCES public.libro(isbn) NOT VALID;
 8   ALTER TABLE ONLY public.autor DROP CONSTRAINT fk_autor;
       public       postgres    false    223    226    2865            V           2606    16775    capitulo_otro fk_capitulo_isbn    FK CONSTRAINT     �   ALTER TABLE ONLY public.capitulo_otro
    ADD CONSTRAINT fk_capitulo_isbn FOREIGN KEY (isbn) REFERENCES public.libro(isbn) NOT VALID;
 H   ALTER TABLE ONLY public.capitulo_otro DROP CONSTRAINT fk_capitulo_isbn;
       public       postgres    false    226    2865    220            ]           2606    16770    clasificacion fk_clasi_padre    FK CONSTRAINT     �   ALTER TABLE ONLY public.clasificacion
    ADD CONSTRAINT fk_clasi_padre FOREIGN KEY (clasi_padre) REFERENCES public.clasificacion(clasi_id) NOT VALID;
 F   ALTER TABLE ONLY public.clasificacion DROP CONSTRAINT fk_clasi_padre;
       public       postgres    false    2863    225    225            T           2606    16837    club fk_club_dir    FK CONSTRAINT     �   ALTER TABLE ONLY public.club
    ADD CONSTRAINT fk_club_dir FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar(dir_id) NOT VALID;
 :   ALTER TABLE ONLY public.club DROP CONSTRAINT fk_club_dir;
       public       postgres    false    218    209    2831            R           2606    16827    club fk_club_idio    FK CONSTRAINT     �   ALTER TABLE ONLY public.club
    ADD CONSTRAINT fk_club_idio FOREIGN KEY (idio_id) REFERENCES public.idioma(idio_id) NOT VALID;
 ;   ALTER TABLE ONLY public.club DROP CONSTRAINT fk_club_idio;
       public       postgres    false    2833    218    210            S           2606    16832    club fk_club_inst    FK CONSTRAINT     �   ALTER TABLE ONLY public.club
    ADD CONSTRAINT fk_club_inst FOREIGN KEY (inst_id) REFERENCES public.institucion(inst_id) NOT VALID;
 ;   ALTER TABLE ONLY public.club DROP CONSTRAINT fk_club_inst;
       public       postgres    false    218    2845    216            K           2606    16887    club_obra fk_co_club    FK CONSTRAINT     �   ALTER TABLE ONLY public.club_obra
    ADD CONSTRAINT fk_co_club FOREIGN KEY (club_id) REFERENCES public.club(club_id) NOT VALID;
 >   ALTER TABLE ONLY public.club_obra DROP CONSTRAINT fk_co_club;
       public       postgres    false    2849    218    214            L           2606    16892    club_obra fk_co_obra    FK CONSTRAINT     �   ALTER TABLE ONLY public.club_obra
    ADD CONSTRAINT fk_co_obra FOREIGN KEY (obra_id) REFERENCES public.obra(obra_id) NOT VALID;
 >   ALTER TABLE ONLY public.club_obra DROP CONSTRAINT fk_co_obra;
       public       postgres    false    214    2837    212            G           2606    16817    direccion_lugar fk_direccion    FK CONSTRAINT     �   ALTER TABLE ONLY public.direccion_lugar
    ADD CONSTRAINT fk_direccion FOREIGN KEY (dir_id_padre) REFERENCES public.direccion_lugar(dir_id) NOT VALID;
 F   ALTER TABLE ONLY public.direccion_lugar DROP CONSTRAINT fk_direccion;
       public       postgres    false    209    209    2831            \           2606    16765    editorial fk_edit_dir    FK CONSTRAINT     �   ALTER TABLE ONLY public.editorial
    ADD CONSTRAINT fk_edit_dir FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar(dir_id) NOT VALID;
 ?   ALTER TABLE ONLY public.editorial DROP CONSTRAINT fk_edit_dir;
       public       postgres    false    224    209    2831            >           2606    16902    elenco fk_elenco_hist    FK CONSTRAINT     �   ALTER TABLE ONLY public.elenco
    ADD CONSTRAINT fk_elenco_hist FOREIGN KEY (fechai_mie, club_id, doc_id) REFERENCES public.hist_miembro(fechai_mie, club_id, doc_id) NOT VALID;
 ?   ALTER TABLE ONLY public.elenco DROP CONSTRAINT fk_elenco_hist;
       public       postgres    false    199    2811    203    203    203    199    199            ?           2606    16907    elenco fk_elenco_perso    FK CONSTRAINT     �   ALTER TABLE ONLY public.elenco
    ADD CONSTRAINT fk_elenco_perso FOREIGN KEY (obra_id, perso_id) REFERENCES public.personaje(obra_id, perso_id) NOT VALID;
 @   ALTER TABLE ONLY public.elenco DROP CONSTRAINT fk_elenco_perso;
       public       postgres    false    207    207    2827    203    203            C           2606    16912    funcion fk_funcion    FK CONSTRAINT        ALTER TABLE ONLY public.funcion
    ADD CONSTRAINT fk_funcion FOREIGN KEY (obra_id) REFERENCES public.obra(obra_id) NOT VALID;
 <   ALTER TABLE ONLY public.funcion DROP CONSTRAINT fk_funcion;
       public       postgres    false    2837    212    206            P           2606    16932    g_lector fk_g_lector1    FK CONSTRAINT     �   ALTER TABLE ONLY public.g_lector
    ADD CONSTRAINT fk_g_lector1 FOREIGN KEY (club_id, fechai_mie, doc_id) REFERENCES public.hist_miembro(club_id, fechai_mie, doc_id) NOT VALID;
 ?   ALTER TABLE ONLY public.g_lector DROP CONSTRAINT fk_g_lector1;
       public       postgres    false    199    199    217    217    217    2811    199            Q           2606    16937    g_lector fk_g_lector2    FK CONSTRAINT     �   ALTER TABLE ONLY public.g_lector
    ADD CONSTRAINT fk_g_lector2 FOREIGN KEY (grup_id, club_id) REFERENCES public.grupo(grup_id, club_id) NOT VALID;
 ?   ALTER TABLE ONLY public.g_lector DROP CONSTRAINT fk_g_lector2;
       public       postgres    false    217    217    2851    219    219            U           2606    16842    grupo fk_grupo    FK CONSTRAINT     {   ALTER TABLE ONLY public.grupo
    ADD CONSTRAINT fk_grupo FOREIGN KEY (club_id) REFERENCES public.club(club_id) NOT VALID;
 8   ALTER TABLE ONLY public.grupo DROP CONSTRAINT fk_grupo;
       public       postgres    false    219    218    2849            6           2606    16792    hist_miembro fk_hist_club    FK CONSTRAINT     �   ALTER TABLE ONLY public.hist_miembro
    ADD CONSTRAINT fk_hist_club FOREIGN KEY (club_id) REFERENCES public.club(club_id) NOT VALID;
 C   ALTER TABLE ONLY public.hist_miembro DROP CONSTRAINT fk_hist_club;
       public       postgres    false    199    218    2849            7           2606    16797    hist_miembro fk_hist_doc    FK CONSTRAINT     �   ALTER TABLE ONLY public.hist_miembro
    ADD CONSTRAINT fk_hist_doc FOREIGN KEY (doc_id) REFERENCES public.miembro(doc_id) NOT VALID;
 B   ALTER TABLE ONLY public.hist_miembro DROP CONSTRAINT fk_hist_doc;
       public       postgres    false    2805    199    196            <           2606    16724    idioma_miembro fk_im_doc    FK CONSTRAINT     �   ALTER TABLE ONLY public.idioma_miembro
    ADD CONSTRAINT fk_im_doc FOREIGN KEY (doc_id) REFERENCES public.miembro(doc_id) NOT VALID;
 B   ALTER TABLE ONLY public.idioma_miembro DROP CONSTRAINT fk_im_doc;
       public       postgres    false    196    202    2805            =           2606    16729    idioma_miembro fk_im_idioma    FK CONSTRAINT     �   ALTER TABLE ONLY public.idioma_miembro
    ADD CONSTRAINT fk_im_idioma FOREIGN KEY (idio_id) REFERENCES public.idioma(idio_id) NOT VALID;
 E   ALTER TABLE ONLY public.idioma_miembro DROP CONSTRAINT fk_im_idioma;
       public       postgres    false    202    210    2833            O           2606    16822    institucion fk_inst    FK CONSTRAINT     �   ALTER TABLE ONLY public.institucion
    ADD CONSTRAINT fk_inst FOREIGN KEY (dir_id) REFERENCES public.direccion_lugar(dir_id) NOT VALID;
 =   ALTER TABLE ONLY public.institucion DROP CONSTRAINT fk_inst;
       public       postgres    false    209    216    2831            ^           2606    16750    libro fk_libro_clasi    FK CONSTRAINT     �   ALTER TABLE ONLY public.libro
    ADD CONSTRAINT fk_libro_clasi FOREIGN KEY (clasi_id) REFERENCES public.clasificacion(clasi_id) NOT VALID;
 >   ALTER TABLE ONLY public.libro DROP CONSTRAINT fk_libro_clasi;
       public       postgres    false    226    225    2863            _           2606    16755    libro fk_libro_edit    FK CONSTRAINT     �   ALTER TABLE ONLY public.libro
    ADD CONSTRAINT fk_libro_edit FOREIGN KEY (edit_id) REFERENCES public.editorial(edit_id) NOT VALID;
 =   ALTER TABLE ONLY public.libro DROP CONSTRAINT fk_libro_edit;
       public       postgres    false    226    224    2861            `           2606    16760    libro fk_libro_librop    FK CONSTRAINT     �   ALTER TABLE ONLY public.libro
    ADD CONSTRAINT fk_libro_librop FOREIGN KEY (isbn_padre) REFERENCES public.libro(isbn) NOT VALID;
 ?   ALTER TABLE ONLY public.libro DROP CONSTRAINT fk_libro_librop;
       public       postgres    false    226    226    2865            8           2606    16704    libro_miembro fk_lm_doc    FK CONSTRAINT     �   ALTER TABLE ONLY public.libro_miembro
    ADD CONSTRAINT fk_lm_doc FOREIGN KEY (doc_id) REFERENCES public.miembro(doc_id) NOT VALID;
 A   ALTER TABLE ONLY public.libro_miembro DROP CONSTRAINT fk_lm_doc;
       public       postgres    false    200    196    2805            9           2606    16709    libro_miembro fk_lm_isbn    FK CONSTRAINT     �   ALTER TABLE ONLY public.libro_miembro
    ADD CONSTRAINT fk_lm_isbn FOREIGN KEY (isbn) REFERENCES public.libro(isbn) NOT VALID;
 B   ALTER TABLE ONLY public.libro_miembro DROP CONSTRAINT fk_lm_isbn;
       public       postgres    false    2865    226    200            I           2606    16877    libro_obra fk_lo_isbn    FK CONSTRAINT     }   ALTER TABLE ONLY public.libro_obra
    ADD CONSTRAINT fk_lo_isbn FOREIGN KEY (isbn) REFERENCES public.libro(isbn) NOT VALID;
 ?   ALTER TABLE ONLY public.libro_obra DROP CONSTRAINT fk_lo_isbn;
       public       postgres    false    213    226    2865            J           2606    16882    libro_obra fk_lo_obra    FK CONSTRAINT     �   ALTER TABLE ONLY public.libro_obra
    ADD CONSTRAINT fk_lo_obra FOREIGN KEY (obra_id) REFERENCES public.obra(obra_id) NOT VALID;
 ?   ALTER TABLE ONLY public.libro_obra DROP CONSTRAINT fk_lo_obra;
       public       postgres    false    2837    213    212            :           2606    16714    libros_preferidos fk_lp_doc    FK CONSTRAINT     �   ALTER TABLE ONLY public.libros_preferidos
    ADD CONSTRAINT fk_lp_doc FOREIGN KEY (doc_id) REFERENCES public.miembro(doc_id) NOT VALID;
 E   ALTER TABLE ONLY public.libros_preferidos DROP CONSTRAINT fk_lp_doc;
       public       postgres    false    201    196    2805            ;           2606    16719    libros_preferidos fk_lp_isbn    FK CONSTRAINT     �   ALTER TABLE ONLY public.libros_preferidos
    ADD CONSTRAINT fk_lp_isbn FOREIGN KEY (isbn) REFERENCES public.libro(isbn) NOT VALID;
 F   ALTER TABLE ONLY public.libros_preferidos DROP CONSTRAINT fk_lp_isbn;
       public       postgres    false    201    2865    226            4           2606    16465    telefono fk_miembro    FK CONSTRAINT     x   ALTER TABLE ONLY public.telefono
    ADD CONSTRAINT fk_miembro FOREIGN KEY (miembro) REFERENCES public.miembro(doc_id);
 =   ALTER TABLE ONLY public.telefono DROP CONSTRAINT fk_miembro;
       public       postgres    false    2805    196    198            B           2606    16802    pago fk_pago    FK CONSTRAINT     �   ALTER TABLE ONLY public.pago
    ADD CONSTRAINT fk_pago FOREIGN KEY (fechai_mie, club_id, doc_id) REFERENCES public.hist_miembro(fechai_mie, club_id, doc_id) NOT VALID;
 6   ALTER TABLE ONLY public.pago DROP CONSTRAINT fk_pago;
       public       postgres    false    205    205    205    199    199    199    2811            D           2606    16897    personaje fk_personaje    FK CONSTRAINT     �   ALTER TABLE ONLY public.personaje
    ADD CONSTRAINT fk_personaje FOREIGN KEY (obra_id) REFERENCES public.obra(obra_id) NOT VALID;
 @   ALTER TABLE ONLY public.personaje DROP CONSTRAINT fk_personaje;
       public       postgres    false    207    212    2837            5           2606    16644    telefono fk_representante    FK CONSTRAINT     �   ALTER TABLE ONLY public.telefono
    ADD CONSTRAINT fk_representante FOREIGN KEY (representante) REFERENCES public.representante(doc_ident);
 C   ALTER TABLE ONLY public.telefono DROP CONSTRAINT fk_representante;
       public       postgres    false    197    2807    198            3           2606    16639    miembro fk_representante1    FK CONSTRAINT     �   ALTER TABLE ONLY public.miembro
    ADD CONSTRAINT fk_representante1 FOREIGN KEY (representante1) REFERENCES public.representante(doc_ident) NOT VALID;
 C   ALTER TABLE ONLY public.miembro DROP CONSTRAINT fk_representante1;
       public       postgres    false    2807    196    197            2           2606    16480    miembro fk_representante2    FK CONSTRAINT     �   ALTER TABLE ONLY public.miembro
    ADD CONSTRAINT fk_representante2 FOREIGN KEY (representante2) REFERENCES public.miembro(doc_id) NOT VALID;
 C   ALTER TABLE ONLY public.miembro DROP CONSTRAINT fk_representante2;
       public       postgres    false    196    2805    196            X           2606    16942    reuniones fk_reu1    FK CONSTRAINT     �   ALTER TABLE ONLY public.reuniones
    ADD CONSTRAINT fk_reu1 FOREIGN KEY (grup_id, club_id, fechai_mie, doc_id) REFERENCES public.g_lector(grup_id, club_id, fechai_mie, doc_id) NOT VALID;
 ;   ALTER TABLE ONLY public.reuniones DROP CONSTRAINT fk_reu1;
       public       postgres    false    222    2847    217    217    217    217    222    222    222            Y           2606    16947    reuniones fk_reu2    FK CONSTRAINT     �   ALTER TABLE ONLY public.reuniones
    ADD CONSTRAINT fk_reu2 FOREIGN KEY (grup_id, club_id) REFERENCES public.grupo(grup_id, club_id) NOT VALID;
 ;   ALTER TABLE ONLY public.reuniones DROP CONSTRAINT fk_reu2;
       public       postgres    false    219    219    222    222    2851            Z           2606    16952    reuniones fk_reu3    FK CONSTRAINT     y   ALTER TABLE ONLY public.reuniones
    ADD CONSTRAINT fk_reu3 FOREIGN KEY (isbn) REFERENCES public.libro(isbn) NOT VALID;
 ;   ALTER TABLE ONLY public.reuniones DROP CONSTRAINT fk_reu3;
       public       postgres    false    2865    222    226            W           2606    16787    seccion fk_secc    FK CONSTRAINT     �   ALTER TABLE ONLY public.seccion
    ADD CONSTRAINT fk_secc FOREIGN KEY (cap_id, isbn) REFERENCES public.capitulo_otro(cap_id, isbn) MATCH FULL NOT VALID;
 9   ALTER TABLE ONLY public.seccion DROP CONSTRAINT fk_secc;
       public       postgres    false    221    221    220    220    2853            �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �     