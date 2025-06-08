package project;
import generico.Utils;
public class finalProject {

    //Funcion que nos muetsra el menu de lugares disponible en el juego
    public static int seleccionarLugar(){
         int lugar;
        System.out.println("\n====================================");
        System.out.println("          AVENTURA CENFOTECH         ");
        System.out.println("====================================");
        lugar = Utils.leerEntero(
            "\nElige donde quieres ir:\n" +
            "1 - Playa Brisa Dorada\n" +
            "2 - Cueva del Susurron\n" + 
            "3 - Jungla Esmeralda\n" +
            "4 - Ruinas del Eclipse\n" +
            "5 - Montaña del Vigía\n\n" +
            "Ingresa tu elección: ");

        while (lugar < 1 || lugar > 5) {
            System.out.println("\n ¡Lugar no válido! Por favor intenta de nuevo.");
            lugar = Utils.leerEntero("Ingresa un número entre 1 y 5: ");
        }
        return lugar;
    }

    //Dependiendo del lugar elegido se muestra una descripcion del lugar la cual llamara a la funcion mostarAcertijoPorLugar que muestra un acertijo para el lugar elegido
    public static void mostrarDescripcionLugar (int lugar) {
        System.out.println("\n====================================\n");
        switch (lugar) {
            case 1:
                System.out.println(" \n Playa Brisa Dorada: Una extensa playa de arena blanca, bañada por aguas cristalinas que se pueden ver esparcidos por la orilla, insinuando antiguos secretos ocultos bajo la superficie del mar. reflejan el sol dorado. El sonido de las olas rompiendo suavemente y la brisa salada crean un ambiente relajante. Algunos restos de naufragio. \n\n");
                mostarAcertijoPorLugar(lugar);
                break;
            case 2:
                System.out.println("Una oscura caverna en el acantilado occidental de la isla, donde el viento silba a través de estrechas grietas, creando un inquietante susurro. Estalactitas cuelgan del techo y el agua gotea en pequeños charcos iluminados por la tenue luz que se filtra desde la entrada. Se rumorea que la cueva esconde un antiguo tesoro pirata, aunque pocos han osado aventurarse lo suficientemente profundo para comprobarlo \n\n");
                mostarAcertijoPorLugar(lugar);
                break;
            case 3:
                System.out.println("Un denso bosque tropical cubre gran parte de la isla, con árboles colosales y lianas que cuelgan como serpientes dormidas. La fauna es diversa y los sonidos de aves exóticas y criaturas desconocidas resuenan en el aire. Caminos apenas visibles serpentean entre la vegetación, llevando a ruinas olvidadas y otros secretos escondidos en la espesura.Un denso bosque tropical cubre gran parte de la isla, con árboles colosales y lianas que cuelgan como serpientes dormidas. La fauna es diversa y los sonidos de aves exóticas y criaturas desconocidas resuenan en el aire. Caminos apenas visibles serpentean entre la vegetación, llevando a ruinas olvidadas y otros secretos escondidos en la espesura. \n\n");
                break;
            case 4:
                System.out.println("Restos de una antigua civilización que alguna vez floreció en la isla. Columnas derruidas y muros cubiertos de enredaderas cuentan la historia de un pueblo perdido en el tiempo. Un gran altar de piedra se alza en el centro, marcado con inscripciones en un idioma olvidado. Se dice que durante un eclipse, las sombras de las ruinas revelan un enigma aún sin resolver.  \n\n");
                break;
            case 5:
                System.out.println("El punto más alto de la isla, ofreciendo una vista panorámica de todo el territorio. Sus senderos empinados y rocosos desafían a cualquier aventurero que busque alcanzar la cima. En la cúspide, un antiguo puesto de observación de madera se mantiene en pie, construido por exploradores que usaban la montaña para divisar embarcaciones en el horizonte. La leyenda cuenta que en las noches despejadas, se pueden ver luces misteriosas danzando en el cielo. \n\n");
                break;
        }
        System.out.println("====================================\n");
    }
        //aqui se muestra el desafio que se le da al jugador dependiendo del lugar elegido
    public static int mostarAcertijoPorLugar(int lugar) {
        int acertijo = 0;
        System.out.println("\n====================================");
        switch (lugar) {
            case 1:
            System.out.println(" ¡Un duende te bloquea el paso!\n\n");  
            System.out.println("Acertijo: \n\n En la orilla duermo, mi historia es un misterio, el sol me acaricia, pero el tiempo me ha roto entero, que soy?\n\n");
            do {
                acertijo = Utils.leerEntero("1 - Un cofre del tesoro enterrado \n\n 2 - Un barco naufragado \n\n 3 - Una botella con un mensaje \n\n 4 - Un coral fosilizado \n\n");
                if (acertijo == 1) {
                    System.out.println("Duende: Respuesta incorrecta, te dare una pista... \n\n");
                    System.out.println("Mi origen es incierto, pero el mar me trajo hasta aquí.\n\n");
                    
                } else {
                    if (acertijo == 3) {
                        System.out.println("Duende: Respuesta incorrecta, te dare pista...\n\n");
                        System.out.println("El tiempo y el agua me desgastan, pero aún cuento historias si sabes escuchar.\n\n");
                    } else {
                        if (acertijo == 4) {
                            System.out.println("Duende: Respuesta incorrecta, te dare una pista... \n\n");
                            System.out.println("Los marineros me temen, pero los aventureros me anhelan.\n\n");
                        }
                    }
                }
                
            } while (acertijo != 2);
                System.out.println("Felicidades has resuelto el acertijo, el duente te ha dejado pasar.\n\n");
            break;


            case 2:
                System.out.println(" El jugador es sorprendido por una araña magica que no lo dejara pasar sin resolver el siguiente desafio");  
                System.out.println("Desafio: \n\n El viento sopla a través de las grietas, creando sonidos extraños. Al fondo de la caverna, encuentras una vieja puerta de piedra con inscripciones gastadas por el tiempo. Justo al lado, hay tres símbolos tallados en la roca y una advertencia: \n\n Solo quien escuche el verdadero susurro podrá abrir la puerta y reclamar el tesoro. \n\n");
                do {
                    acertijo = Utils.leerEntero("1- La ola \n\n 2 - La rafaga de viento \n\n 3 - La llama de fuego \n\n");
                    if (acertijo == 1) {
                        System.out.println("Araña: Respuesta incorrecta, te dare una pista... \n\n");
                        System.out.println("Elige el símbolo que representa lo que escuchas en la cueva. No te dejes engañar por otros sonidos, concéntrate en el que siempre está presente.\n\n");
                        
                    } else {
                        if (acertijo == 3) {
                            System.out.println("Araña: Respuesta incorrecta, te dare una pista...\n\n");
                            System.out.println("El nombre de la cueva es importante. Piensa en qué elemento de la naturaleza puede producir un susurro. \n\n");
                        } else {
                            if (acertijo == 4) {
                                System.out.println("Araña: Respuesta incorrecta... \n\n");
                                System.out.println("El verdadero susurro es el que se escucha en el fondo de la cueva, no en la parte superior. El susurro de la ola es el más importante, pero también hay otros sonidos que pueden ser más peligrosos.");
                            }
                        }
                    }
                    
                } while (acertijo != 2);
                System.out.println("Felicidades has resuelto el reto de la araña, la araña te ha dejado pasar. \n\n");
                break;
        }
        return acertijo;
    }

