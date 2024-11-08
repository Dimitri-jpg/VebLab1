package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Artist> lista_artisti = new ArrayList<>();
    public static List<Song> lista_pesni = new ArrayList<>();

    @PostConstruct
    public void init() {
        lista_artisti.add(new Artist (11L, "Marshall", "Mathers", "Last Project: 2024"));
        lista_artisti.add(new Artist (135L, "Lil", "Uzi", "Last Project: 2024"));
        lista_artisti.add(new Artist (119L, "Don", "Toliver", "Last Project: 2024"));
        lista_artisti.add(new Artist (999L, "Roddy", "Ricch", "Last Project: 2023"));
        lista_artisti.add(new Artist (16L, "Travis", "Scott", "Last Project: 2023"));

        lista_pesni.add(new Song("011", "Stan", "Rap", 2000));
        lista_pesni.add(new Song("135", "Patience", "RnB", 2023));
        lista_pesni.add(new Song("119", "4x4", "RnB", 2024));
        lista_pesni.add(new Song("999", "The Box", "Hip Hop", 2019));
        lista_pesni.add(new Song("016", "I KNOW?", "Hip Hop", 2023));
    }

}
