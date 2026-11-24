package br.ufpb.dcx.luis.jose.luis.musicApp;

public interface InterfaceMusicApp
{
    Band searchBandFromDATAWithName(String strBandName);
    void addNewBandToDATA(Band bandToAdd);
    void removeBandFromDATAWithName(String strBandName);

    Album searchAlbumFromBandWithName(String strAlbumName, Band bandToSearch);
    void addNewAlbumToBand(Album albumToAdd, Band bandToAddAlbum);
    void removeAlbumFromBand(Album albumToBeRemoved, Band bandToRemoveAlbum);

    Music searchMusicFromAlbumWithName(String strMusicName, Album albumToSearch);
    void addNewMusicToALbum(Music musicToAdd, Album albumToAddMusic);
    void removeMusicFromAlbum(Music musicToBeRemoved, Album albumToRemoveMusic);
}