    public static void interactuarConLugar(int lugar) {
        mostarAcertijoPorLugar(lugar);
        boolean revisarInventario = Utils.leerBoolean("Quieres revisar tu inventario (S/N)");
        if (revisarInventario) {
            mostrarInventario(lugar);
        }

        int direccion = seleccionarDireccion(lugar);
        interactuarPorDireccion(lugar, direccion);
        enemigoLugar(lugar, direccion);

    }
    //Funcion que muestra el inventario del jugador dependiendo del lugar elegido
    public static void mostrarInventario(int lugar) {
        System.out.println("\n====================================");
        switch (lugar) {
            case 1:
            
                System.out.println("Tu inventario contiene: \n\n 1 -  Linterna \n\n 2 - Pico \n\n 3 - Mapa Antiguo \n\n");
                break;
            case 2:
                System.out.println("Tu inventario contiene: \n\n 1 - Una bolsa de oro \n\n 2 - Un casco de aventurero \n\n 3 - Un arco de fuego \n\n");
                break;            
            case 3: 
                System.out.println("Tu inventario contiene: \n\n 1 - Machete \n\n 2 - Repelente \n\n 3 - Cuerda \n\n");
                break;
            case 4:
                System.out.println("Tu inventario contiene: \n\n 1 - Capa protectora \n\n 2 - Bastón \n\n 3 - Binoculares \n\n");
                break;
            case 5:
                System.out.println("Tu inventario contiene: \n\n 1 - Antorcha \n\n 2 - Guantes de arqueólogo \n\n 3 - Libreta de notas \n\n ");
                break;  }
                System.out.println("====================================\n");
            }

