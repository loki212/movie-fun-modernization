package org.superbiz.moviefun.albumapi;

import org.springframework.web.client.RestOperations;
import org.springframework.core.ParameterizedTypeReference;
import static org.springframework.http.HttpMethod.GET;

import java.util.List;

public class AlbumClient {

    private String albumsUrl;
    private RestOperations restOperations;

    public AlbumClient(String albumsUrl, RestOperations restOperations) {
        this.albumsUrl = albumsUrl;
        this.restOperations = restOperations;
    }

    public void addAlbum(AlbumDTO album) {
        restOperations.postForEntity(albumsUrl, album, AlbumDTO.class);
    }

    public AlbumDTO find(long id) {
        return restOperations.getForEntity(albumsUrl + "/" + id, AlbumDTO.class).getBody();
    }

    public List<AlbumDTO> getAlbums() {
        ParameterizedTypeReference<List<AlbumDTO>> albumListType = new ParameterizedTypeReference<List<AlbumDTO>>() {
        };

        return restOperations.exchange(albumsUrl, GET, null, albumListType).getBody();
    }

}
