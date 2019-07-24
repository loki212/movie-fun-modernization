package org.superbiz.moviefun.albumapi;


import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
public class AlbumFixtures {

    public List<AlbumDTO> load() {
        return asList(
            new AlbumDTO("Massive Attack", "Mezzanine", 1998, 9),
            new AlbumDTO("Radiohead", "OK Computer", 1997, 8),
            new AlbumDTO("Radiohead", "Kid A", 2000, 9)
        );
    }
}
