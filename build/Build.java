import java.io.File;
import java.io.IOException;

import de.exware.nobuto.java.JavaBuilder;
import de.exware.nobuto.maven.Maven;
import de.exware.nobuto.utils.Utilities;

public class Build extends JavaBuilder
{
    private static final String PROJECTNAME = "de.exware.gplatform";
    
    private File jarFile = new File("dist/" + PROJECTNAME + ".jar");
    
    public Build()
    {
        super();
    }

    @Override
    public void dist() throws Exception
    {
        super.dist();
        jarFile.getParentFile().mkdir();
        jar(jarFile.getAbsolutePath(), "out", null);
    }
    
    public void installToMaven() throws Exception
    {
        clean();
        dist();
        Maven.getDefaultinstance().installJar(jarFile, "de.exware", PROJECTNAME, getVersion());
    }

    private void clean() throws IOException
    {
        Utilities.delete(new File("dist"));
    }
}
