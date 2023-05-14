package de.exware.gplatform.io;

import java.io.IOException;

public interface GPFileSystem
{
    /**
     * Get an Array of FileSystem Roots. Implementation must make sure, that no files outside of this roots 
     * are accessible.
     * @return
     */
    public GPFile[] getRoots();
    
    /**
     * Provides a List of Files in the given Directory.
     * @param parent
     * @return
     * @throws IOException 
     */
    public GPFile[] listFiles(GPFile parent) throws IOException;
}
