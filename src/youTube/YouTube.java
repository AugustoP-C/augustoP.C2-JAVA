package youTube;

public class YouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 12 de php");
        v[2] = new Video("Aula 10 HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuaza", 12, "F", "creuzita");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(v[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(v[0].toString());
        /*vis[2] = new Visualizacao();
        vis[3] = new Visualizacao();
        vis[4] = new Visualizacao();*/

        System.out.println("VIDEOS\n------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
    }
}
