
package appproyecto;

public class Juego {
    private Pregunta [][] preguntas= new Pregunta [5][5];
    private static Jugador [] jugadores= new Jugador[10];
    private Categoria [] cat= new Categoria [5];
    private int posPre;
    private int indice;
    private int correctas;
    private Pregunta asignar;
    private static int cantJug;
    
    public Juego() {
        
        
        cat[0]= new Categoria(1, "Arte");
        cat[1]= new Categoria(2, "Música");
        cat[2]= new Categoria(3, "Cine");
        cat[3]= new Categoria(4, "Deporte");
        cat[4]= new Categoria(5, "Literatura");
        
        preguntas[0][0]= new Pregunta(1,"¿En cuál país se encuentra la obra artística Tlaltecuhtli?", 
                                        new String []{"México", "Perú", "Colombia"},0);
        preguntas[0][1]= new Pregunta(2,"¿Quien pintó la obra La Santa cena?", 
                                        new String [] {"Miguel Ángel", "Da Vinci", "Van Gogh"},1);
        preguntas[0][2]= new Pregunta(3,"¿Quien creó La noche estrellada?", 
                                        new String [] {"Monet", "Miguel Ángel", "Van Gogh"}, 2);
        preguntas[0][3]= new Pregunta(4,"¿Cuál fue el autor de El Grito?", 
                                        new String[]{"Giotto","Edvard Munch","Tiziano" }, 1);
        preguntas[0][4]= new Pregunta(5,"¿Quién fue el autor de la obra El Juicio Final",
                                        new String []{"Miguel Ángel", "Sandro Botticelli", "Alberto Durero"}, 0);
        
        preguntas[1][0]= new Pregunta(1, "¿Qué banda tocó Bohemian Rhapsody?", 
                                        new String []{"Queen", "AC/DC", "The Beatles"}, 0);
        preguntas[1][1]= new Pregunta(2, "¿Cuál fue la canción TOP 1 del 2017?", 
                                        new String []{"Despacito", "Believer", "Wolves"}, 0);
        preguntas[1][2]= new Pregunta(3, "A que banda pertenece Girls like you", 
                                        new String [] {"Coldplay", "Maroon 5", "Imagine Dragons"}, 1);
        preguntas[1][3]= new Pregunta(4, "¿Cúal cantante utilizó un vestid de carne?", 
                                        new String []{"Katy Perry", "Miley Cyrus", "Lady Gaga"}, 2);
        preguntas[1][4]= new Pregunta(5, "¿Cuál artista canta Flor Pálida?", 
                                        new String []{"Romeo Santos", "Carlos Vives", "Marc Anthony"}, 2);
        
        preguntas[2][0]= new Pregunta(1, "¿Cuál es la actríz con más premios Óscar?", 
                                        new String[] {"Meryl Streep", "Katherine Hepburn","Ingrid Bergman"}, 1);
        preguntas[2][1]= new Pregunta(2, "¿Cuantas estatuillas ha ganado Tom Hanks en los premios Oscar?", 
                                        new String []{"2","1","3"}, 0);
        preguntas[2][2]= new Pregunta(3, "¿Cuál actor protagoniza la película Titanic?", 
                                        new String []{"Billy Zane","David Warner", "Leonardo DiCaprio"}, 2);
        preguntas[2][3]= new Pregunta(4, "¿En qué año se estreno la película Avatar?", 
                                        new String[]{"2006","2009","2000"}, 1);
        preguntas[2][4]= new Pregunta(5, "¿Cuál de estás películas esta basada en un cómic?", 
                                        new String []{"Civil War","Maze Runner", "Divergente"}, 0);
        
        preguntas[3][0]= new Pregunta(1, "¿Cuál jugador ganó el Balón de Oro en la Copa de Mundo 2002 ?", 
                                        new String[] {"Oliver Kahn", "Landon Donovan","Ronaldo"}, 0);
        preguntas[3][1]= new Pregunta(2, "¿Cuántas Champions League ha ganado el Barcelona?", 
                                        new String []{"3","8","5"}, 2);
        preguntas[3][2]= new Pregunta(3, "¿Quién ganó el balón de Oro en el 2018?", 
                                        new String []{"Luka Modric","Kylian Mbappé", "Lionel Messi"}, 0);
        preguntas[3][3]= new Pregunta(4, "¿Donde se va a realizar La Copa del Mundo 2022?", 
                                        new String[]{"Catar","México","Korea"}, 0);
        preguntas[3][4]= new Pregunta(5, "¿Quién ganó el balón de Oro en el 2010?", 
                                        new String []{"Wesley Sneijder","Andrés Iniesta", "Lionel Messi"}, 2);
        
        preguntas[4][0]= new Pregunta(1, "¿Quién escribió La Ilíada ?", 
                                        new String[] {"Marco Tulio Cicerón", "Homero","Séneca"}, 1);
        preguntas[4][1]= new Pregunta(2, "¿Quién escribió Frankenstein ?", 
                                        new String []{"Adele Gerhard","Jane Austin","Mary Shelley"}, 2);
        preguntas[4][2]= new Pregunta(3, "¿Cuál saga fue escrita por J. K. Rowling?", 
                                        new String []{"El señor de los anillos","Los juegos del Hambre", "Harry Potter"}, 2);
        preguntas[4][3]= new Pregunta(4, "¿Cuál fue el número más vendido en los últimos 50 años?", 
                                        new String[]{"Don Quijote","La Biblia","Harry Potter"}, 1);
        preguntas[4][4]= new Pregunta(5, "¿En qué año fue publicado Anna Frank?", 
                                        new String []{"1947","1955", "1945"}, 0);
    }
    
    public Pregunta enviarPregunta(int indice){
        boolean indicador=true;
        this.indice=indice;     
        posPre=(int)((Math.random()*5));
        while(indicador){
            if(preguntas[indice][posPre].getAlterna()){              
                preguntas[indice][posPre].setAlterna(false);
                asignar=preguntas[indice][posPre];
                indicador=false;
            }
            else{
                posPre=(int)((Math.random()*5));                
            }
           
        }
        
        return asignar ;
    }
    
    public boolean respuestaCorrecta(int asignaRes){
        boolean men;
        if(this.preguntas[indice][posPre].getRespCorrecta()==asignaRes){
            correctas++;
            preguntas[indice][posPre].setRespCorrecta(getCorrectas());
            men=true;
        }
        else{
            men=false;
        }
        return men;
    }
    
    public void ganador(String nombre){
    jugadores[0]= new Jugador(nombre, correctas);
    Jugador ganador;
        for(int i = 0; i<jugadores.length-1; i++){
            for(int j=0; j< jugadores.length-1-i; j++){
                if(jugadores[j].getPuntuaje()<jugadores[j+1].getPuntuaje()){
                    ganador=jugadores[j];
                    jugadores[j]=jugadores[j+1];
                    jugadores[j+1]=ganador;
                }
            }
        }
    }
  
    public String toString(){
        String hilera="Jugadadores " + " Puntos\n ";
        for(int i=0; i<jugadores.length; i++){
            hilera+= jugadores[i].toString();
        }
        return hilera;
    }

    public void setCat(Categoria[] cat) {
        this.setCat(cat);
    }

    public Categoria[] getCat() {
        return cat;
    }

    public int getCorrectas() {
        return correctas;
    }
    
}
