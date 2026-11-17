package br.ufpb.dcx.luis.jose.luis.musicApp;

public interface InterfaceMusicApp
{
    Band searchBandFromDATAWithName(String strBandName);
    void addNewBandToDATA(Band bandToAdd);
    void removeBandFromDATAWithName(String strBandName);

    Album searchAlbumFromBandWithName(String strAlbumName, Band bandToSearch);
    void addNewAlbumToBand(Album albumToAdd, Band bandToAddAlbum);
    void removeAlbumFromBand(String strAlbumName, Band bandToRemoveAlbum);
}