    //Funcion que muestra la dirección del jugador dependiendo del lugar elegido
    public static int seleccionarDireccion(int lugar) {
        int direccion;
        System.out.println("Elige una dirección para ir:\n\n 1 - Norte \n\n 2 - Sur \n\n 3 - Este \n\n 4 - Oeste \n\n");
        direccion = Utils.leerEntero("Dirección elegida: ");
        do {
            if (direccion < 1 && direccion > 4) {
                System.out.println("La dirección no es correcta, por favor intentalo de nuevo");
                direccion = Utils.leerEntero(" \nDirección elegida: \n\n");
            }
        } while (direccion < 1 && direccion > 4);
        return direccion;
    }

    //Funcion que muestra el resultado de la accion realizada por el jugador dependiendo del lugar elegido y la dirección elegida
    public static void interactuarPorDireccion(int lugar, int direccion) {
        int opcion;
        String resultadoAccion;
        resultadoAccion = "";
        switch (lugar) {
            case 1:
                if (direccion == 1) {
                    System.out.println("\nHemisferio Norte: El jugador visualiza dos objetos a lo lejos \n\n");
                    opcion = Utils.leerEntero("1 - Recoger concha brillante \n\n 2 - Recoger mapa enterrado \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "Has recogido una concha brillante. Parece tener grabados misteriosos. ";
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "Has desenterrado un mapa viejo. Muestra una X en algún lugar de la isla.";
        
                        }
                    }
                } else if (direccion == 2) {
                    System.out.println("\nHemisferio Sur: El jugador visualiza dos objetos a lo lejos \n\n");
                    opcion = Utils.leerEntero("1 - Comer pescado crudo \n\n 2 - Recoger perla \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "Has comido pescado crudo. Te sientes un poco mareado.";
            
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "Has recogido una perla luminosa.";
                        }
                    }
                } else if (direccion == 3) {
                    System.out.println("\nHemisferio Este: El jugador visualiza dos objetos a lo lejos. \n\n");
                    opcion = Utils.leerEntero("1 - Abrir cofre oxidado \n\n 2 - Recoger soga \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "Has abierto un cofre oxidado. Encuentras algunas monedas antiguas.";
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "Has recogido una soga resistente. Podría ser útil para escalar.";
                        }
                    }
                } else if (direccion == 4) {
                    System.out.println("\nHemisferio Oeste: El jugador visualiza dos objetos a lo lejos. \n\n");
                    opcion = Utils.leerEntero("1 - Recoger botella con una nota adentro \n\n 2 - Recoger espada pirata \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "Has recogido una botella con una nota. La nota contiene instrucciones importantes. ";
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "Has recogido una espada pirata. Aumenta tu poder de ataque.";
                        }
                    }
                }
                break;
                
            case 2:
                if (direccion == 1) {
                    System.out.println("\nHemisferio Norte: El jugador visualiza dos objetos a lo lejos \n\n");
                    opcion = Utils.leerEntero("1 - Recoger diamante \n\n 2 - Recoger mochila \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "Has recogido un diamante, puedes usarlo para evitar pelear con algún enemigo.";
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "La mochila que recogiste te aportó suministros para que continúes tu viaje";
                        }
                    }
                } else if (direccion == 2) {
                    System.out.println("\nHemisferio Sur: El jugador visualiza dos objetos a lo lejos. \n\n");
                    opcion = Utils.leerEntero("1 - Recoger hongo \n\n 2 - Recoger linterna \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "Has recogido un hongo extraño. No estás seguro si es comestible.";
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "Has recogido una linterna. Te será útil en lugares oscuros.";
                        }
                    }
                }
                
                break;
                
            case 3:
                if (direccion == 1) {
                    System.out.println("\nHemisferio Norte: El jugador visualiza dos objetos a lo lejos \n\n");
                    opcion = Utils.leerEntero("1 - Comer fruto exotico \n\n 2 - Recoger miel de una colmena \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "Has comido un fruto exotico, este te dara super  resistencia.";
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "La miel que recogiste la puede usar para endulsar a tus enemigos. ";
                        }
                    }
                } else if (direccion == 2) {
                    System.out.println("\nHemisferio Sur: El jugador visualiza dos objetos a lo lejos. \n\n");
                    opcion = Utils.leerEntero("Robar huevo de reptil \n\n 2 - Recoger daga oxidada \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "Has robado un huevo de reptil. Este te dara super resistencia.";
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "Has recogido una daga oxidada. Podría ser útil para escalar.";
                        }
                    }
                }else if (direccion == 3) {
                        System.out.println("\nHemisferio Este: El jugador visualiza dos objetos a lo lejos \n\n");
                        opcion = Utils.leerEntero("1 - Comer gusano \n\n 2 - Acariciar perico \n\n");
                        switch (opcion) {
                            case 1 -> {
                                resultadoAccion = "Has comido un gusano. Este te dara super resistencia. ";
                            }
                            case 2 -> {
                                resultadoAccion = "Has acariciado un perico. Nueva mascota para tu aventura.";
                            }
                        }
                    } else if (direccion == 4) {
                    System.out.println("\nHemisferio Oeste: El jugador visualiza dos objetos a lo lejos   \n\n");
                    opcion = Utils.leerEntero("1 - Recoger raíz medicinal \n\n 2 - Ponerse casco \n\n");
                    if (opcion == 1) {
                        resultadoAccion = " Has recogido una raíz medicinal. Podría ser útil para curar algún problema.";

                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "El casco de aventurero te da una ventaja especial.";

                        }
                    }
                }
                break;
                
            case 4:
                if (direccion == 1) {
                    System.out.println("\nHemisferio Norte: El jugador visualiza dos objetos a lo lejos \n\n");
                    opcion = Utils.leerEntero("1 - Llave de cofre \n\n 2 - Pieza de mecanismo antiguo \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "Has recogido una llave de cofre. Podría ser útil para abrir algún cofre.";
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "Has recogido una pieza de mecanismo antiguo. Podría ser útil para abrir algún cofre.";
                        }
                    }
                }
                else if (direccion == 2) {
                    System.out.println("\nHemisferio Sur: El jugador visualiza dos objetos a lo lejos     \n\n");
                    opcion = Utils.leerEntero("1 - Recoger lampara de aceite \n\n 2 - Recoger flauta de hueso \n\n");
                    if (opcion == 1) {
                        resultadoAccion = " Has recogido una lampara de aceite.";
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "Has recogido una flauta de hueso.";
                        }
                    }
                } else if (direccion == 3) {
                    System.out.println("\nHemisferio Este: El jugador visualiza dos objetos a lo lejos \n\n");
                    opcion = Utils.leerEntero("1 - Recoger Botas \n\n 2 - Recoger anillo \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "Ha recogido unas botas. Podrían ser útil. ";
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "Has recogido un anillo. ";
                        }
                    }
                }  else if (direccion == 4) { 
                    System.out.println("\nHemisferio Oeste: El jugador visualiza dos objetos a lo lejos   \n\n");
                    opcion = Utils.leerEntero("1 - Leer pergamino antiguo \n\n 2 - Recoger moneda antigua \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "El pergamino esta escrito en un lenguaje antiguo ";
                    } else {
                        if (opcion == 2) {
                            resultadoAccion = "Es una moneda o es una llave antigua? ";
                        }
                    }
                }
                break;
                
                case 5:
                if (direccion == 1) {
                    System.out.println("\nHemisferio Norte: El jugador visualiza dos objetos a lo lejos   \n\n");
                    opcion = Utils.leerEntero("1 - Leer libro de aventuras \n\n 2 - Leer carta de visita \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "El libro de aventuras contiene información sobre aventuras y aventureros.    ";
                    } else if (opcion == 2) {
                        resultadoAccion = "La carta de visita contiene información sobre aventuras y aventureros. ";
                    }
                } else if (direccion == 2) {
                    System.out.println("\nHemisferio Sur: El jugador visualiza dos objetos a lo lejos \n\n");
                    opcion = Utils.leerEntero("1 - Ponerse abrigo \n\n 2 - Recoger pico \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "El abrigo te da una ventaja especial. ";
                    } else if (opcion == 2) {
                        resultadoAccion = "Has recogido un pico. Podría ser útil para escalar. ";
                    }
                } else if (direccion == 3) {
                    System.out.println("\nHemisferio Este: El jugador visualiza dos objetos a lo lejos \n\n");
                    opcion = Utils.leerEntero("1 - Recoger flecha \n\n 2 - Recoger botella con agua \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "Has recogido una flecha mágica.  ";
                    } else if (opcion == 2) {
                        resultadoAccion = "Has recogido una botella con agua. Recuperas la energía que necesitas para seguir adelante ";
                    }
                } else if (direccion == 4) {
                    System.out.println("\nHemisferio Oeste: El jugador visualiza dos objetos a lo lejos \n\n");
                    opcion = Utils.leerEntero("1 - Recoger arco \n\n 2 - Ponerse guantes térmicos \n\n");
                    if (opcion == 1) {
                        resultadoAccion = "El arco parece no ser muy útil ya que está roto. ";
                    } else if (opcion == 2) {
                        resultadoAccion = "Ya no perderás los dedos por el frío.    ";
                    }
                }
                break;
            
            default:
                resultadoAccion = "Error: Lugar inválido para interactuar por dirección.";
                break;
        }
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println(resultadoAccion);
        System.out.println("==================\n");
    }
    
    //Esta funcion se encarga de elegir el enemigo que se va a atacar 
    public static String enemigoLugar (int lugar, int direccion) {
        String enemigo;
        boolean accion;
        enemigo = "";

        if (lugar == 1 && direccion == 2) {
            enemigo = "Esqueleto";
            System.out.println("El viento salado acariciaba el rostro del explorador mientras sus botas hundían la arena caliente de la costa sur. A lo lejos, restos de un antiguo barco pirata descansaban entre las dunas, sus mástiles podridos apuntando al cielo como dedos acusadores. \n\n Cuentan que hace siglos, un capitán escondió aquí su tesoro más preciado, maldiciendo a quien lo intentara robar. La brújula vibra. El tesoro está cerca… \n\n");
            System.out.println("Ante ti se extiende lo desconocido. El aire es espeso, cada sombra parece moverse. Sabes que lo que buscas podría estar al alcance… o podrías no volver jamás. \n\n");
            accion = Utils.leerBoolean( "Te atreves a continuar (S/N)");
            if (accion) {
                accionPelea(lugar, direccion, accion, enemigo);
            }else{
                System.out.println("Volviste la vista atrás una última vez. La playa estaba tranquila, pero el aire salado llevaba algo más: el susurro de una oportunidad perdida. Preferiste la seguridad del regreso a los peligros de lo oculto. El tesoro, para ti, seguirá siendo solo una historia entre mareas.\n\n");
            }
        } else {
            if (lugar == 3 && direccion == 1) {
                enemigo = "Puma";
                System.out.println("El explorador empujó las últimas ramas que bloqueaban su paso y se adentró en la jungla. La humedad era asfixiante, y los sonidos de la selva envolvían el aire con un zumbido constante. Frente a él, una montaña de piedra cubierta de musgo se alzaba como un gigante dormido. \n\n Algo en su interior le decía que el tesoro estaba cerca, escondido en la cima de aquella mole verde. Tal vez era la brújula, tal vez era el instinto… o quizás algo más profundo. \n\n");
                accion = Utils.leerBoolean("Deseas seguir adelante (S/N)");
                if (accion) {
                    accionPelea(lugar, direccion, accion, enemigo);
                    
                } else {
                    System.out.println("El rugido fue lo último que escuchaste. El puma cayó sobre ti como una sombra entre ramas. Tus sueños de gloria se extinguieron en la espesura. El tesoro se mantuvo intacto, guardado por la bestia, eterno y fuera de tu alcance. \n\n");
                }
            }
        }

        return enemigo;
    }

    //Funcion que muestra el resultado de la accion realizada por el jugador dependiendo del lugar elegido y la dirección elegida
