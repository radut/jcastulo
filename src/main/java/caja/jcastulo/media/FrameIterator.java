package caja.jcastulo.media;

import caja.jcastulo.media.entities.AudioMedia;
import java.io.IOException;

/**
 * 
 * @author Carlos Juarez
 */
public interface FrameIterator {

    /**
     * Returns true if this reader supports the format of the given media.
     *
     * @param media
     * @return
     */
    public boolean supports(AudioMedia media);

    /**
     * Opens the media file. Performs startup code
     *
     * @param media
     * @throws IOException
     */
    public void open(AudioMedia media) throws IOException;

    /**
     * Reads one frame of the media.
     *
     * @param frame
     * @return
     * @throws IOException
     */
    public Frame next() throws IOException;

    /**
     * Closes the media. Performs cleanup code
     *
     * @throws IOException
     */
    public void close() throws IOException;

    /**
     * Returns true if the end of the media is reached.
     *
     * @return
     */
    public boolean hasNext();

    /**
     * Returns information about the media, artist, title. This function can be
     * called multiple times but it only needs to have valid metadata after open
     * has been called. It must never return null.
     *
     * @return
     */
//    public SongMetadata getMetadata();
    
}
