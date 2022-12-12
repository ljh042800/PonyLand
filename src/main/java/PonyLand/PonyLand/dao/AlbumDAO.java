package PonyLand.PonyLand.dao;

import PonyLand.PonyLand.Mapper.AlbumMapper;
import PonyLand.PonyLand.dto.AlbumDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlbumDAO {

    @Autowired
    AlbumMapper albumMapper;

    public int insert(AlbumDTO dto ) {
        System.out.println(dto.getAlbum_contents()+":"+dto.getAlbum_title());
        return albumMapper.insert(dto);
    }

    public List<AlbumDTO> selectAll(){
        return albumMapper.selectAll();
    }
    public int delete(int Album_seq) {
        return albumMapper.delete(Album_seq);
    }
    public int update(AlbumDTO dto) {
        return albumMapper.update(dto);
    }

}