public static void accionPelea(int lugar, int direccion, boolean accion, String enemigo) {
    System.out.println("\n++++++++++++++++++++++++++++++++++++");
        System.out.println("       ¡COMBATE INICIADO!      ");
        System.out.println("     Te enfrentas a: " + enemigo);
        System.out.println("+++++++++++++++++++++++++++++++++\n");

    int vidaJugador = 3, vidaEnemigo = 3, ataque;
    do {
        ataque = (int)(Math.random() * 2) + 1; 
        if (ataque == 1) {
            System.out.println("El jugador ha lanzado un ataque al enemigo.");
            vidaEnemigo--;
            System.out.println("Al enemigo le quedan: " + vidaEnemigo + " vidas");
        } else {
            System.out.println("El enemigo ha lanzado un ataque al jugador.");
            vidaJugador--;
            System.out.println("Al jugador le quedan: " + vidaJugador + " vidas");
        }
    } while (vidaJugador > 0 && vidaEnemigo > 0);

    if (vidaJugador == 0 ) {
        if (enemigo == "Esqueleto") {
            System.out.println("\nEl filo oxidado del pirata te alcanzó antes de que pudieras reaccionar. Caíste sobre la arena, sintiendo cómo el mundo se desvanecía al compás de las olas. El tesoro seguiría escondido entre ruinas, guardado por el esqueleto eterno, esperando al próximo desafortunado. \n\n");
            System.out.println("\n════════════ RESULTADO ════════════");
            System.out.println("¡DERROTA! El " + enemigo + " te ha vencido.\n\n");
        } else {
            System.out.println("\nEl rugido fue lo último que escuchaste. El puma cayó sobre ti como una sombra entre ramas. Tus sueños de gloria se extinguieron en la espesura. El tesoro se mantuvo intacto, guardado por la bestia, eterno y fuera de tu alcance. \n\n");
            System.out.println("\n════════════ RESULTADO ════════════");
            System.out.println("¡DERROTA! El " + enemigo + " te ha vencido.\n\n");
        }
    } else {
        if (enemigo == "Esqueleto") {
            System.out.println("\nCon un último golpe, el esqueleto pirata cayó hecho pedazos, su espada oxidada quedó clavada en la arena. A sus pies, una vieja arca crujió al abrirse, revelando el resplandor dorado del tesoro perdido. Las olas rompieron como aplausos del destino. La leyenda era cierta… y ahora el oro tiene nuevo dueño: tú. \n\n");
            System.out.println("\n════════════ RESULTADO ════════════");
            System.out.println("¡VICTORIA! Has derrotado al " + enemigo);
        } else {
            System.out.println("\nCon agilidad y astucia, venciste al puma, cuya mirada antes fiera se desvaneció en la niebla. Tras el combate, la montaña te abrió su secreto: una cueva escondida con artefactos antiguos y cofres repletos de riquezas olvidadas. La jungla reconoció tu valor. Saliste no solo con oro, sino con el respeto de la selva. \n\n");
            System.out.println("\n════════════ RESULTADO ════════════");
            System.out.println("¡VICTORIA! Has derrotado al " + enemigo);
        }
    }
}

    public static void jugar (){
        boolean seguirJugando;
        seguirJugando = true;
        while (seguirJugando) {
            int lugar = seleccionarLugar();
            interactuarConLugar(lugar);
            System.out.println("\n\n");
            seguirJugando = Utils.leerBoolean("Quieres seguir jugando (S/N)");
        }

        System.out.println("\n¡Gracias por jugar! Hasta pronto. \n\n");
    }

    public static void main(String[] args) {
        Utils.limpiarConsola();
        jugar();
    }
    
}
