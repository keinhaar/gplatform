package de.exware.gplatform.io;

/**
 * Client Side Interface.
 * @author martin
 */
public interface GPFileSystemAsync
{
    void getRoots(Callback callback);

    void listFiles(GPFile parent, Callback callback);

    public interface Callback
    {
        public void onSuccess(GPFile[] fileData);
        public void onError(Throwable t);
    }
}
